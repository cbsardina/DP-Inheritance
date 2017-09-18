package com.sardina;

import java.time.LocalDateTime;

public class Notification {

    private java.time.LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Status: Serious.";

  // ===== CONSTRUCTOR =====
    public Notification(String subject, String body) {
      this.subject = subject;
      this.body = body;
      createdAt = java.time.LocalDateTime.now();
  }

  // ===== METHODS =====
    public void showStatus() {
        System.out.println("Protected String 'status' : " + getStatus() + ".");
    }

    public void transport() {
        throw new NoTransportException("A NoTransportException has been thrown!!!");
    }

    protected String textPrinter() {
        return "This is just a method that is protected that prints out some text from the Notification method.";
    }


 // ===== GETTERS & SETTERS =====
    public String getStatus() { return status; }

    public void setStatus(java.lang.String status) { this.status = status; }

    public LocalDateTime getCreatedAt() {
        return createdAt = java.time.LocalDateTime.now();
    }

    public String getSubject() { return subject; }

    public String getBody() { return body; }

} //end Notification class

