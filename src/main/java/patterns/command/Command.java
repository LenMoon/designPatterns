package patterns.command;

/**
 * Created by liumeng on 2016/4/13.
 */
public interface Command {
    void execute();

    void undo();
}
