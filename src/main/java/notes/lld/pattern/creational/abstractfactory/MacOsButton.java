package notes.lld.pattern.creational.abstractfactory;

public class MacOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS: Button Enabled");
    }
}
