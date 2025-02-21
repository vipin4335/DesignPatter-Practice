package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.ButtonFeature.Button;
import AbstractFactoryPattern.ButtonFeature.WindowsButton;
import AbstractFactoryPattern.CheckBoxFeature.CheckBox;
import AbstractFactoryPattern.CheckBoxFeature.WindowsCheckBox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button button() {
        return new WindowsButton();
    }

    @Override
    public CheckBox checkBox() {
        return new WindowsCheckBox();
    }
}
