package AbstractFactoryPattern.CheckBoxFeature;

public class MacCheckBox implements CheckBox{
    @Override
    public void check() {
        System.out.println("Mac CheckBox");
    }
}
