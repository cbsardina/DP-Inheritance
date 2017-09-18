package com.sardina;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "All's Good...!";
    }

    public String getRecipient() { return recipient; }

    public String getSmtpProvider() { return smtpProvider; }


    @Override
    public void transport() {
        System.out.println("EmailNotification recipient: " + getRecipient() + " | smtpProvider: " + getSmtpProvider() + " | Created at: " + getCreatedAt() + ".");
    }

    @Override
    public String textPrinter() {
        return super.textPrinter() + " AND THIS IS TEXT WRITEN AFTER THE textPrinter METHOD FROM THE SUPERCLASS NOTIFICATION WRITTEN FROM THE EmailNotification SUBCLASS.";

    }
}