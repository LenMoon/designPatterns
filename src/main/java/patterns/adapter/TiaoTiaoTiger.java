package patterns.adapter;

/**
 * Created by liumeng on 2016/4/14.
 */
public class TiaoTiaoTiger implements Tiger {
    public void eatPeople() {
        System.out.println("人肉味道不错");
    }

    public void hou() {
        System.out.println("老虎叫");
    }
}
