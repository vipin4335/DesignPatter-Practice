package ObserverDesignPattern;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationObserver {
    StockObservable observable;
    String userName;

    public MobileAlertObserver(StockObservable observable, String userName) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        System.out.println("notification through Mobile"+userName);
    }
}
