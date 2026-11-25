package notes.lld.pattern.creational.abstractfactory.factories;

import notes.lld.pattern.creational.abstractfactory.OsType;

public class OsGuiFactory {
    private OsGuiFactory() {
    }

    public static GuiFactory getGuiFactory(OsType os) {
        return switch (os) {
            case MAC_OS -> new MacOsFactory();
            case WINDOWS -> new WindowsFactory();
            case null -> throw new IllegalArgumentException("Null values are not supported");
        };
    }
}
