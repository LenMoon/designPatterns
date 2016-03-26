package patterns.strategy.demo1;

/**
 * Created by liumeng on 2016/3/26.
 */
public class MallerdDuck  extends Duck{

    @Override
    public void flay() {
        System.out.println("野鸭会飞");
    }

    @Override
    public void dislay() {
        System.out.println("我是野鸭");
    }
}
