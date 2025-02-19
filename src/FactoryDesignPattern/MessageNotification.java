package FactoryDesignPattern;

public class MessageNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("Sending Message");
    }
}
