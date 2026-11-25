package notes.lld.pattern.creational.abstractfactory.factories;

import notes.lld.pattern.creational.abstractfactory.Button;
import notes.lld.pattern.creational.abstractfactory.CheckBox;
import notes.lld.pattern.creational.abstractfactory.MacOsButton;
import notes.lld.pattern.creational.abstractfactory.MacOsCheckBox;

public class MacOsFactory implements GuiFactory {
    @Override
    public Button getButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new MacOsCheckBox();
    }
}
