package patterns.observer.demo1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumeng on 2016/3/27.
 */
public class WeatherData implements Subject
{
    private float temperture;
    private float humidity;
    private float pressure;
    //observerList的注册表
    private List<Observer> observerList = new LinkedList<Observer>();


    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(getTemperture(),getHumidity(),getPressure());
        }
    }

    /**
     * 当温度更新会调用此方法
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public float getTemperture() {
        return temperture;
    }

    public void setTemperture(float temperture) {
        this.temperture = temperture;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


}
