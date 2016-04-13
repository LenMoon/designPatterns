package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
       for(int i=commands.length-1;i>=0;i--) {
           commands[i].undo();
       }
    }
}
