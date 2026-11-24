package notes.lld.pattern.behavioral.observer;

import notes.lld.pattern.behavioral.observer.observers.StockObserver;

public interface StockObservable extends Observable {
    void setStock(int quantity);
    void outOfStock();
}
