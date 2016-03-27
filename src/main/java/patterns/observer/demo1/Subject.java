package patterns.observer.demo1;

import java.rmi.registry.Registry;

/**
 * Created by liumeng on 2016/3/27.
 */
public interface Subject {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
