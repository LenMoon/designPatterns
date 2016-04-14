package patterns.facade;


/**
 * Created by liumeng on 2016/4/14.
 */
public class ChandeliersLight implements Light {
    public void on() {
        System.out.println("打开吊灯");
    }

    public void off() {
        System.out.println("关闭吊灯");
    }
}
