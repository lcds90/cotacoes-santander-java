package com.project.santanderbootcamp.exceptions;

public class ExceptionsResponse {
    private String message;

    public ExceptionsResponse(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
