package dev.jsemple.springbootbackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.jsemple.springbootbackend.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    @Query("SELECT p FROM Post p WHERE p.visible = TRUE")
    List<Post> findAllVisible();

    @Query("SELECT p FROM Post p WHERE p.visible = TRUE AND p.identifier = :identifier")
    Optional<Post> findVisibleByIdentifier(String identifier);
}