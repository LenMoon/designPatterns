package patterns.decorator.yinliao;

import patterns.decorator.Beverage;

/**
 * Created by liumeng on 2016/4/9.
 */
public class Decaf  extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double coast() {
        return .66;
    }
}
