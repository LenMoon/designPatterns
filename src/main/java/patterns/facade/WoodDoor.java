package patterns.facade;

/**
 * Created by liumeng on 2016/4/14.
 */
public class WoodDoor implements Door {
    public void up() {
        System.out.println("开门");
    }

    public void down() {
        System.out.println("关门");
    }
}
