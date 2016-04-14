package patterns.adapter;

/**
 * Created by liumeng on 2016/4/14.
 */
public class TigerToCat {
    public void play(Cat cat) {
        cat.eatMouse();
        cat.miao();
    }

    public static void main(String[] args) {
        TigerToCat test = new TigerToCat();
        test.play(new TigerCat(new TiaoTiaoTiger()));
    }
}
