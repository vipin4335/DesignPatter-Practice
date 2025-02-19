package FactoryDesignPattern;

public class PhoneCallNotification implements Notification{
    @Override
    public void notifyMessage() {
        System.out.println("notify through call");
    }
}
