package notes.lld.pattern.creational.abstractfactory;

import notes.lld.pattern.creational.abstractfactory.factories.GuiFactory;
import notes.lld.pattern.creational.abstractfactory.factories.OsGuiFactory;

public class Main {
    public static void main(String[] args) {
        GuiFactory macOsFactory = OsGuiFactory.getGuiFactory(OsType.MAC_OS);
        GuiFactory windowsFactory = OsGuiFactory.getGuiFactory(OsType.WINDOWS);
        Button macButton = macOsFactory.getButton();
        CheckBox macCheckBox = macOsFactory.getCheckBox();
        Button windowsButton = windowsFactory.getButton();
        CheckBox windowsCheckBox = windowsFactory.getCheckBox();
        System.out.println("Apple MAC-OS");
        macButton.paint();
        macCheckBox.paint();
        System.out.println("Microsoft WINDOWS");
        windowsButton.paint();
        windowsCheckBox.paint();
    }
}
