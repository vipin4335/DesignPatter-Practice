package ObserverDesignPattern.Observable;

import ObserverDesignPattern.NotificationObserver;

public interface StockObservable {

     void add(NotificationObserver obj);
    void remove(NotificationObserver obj);
     void notifyObserver();
    void setStockCount(int newStockAdded);
     int getStockCount();

}
