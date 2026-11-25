package notes.lld.pattern.creational.abstractfactory;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("MacOS: CheckBox Marked");
    }
}
