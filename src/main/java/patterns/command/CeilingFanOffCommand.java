package patterns.command;

import javax.swing.event.CellEditorListener;

/**
 * Created by liumeng on 2016/4/13.
 */
public class CeilingFanOffCommand implements Command{
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.shutdown();
    }

    public void undo() {
        ceilingFan.open();
    }

}
