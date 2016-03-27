package patterns.observer.demo1;

/**
 * Created by liumeng on 2016/3/27.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressqre;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    public void update(float temp, float humidity, float pressqre) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressqre = pressqre;
        display();
    }

    public void display() {
        SimplePrint.print("目前状态布告板",this);
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressqre=" + pressqre +
                '}';
    }
}
