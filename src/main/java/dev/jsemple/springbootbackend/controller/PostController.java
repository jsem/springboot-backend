package dev.jsemple.springbootbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.jsemple.springbootbackend.dto.model.PostDto;
import dev.jsemple.springbootbackend.service.PostService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/post")
public class PostController {

    private final PostService postService;
  
    /**
     * Retrieves all visible {@link Post}s from the database
     * @return {@link List} of {@link Post}s from the database
     */
    @GetMapping("")
    List<PostDto> retrieveAllPosts() {
        return postService.findAllVisiblePosts();
    }
  
    /**
     * Retrieves the visible {@link Post} with the given identifier from the database
     * @param identifier the identifier of the {@link Post} to retrieve
     * @return {@link Post} from the database
     * @throws {@link PostNotFoundException} if the visible {@link Post} with the given identifier cant be found
     */
    @GetMapping("/{identifier}")
    PostDto retrievePost(@PathVariable(value="identifier") String identifier) {
        return postService.findVisiblePostByIdentifier(identifier);
    }
}