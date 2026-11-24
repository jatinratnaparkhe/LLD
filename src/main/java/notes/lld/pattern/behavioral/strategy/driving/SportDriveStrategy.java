package notes.lld.pattern.behavioral.strategy.driving;

public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Driving");
    }
}
