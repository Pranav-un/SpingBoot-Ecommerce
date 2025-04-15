package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    String resourceName;
    String filed;
    String filedName;
    Long filedId;

    public ResourceNotFoundException() {

    }

    public ResourceNotFoundException(String resourceName, String filed, String filedName) {
        super(String.format("%s not found %s: %s", resourceName, filed, filedName));
        this.resourceName = resourceName;
        this.filed = filed;
        this.filedName = filedName;
    }

    public ResourceNotFoundException(String resourceName, String filed,  Long filedId) {
        super(String.format("%s not found %s: %d", resourceName, filed, filedId));
        this.filed = filed;
        this.resourceName = resourceName;
        this.filedId = filedId;
    }
}
