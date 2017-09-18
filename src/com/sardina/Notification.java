package com.sardina;

public class Notification {

    private java.time.LocalDateTime createdAt;
    private String subject;
    private String body;

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }
}
