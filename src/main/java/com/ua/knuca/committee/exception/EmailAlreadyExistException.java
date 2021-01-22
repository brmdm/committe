package com.ua.knuca.committee.exception;

public class EmailAlreadyExistException extends Exception{
    public EmailAlreadyExistException(String email) {
        super("Email \""+ email + "\" is already exist");
    }
}
