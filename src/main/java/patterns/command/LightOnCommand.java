package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();

    }

    public void undo() {
        light.off();
    }

}
