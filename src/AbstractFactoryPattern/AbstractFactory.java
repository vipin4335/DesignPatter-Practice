package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.GuiFactory;
import AbstractFactoryPattern.Factory.MacFactory;
import AbstractFactoryPattern.Factory.WindowsFactory;

public class AbstractFactory {
    public static GuiFactory getFactory(String type) {
        if (type.equalsIgnoreCase("Windows")) {
            return new WindowsFactory();
        } else if (type.equalsIgnoreCase("Mac")) {
            return new MacFactory();
        }
        throw new IllegalArgumentException("Invalid Factory Type");
    }
}
