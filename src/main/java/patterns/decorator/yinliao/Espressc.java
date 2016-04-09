package patterns.decorator.yinliao;

import patterns.decorator.Beverage;

/**
 * Created by liumeng on 2016/4/9.
 */
public class Espressc extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double coast() {
        return 1.99;
    }
}
