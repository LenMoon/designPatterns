package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class GarageDoorOffCommand implements Command{
    private GarageDoor garageDoor;


    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}
