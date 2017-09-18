package com.sardina;

public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification("Java Class", "This is the email body", "Calvin", "calvin@tiy.com");
        TextNotification textNotification = new TextNotification("Java Assignment", "This is the email body about the java assignment", "Calvin", "Verizon");
        System.out.println(" --------------------------------- ");

    //call the transport() method
        emailNotification.transport();
        textNotification.transport();
        System.out.println(" --------------------------------- ");

    //protected variable
        emailNotification.showStatus();
        textNotification.showStatus();
        System.out.println(" --------------------------------- ");

    //protected methods
        System.out.println(textNotification.textPrinter());
        System.out.println(emailNotification.textPrinter());
        System.out.println(" --------------------------------- ");

    //other objects to override - clone emailNotification & check
        Object emailNotificationClone = emailNotification.clone(emailNotification);
        boolean isEqual = emailNotification.equals(emailNotificationClone);
        System.out.println("Object emailNotification is cloned: " + isEqual);
    }
}
