
import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ButtonFeature.Button;
import AbstractFactoryPattern.CheckBoxFeature.CheckBox;
import AbstractFactoryPattern.Factory.GuiFactory;
import Decoratorpattern.Decorators.Cheese;
import Decoratorpattern.Items.BasePizza;
import Decoratorpattern.Items.FarmHouse;
import FactoryDesignPattern.Notification;
import FactoryDesignPattern.NotificationFactory;


public class Main {
    public static void main(String[] args) {
//        BasePizza pizza=new Cheese(new Cheese(new FarmHouse()));
//        System.out.println(pizza.cost());\

//        Notification notification= NotificationFactory.createNotification("message");
//        notification.notifyMessage();

        GuiFactory factory= AbstractFactory.getFactory("Mac");
        Button button=factory.button();
        CheckBox checkBox=factory.checkBox();
        button.click();
        checkBox.check();
    }
}