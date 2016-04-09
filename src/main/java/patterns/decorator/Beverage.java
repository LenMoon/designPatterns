package patterns.decorator;

/**
 * Created by liumeng on 2016/4/9.
 */
public abstract class Beverage {
    String description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double coast();

}
