package dev.jsemple.springbootbackend.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dev.jsemple.springbootbackend.dto.model.PostDto;
import dev.jsemple.springbootbackend.model.Post;

@Component
public class PostMapper {

    public static PostDto toPostDto(Post post) {
        return new PostDto()
                .setIdentifier(post.getIdentifier())
                .setTitle(post.getTitle())
                .setBody(post.getBody())
                .setCreatedOn(post.getCreatedOn())
                .setUpdatedOn(post.getUpdatedOn());
    }

    public static List<PostDto> toPostDtos(List<Post> posts) {
        return posts.stream()
            .map(post -> toPostDto(post))
            .collect(Collectors.toList());
    }
}