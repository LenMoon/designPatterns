package patterns.strategy.demo2;


/**
 * Created by liumeng on 2016/3/26.
 */
public class MallerdDuck extends Duck implements Runsable,Flyable,Quackable{
    public void fly() {
        System.out.println("飞行");
    }

    public void quack() {
        System.out.println("呱呱叫");
    }

    public void run() {
        System.out.println("奔跑");
    }
}
