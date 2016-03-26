package patterns.strategy.demo3;

/**
 * Created by liumeng on 2016/3/26.
 */
public class MallerdDuck extends Duck {
    public MallerdDuck() {
        super(new FlyWithWing(), new QuackWithGuagua(), new RunWithLeg());
    }
}
