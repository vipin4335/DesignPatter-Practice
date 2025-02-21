package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.ButtonFeature.Button;
import AbstractFactoryPattern.CheckBoxFeature.CheckBox;

public interface GuiFactory {
    Button button();
    CheckBox checkBox();
}
