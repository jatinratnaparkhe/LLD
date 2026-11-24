package notes.lld.pattern.behavioral.observer.observers;

public class SmsObserver implements StockObserver {
    @Override
    public void update(String product) {
        System.out.println("SMS: " + product + " is available!");
    }
}
