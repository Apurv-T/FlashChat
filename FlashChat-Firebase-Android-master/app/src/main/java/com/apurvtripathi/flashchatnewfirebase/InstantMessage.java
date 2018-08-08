package com.apurvtripathi.flashchatnewfirebase;

public class InstantMessage {
    private String message;
    private String author;

    public InstantMessage(String mess, String auth) {
        message = mess;
        author = auth;
    }

    public InstantMessage() {
    }
    String getMessage() {
        return message;
    }

    String getAuthor() {
        return author;
    }

    void setMessage(String message) {
        this.message = message;
    }

    void setAuthor(String author) {
        this.author = author;
    }
}
