package patterns.strategy.demo3;

/**
 * Created by liumeng on 2016/3/26.
 */
public class FlyWithBooster implements FlyBehaviour {

    public void fly() {
        System.out.println("利用助推器飞翔");
    }
}
