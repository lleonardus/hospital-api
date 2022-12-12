package com.leonardus.hospital.service.exceptions;

public class ObjectNotFoundException extends RuntimeException{
    public ObjectNotFoundException() {
        super("Could not find client");
    }
}
