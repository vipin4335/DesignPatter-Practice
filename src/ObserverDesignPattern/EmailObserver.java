package ObserverDesignPattern;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailObserver implements NotificationObserver{
    String email;
    StockObservable observable;

    public EmailObserver(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("sended email"+email);
    }
}
