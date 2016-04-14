package patterns.adapter;

/**
 * Created by liumeng on 2016/4/14.
 */
public class TigerCat implements Cat {
    private Tiger tiger;

    public TigerCat(TiaoTiaoTiger tiaoTiaoTiger) {
        this.tiger = tiaoTiaoTiger;
    }

    public void eatMouse() {
        tiger.eatPeople();
    }

    public void miao() {
        tiger.hou();
    }
}
