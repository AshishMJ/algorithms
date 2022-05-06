package core_java.design_patterns.command;

public class RobotActionInvoker {

    private RobotCommand robotCommand;

    public void setRobotCommand(RobotCommand robotCommand) {
        this.robotCommand = robotCommand;
    }

    public void execute() {
        robotCommand.execute();
    }
}
