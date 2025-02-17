package ObserverDesignPattern.Observable;

import ObserverDesignPattern.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    List<NotificationObserver> notificationObservers=new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationObserver obj) {
       notificationObservers.add(obj);
    }

    @Override
    public void remove(NotificationObserver obj) {
        notificationObservers.remove(obj);

    }

    @Override
    public void notifyObserver() {
        for(NotificationObserver observer:notificationObservers)
        {
            observer.update();
        }
    }
    public void setStockCount(int newStockAdded)
    {
        stockCount+=newStockAdded;
        if(stockCount!=0)
            notifyObserver();
    }
    public int getStockCount()
    {
        return stockCount;
    }
}
