package patterns.decorator.peiliao;

import patterns.decorator.Beverage;
import patterns.decorator.CondimentDecorator;

/**
 * Created by liumeng on 2016/4/9.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,moCha";
    }

    @Override
    public double coast() {
        return 0.20 + beverage.coast();
    }
}
