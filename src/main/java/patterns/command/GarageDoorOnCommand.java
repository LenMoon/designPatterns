package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class GarageDoorOnCommand  implements Command{
    private GarageDoor garageDoor;


    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
