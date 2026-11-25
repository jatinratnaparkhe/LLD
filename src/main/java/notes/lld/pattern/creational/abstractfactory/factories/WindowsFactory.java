package notes.lld.pattern.creational.abstractfactory.factories;

import notes.lld.pattern.creational.abstractfactory.Button;
import notes.lld.pattern.creational.abstractfactory.CheckBox;
import notes.lld.pattern.creational.abstractfactory.WindowsButton;
import notes.lld.pattern.creational.abstractfactory.WindowsCheckBox;

public class WindowsFactory implements GuiFactory {
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox getCheckBox() {
        return new WindowsCheckBox();
    }
}
