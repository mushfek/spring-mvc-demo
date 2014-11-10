package com.mushfek.springmvcdemo.common.exception;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
public class UserNotFoundByNameException extends RuntimeException {
    public UserNotFoundByNameException() {
        super("User not found with this name");
    }

    public UserNotFoundByNameException(String message) {
        super(message);
    }
}
