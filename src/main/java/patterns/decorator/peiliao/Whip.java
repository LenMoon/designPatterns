package patterns.decorator.peiliao;

import patterns.decorator.Beverage;
import patterns.decorator.CondimentDecorator;

/**
 * Created by liumeng on 2016/4/9.
 */
public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
    }

    @Override
    public double coast() {
        return .22 + beverage.coast();
    }
}
