package core_java.design_patterns.command;

public abstract class AbstractRobotCommand implements RobotCommand {
    protected Robot robot;

    @Override
    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    protected boolean isRobotTurnedOn() {
        return this.robot.getMode() == Mode.ON;
    }
}
