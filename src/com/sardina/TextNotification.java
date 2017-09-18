package com.sardina;

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() { return recipient; }

    public String getSmsProvider() { return smsProvider; }


//Override of NoTransportException
    @Override
    public void transport() {
        System.out.println("OVERRIDE of NoTransportException:: TextNotification recipient: " + getRecipient() + " | getSmsProvider: " + getSmsProvider() + " | Created at: " + getCreatedAt() + ".");
    }
}