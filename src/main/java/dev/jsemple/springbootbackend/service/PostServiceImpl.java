package dev.jsemple.springbootbackend.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import dev.jsemple.springbootbackend.dto.mapper.PostMapper;
import dev.jsemple.springbootbackend.dto.model.PostDto;
import dev.jsemple.springbootbackend.exception.PostNotFoundException;
import dev.jsemple.springbootbackend.repository.PostRepository;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public List<PostDto> findAllVisiblePosts() {
        return PostMapper.toPostDtos(postRepository.findAllVisible());
    }

    @Override
    public PostDto findVisiblePostByIdentifier(String identifier) {
        return PostMapper.toPostDto(postRepository.findVisibleByIdentifier(identifier)
            .orElseThrow(() -> new PostNotFoundException(identifier)));
    }
}