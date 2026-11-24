package notes.lld.pattern.behavioral.observer;

import notes.lld.pattern.behavioral.observer.observers.EmailObserver;
import notes.lld.pattern.behavioral.observer.observers.SmsObserver;
import notes.lld.pattern.behavioral.observer.observers.StockObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphone = new IphoneStockObservable();
        StockObserver email = new EmailObserver();
        StockObserver sms = new SmsObserver();
        iphone.addObserver(email);
        iphone.addObserver(sms);
        iphone.setStock(5);
        System.out.println("Iphone is again Out Of Stock!");
        iphone.outOfStock();
        System.out.println("Email notification is disabled by User");
        iphone.removeObserver(email);
        iphone.setStock(10);
    }
}
