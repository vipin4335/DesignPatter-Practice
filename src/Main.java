
import Decoratorpattern.Decorators.Cheese;
import Decoratorpattern.Items.BasePizza;
import Decoratorpattern.Items.FarmHouse;
import FactoryDesignPattern.Notification;
import FactoryDesignPattern.NotificationFactory;


public class Main {
    public static void main(String[] args) {
//        BasePizza pizza=new Cheese(new Cheese(new FarmHouse()));
//        System.out.println(pizza.cost());
        Notification notification= NotificationFactory.createNotification("message");
        notification.notifyMessage();
    }
}