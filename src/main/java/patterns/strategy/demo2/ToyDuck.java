package patterns.strategy.demo2;

/**
 * Created by liumeng on 2016/3/26.
 */
public class ToyDuck extends Duck implements Quackable{
    public void quack() {
        System.out.println("呱呱叫");
    }
}
