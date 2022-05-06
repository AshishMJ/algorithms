package core_java.design_patterns.command;

public class RobotCommandFactory {

    public static RobotCommand getCommand(RobotAction robotAction) {
        RobotCommand command;
        switch (robotAction) {
            case MF:
                command = new MoveForward();
                break;
            case MB:
                command = new MoveBackward();
                break;
            default:
                throw new RuntimeException("RobotAction Not found.");
        }
        return command;
    }

    public static RobotCommand getRevertCommand(RobotAction robotAction) {
        RobotCommand command;
        switch (robotAction) {
            case MF:
                command = new MoveBackward();
                break;
            case MB:
                command = new MoveForward();
                break;
            default:
                throw new RuntimeException("RobotAction Not found.");
        }
        return command;
    }
}
