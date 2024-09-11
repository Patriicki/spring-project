package com.spring_project.service.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Long id) {
        super("Resource not found. Id " + id);
    }
}
