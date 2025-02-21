package AbstractFactoryPattern.ButtonFeature;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Window Button");
    }
}
