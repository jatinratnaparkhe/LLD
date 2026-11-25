package notes.lld.pattern.creational.abstractfactory.factories;

import notes.lld.pattern.creational.abstractfactory.Button;
import notes.lld.pattern.creational.abstractfactory.CheckBox;

public interface GuiFactory {
    Button getButton();
    CheckBox getCheckBox();
}
