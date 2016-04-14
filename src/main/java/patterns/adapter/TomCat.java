package patterns.adapter;

/**
 * Created by liumeng on 2016/4/14.
 */
public class TomCat implements Cat{
    public void eatMouse() {
        System.out.println("老鼠肉味道不错");
    }

    public void miao() {
        System.out.println("喵~");
    }
}
