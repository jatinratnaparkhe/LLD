package notes.lld.pattern.behavioral.observer.observers;

public class EmailObserver implements StockObserver {
    @Override
    public void update(String product) {
        System.out.println("Email: " + product + " is available!");
    }
}
