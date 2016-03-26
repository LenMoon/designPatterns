package patterns.strategy.demo1;

/**
 * Created by liumeng on 2016/3/26.
 */
public abstract class Duck {

    public void quack() {
        System.out.println("呱呱");
    }

    public void swim() {
        System.out.println("游泳");
    }

    public void run() {
        System.out.println("奔跑");
    }
    public abstract void flay();

    public abstract void dislay();


}
