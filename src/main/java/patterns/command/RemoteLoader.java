package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));

        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();

        remoteControl.setCommand(1,new CeilingFanOnCommand(ceilingFan),new CeilingFanOffCommand(ceilingFan));
        remoteControl.setCommand(2,new GarageDoorOffCommand(garageDoor),new GarageDoorOnCommand(garageDoor));


        System.out.println(remoteControl);

        System.out.println("-----------------------------------------------");

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();


        System.out.println("------------------------测试宏命令--------------------");

        MacroCommand macroCommand = new MacroCommand(new Command[]{new GarageDoorOnCommand(garageDoor),new LightOnCommand(light),new CeilingFanOnCommand(ceilingFan)});
        remoteControl.setMacroCommand(macroCommand);

        remoteControl.macronButtonWasPushed();
        remoteControl.undoButtonWasPushed();
    }
}
