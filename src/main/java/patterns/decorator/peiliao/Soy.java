package patterns.decorator.peiliao;

import patterns.decorator.Beverage;
import patterns.decorator.CondimentDecorator;

/**
 * Created by liumeng on 2016/4/9.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double coast() {
        return .11 + beverage.coast();
    }
}
