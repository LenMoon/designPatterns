package patterns.decorator.yinliao;

import patterns.decorator.Beverage;

/**
 * Created by liumeng on 2016/4/9.
 */
public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend Cofee";
    }

    @Override
    public double coast() {
        return .89;
    }
}
