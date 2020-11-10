package dev.jsemple.springbootbackend.service;

import java.util.List;

import dev.jsemple.springbootbackend.dto.model.PostDto;

public interface PostService {

    /**
     * Finds all visible {@link Post}s 
     *
     * @return the {@link List} of {@link PostDto}s representing the visible {@link Post}s
     */
    List<PostDto> findAllVisiblePosts();

    /**
     * Finds a visible {@link Post} by identifier
     *
     * @param identifier the identifier to search for
     * @return the {@link PostDto} representing the {@link Post}
     */
    PostDto findVisiblePostByIdentifier(String identifier);
}