package notes.lld.pattern.behavioral.strategy;

import notes.lld.pattern.behavioral.strategy.strategies.DriveStrategy;

import java.util.Objects;

public class Vehicle {
    private DriveStrategy strategy;
    Vehicle(DriveStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }
    public void drive() {
        strategy.drive();
    }
    public void setStrategy(DriveStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }
}
