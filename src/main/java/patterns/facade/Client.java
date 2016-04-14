package patterns.facade;

/**
 * Created by liumeng on 2016/4/14.
 */
public class Client {

    public static void main(String[] args) {
        CenterControl control = new CenterControl();
        control.goHome();
        control.leaveHome();
    }
}
