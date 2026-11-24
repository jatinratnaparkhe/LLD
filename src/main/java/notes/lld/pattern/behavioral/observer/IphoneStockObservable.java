package notes.lld.pattern.behavioral.observer;

import notes.lld.pattern.behavioral.observer.observers.StockObserver;

import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashSet;

public class IphoneStockObservable implements StockObservable {
    private final Set<StockObserver> observers = new LinkedHashSet<>();
    private int stock = 0;

    @Override
    public void addObserver(StockObserver observer) {
        this.observers.add(Objects.requireNonNull(observer));
    }

    @Override
    public void removeObserver(StockObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update("Iphone");
        }
    }

    @Override
    public void setStock(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Invalid stock");
        }
        boolean wasOutOfStock = (stock == 0);
        this.stock = quantity;
        if(wasOutOfStock && stock > 0) {
            notifyObservers();
        }
    }

    public void outOfStock() {
        this.stock = 0;
    }
}
