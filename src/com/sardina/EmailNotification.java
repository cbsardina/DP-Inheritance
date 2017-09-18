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

//Override NoTransportException
    @Override
    public void transport() {
        System.out.println("OVERRIDE of NoTransportException:: EmailNotification recipient: " + getRecipient() + " | smtpProvider: " + getSmtpProvider() + " | Created at: " + getCreatedAt() + ".");
    }

//Override textPrinter()
    @Override
    public String textPrinter() {
        return super.textPrinter() + " AND THIS IS TEXT WRITEN AFTER THE textPrinter METHOD FROM THE SUPERCLASS NOTIFICATION WRITTEN FROM THE EmailNotification SUBCLASS.";
    }

//equals, hashcode, and clone of emailNotification constructor
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (getRecipient() != null ? !getRecipient().equals(that.getRecipient()) : that.getRecipient() != null)
            return false;
        return getSmtpProvider() != null ? getSmtpProvider().equals(that.getSmtpProvider()) : that.getSmtpProvider() == null;
    }

    @Override
    public int hashCode() {
        int result = getRecipient() != null ? getRecipient().hashCode() : 0;
        result = 31 * result + (getSmtpProvider() != null ? getSmtpProvider().hashCode() : 0);
        return result;
    }

    protected Object clone(EmailNotification emailNotification) {
        Object tempObject;
        tempObject = emailNotification;
        return tempObject;
    }
}
