package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command unCommand;
    Command macroCommand=new Command() {
        public void execute() {

        }

        public void undo() {

        }
    };
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new Command() {
            public void execute() {

            }

            public void undo() {

            }
        };

        for(int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }


    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        unCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        unCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        unCommand.undo();
    }

    public void macronButtonWasPushed() {
        macroCommand.execute();
        unCommand = macroCommand;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\n------------remote Control------------------\n");
        for(int i=0;i<onCommands.length;i++) {
            sb.append("[solt" + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
        }

        return sb.toString();
    }

    public void setMacroCommand(Command macroCommand) {
        this.macroCommand = macroCommand;
    }
}
