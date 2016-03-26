package patterns.strategy.demo3;

/**
 * Created by liumeng on 2016/3/26.
 */
public class WoodDuck extends Duck {
    public WoodDuck() {
       super(new FlyNO(),new QuackNo(),new RunNo());
    }

}
