package notes.lld.pattern.behavioral.strategy.driving;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
