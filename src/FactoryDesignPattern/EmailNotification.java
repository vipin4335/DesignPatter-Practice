package FactoryDesignPattern;

public class EmailNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("Notifying through email");
    }
}
