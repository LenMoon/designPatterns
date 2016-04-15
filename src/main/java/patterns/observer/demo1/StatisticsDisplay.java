package patterns.observer.demo1;


/**
 * Created by liumeng on 2016/3/27.
 * 气象统计布告板
 */
public class StatisticsDisplay implements Observer,DisplayElement{
    private Subject subject;
    private float temp;
    private float humidity;
    private float pressqre;


    public StatisticsDisplay(Subject subject) {
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
        SimplePrint.print("气象统计布告板",this);
    }

    @Override
    public String toString() {
        return "StatisticsDisplay{" +
                ", temp=" + temp +
                ", humidity=" + humidity +
                ", pressqre=" + pressqre +
                '}';
    }
}
