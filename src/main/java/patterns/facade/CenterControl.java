package patterns.facade;

import patterns.command.*;

/**
 * Created by liumeng on 2016/4/14.
 */
public class CenterControl {
    private TV tv = new SonyTV();
    private Door door = new WoodDoor();
    private Light light = new ChandeliersLight();

    public void goHome() {
        door.up();
        light.on();
        tv.open();
    }

    public void leaveHome() {
        tv.shutdown();
        light.off();
        door.down();
    }

}
