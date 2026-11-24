package notes.lld.pattern.behavioral.strategy;

import notes.lld.pattern.behavioral.strategy.strategies.NormalDriveStrategy;
import notes.lld.pattern.behavioral.strategy.strategies.SportDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle(new NormalDriveStrategy());
        Vehicle racecar = new Vehicle(new SportDriveStrategy());
        System.out.print("Truck starts: ");
        truck.drive();
        System.out.print("Racecar starts: ");
        racecar.drive();
        System.out.println("Racecar used as a passenger car:");
        racecar.setStrategy(new NormalDriveStrategy());
        System.out.print("Racecar(normal mode) starts: ");
        racecar.drive();
    }
}
