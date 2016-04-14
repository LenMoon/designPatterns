package patterns.facade;

/**
 * Created by liumeng on 2016/4/14.
 */
public class SonyTV implements TV {
    public void open() {
        System.out.println("打开电视机");
    }

    public void shutdown() {
        System.out.println("关闭电视机");
    }
}
