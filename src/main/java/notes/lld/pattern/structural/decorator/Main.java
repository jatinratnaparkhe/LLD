package notes.lld.pattern.structural.decorator;

import notes.lld.pattern.structural.decorator.decorators.ExtraCheese;
import notes.lld.pattern.structural.decorator.decorators.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza margheritaPizza = new Margherita();
        BasePizza mushroomPizza = new Mushroom(new Margherita());
        BasePizza mushroomVegCheesePizza = new ExtraCheese(new Mushroom(new VegDelight()));
        int totalBill = margheritaPizza.cost() + mushroomPizza.cost() + mushroomVegCheesePizza.cost();
        System.out.println("Margherita Pizza: " + margheritaPizza.cost());
        System.out.println("Margherita Pizza + Mushroom: " + mushroomPizza.cost());
        System.out.println("VegDelight Pizza + Mushroom + Extra Cheese: " + mushroomVegCheesePizza.cost());
        System.out.println();
        System.out.println("Total Cost: " + totalBill + " Rs");
    }
}
