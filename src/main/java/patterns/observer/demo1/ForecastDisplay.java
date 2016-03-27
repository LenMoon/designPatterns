package patterns.observer.demo1;

/**
 * Created by liumeng on 2016/3/27.
 */
public class ForecastDisplay implements Observer,DisplayElement {
    private Subject subject;
    private float temp;
    private float humidity;
    private float pressqre;

    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    public void display() {
        SimplePrint.print("天气预报布告板",this);
    }

    public void update(float temp, float humidity, float pressqre) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressqre = pressqre;
        display();
    }

    @Override
    public String toString() {
        return "ForecastDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressqre=" + pressqre +
                '}';
    }
}
