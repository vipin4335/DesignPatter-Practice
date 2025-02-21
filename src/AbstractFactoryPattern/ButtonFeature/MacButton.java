package AbstractFactoryPattern.ButtonFeature;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Mac Button");
    }
}
