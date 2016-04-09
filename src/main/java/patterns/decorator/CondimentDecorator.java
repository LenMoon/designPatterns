package patterns.decorator;

/**
 * Created by liumeng on 2016/4/9.
 */
public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    @Override

    public abstract String getDescription();
}
