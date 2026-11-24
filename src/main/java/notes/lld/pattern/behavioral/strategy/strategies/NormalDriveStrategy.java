package notes.lld.pattern.behavioral.strategy.strategies;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
