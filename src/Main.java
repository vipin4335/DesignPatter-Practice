
import Decoratorpattern.Decorators.Cheese;
import Decoratorpattern.Items.BasePizza;
import Decoratorpattern.Items.FarmHouse;


public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new Cheese(new Cheese(new FarmHouse()));
        System.out.println(pizza.cost());
    }
}