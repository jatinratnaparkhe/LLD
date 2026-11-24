package notes.lld.pattern.behavioral.observer;

import notes.lld.pattern.behavioral.observer.observers.StockObserver;

public interface Observable {
    void addObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers();
}
