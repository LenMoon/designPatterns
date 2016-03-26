package patterns.strategy.demo3;

/**
 * Created by liumeng on 2016/3/26.
 */
public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    private RunBehaviour runBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, RunBehaviour runBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.runBehaviour = runBehaviour;
    }

    public void Swim() {
        System.out.println("所有鸭子都会游泳");
    }

    public void display() {
        System.out.println("所有的鸭子都有自己的形态");
    }

    public final void quack() {
        this.quackBehaviour.quack();
    }

    public final void fly() {
        this.flyBehaviour.fly();
    }

    public void run() {
        this.flyBehaviour.fly();
    }


    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }


    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setRunBehaviour(RunBehaviour runBehaviour) {
        this.runBehaviour = runBehaviour;
    }
}
