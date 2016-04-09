package patterns.decorator.yinliao;

import patterns.decorator.Beverage;

/**
 * Created by liumeng on 2016/4/9.
 */
public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "DarkRoast";

    }

    @Override
    public double coast() {
        return 0.63;
    }
}
