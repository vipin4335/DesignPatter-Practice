package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StockObservable;

public class ObservalbeDesignpattern {
    //just call this to run observer design pattern
    public void Designpattern()
    {
        StockObservable iphoneObervable =new IphoneObservableImpl();
        NotificationObserver emailObserver=new EmailObserver("vipin@gmail.com",iphoneObervable);
        iphoneObervable.add(emailObserver);
        NotificationObserver mobileObserver=new MobileAlertObserver(iphoneObervable,"vipin_4335");
        iphoneObervable.add(mobileObserver);
        iphoneObervable.setStockCount(50);
    }

}
