package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.open();

    }

    public void undo() {
        ceilingFan.shutdown();
    }
}
