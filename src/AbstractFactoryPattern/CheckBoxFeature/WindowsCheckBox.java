package AbstractFactoryPattern.CheckBoxFeature;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Windows CheckBox");
    }
}
