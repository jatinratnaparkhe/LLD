package notes.lld.pattern.behavioral.strategy.strategies;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Driving");
    }
}
