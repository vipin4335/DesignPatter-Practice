package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.ButtonFeature.Button;
import AbstractFactoryPattern.ButtonFeature.MacButton;
import AbstractFactoryPattern.CheckBoxFeature.CheckBox;
import AbstractFactoryPattern.CheckBoxFeature.MacCheckBox;

public class MacFactory implements GuiFactory{
    @Override
    public Button button() {
        return new MacButton();
    }

    @Override
    public CheckBox checkBox() {
        return new MacCheckBox();
    }
}
