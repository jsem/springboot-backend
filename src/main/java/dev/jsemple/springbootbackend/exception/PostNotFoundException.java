package dev.jsemple.springbootbackend.exception;

public class PostNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 8226012936625734525L;

    public PostNotFoundException(String identifier) {
        super("Could not find visible post with identifier " + identifier);
    }
}