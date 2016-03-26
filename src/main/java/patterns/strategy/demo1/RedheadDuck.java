package patterns.strategy.demo1;

/**
 * Created by liumeng on 2016/3/26.
 */
public class RedheadDuck extends Duck{

    @Override
    public void flay() {
        System.out.println("绿头鸭能飞");
    }

    @Override
    public void dislay() {
        System.out.println("我是绿头鸭");
    }
}
