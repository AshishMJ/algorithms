package core_java.design_patterns.command;

import java.util.Stack;

public class RobotController {
    private Robot robot;
    private RobotActionInvoker actionInvoker;
    private Stack<RobotAction> actions;

    public RobotController(Robot robot) {
        this.robot = robot;
        this.actionInvoker = new RobotActionInvoker();
        this.actions = new Stack<>();
    }

    public void turnOn() {
        this.robot.setMode(Mode.ON);
    }

    public void turnOff() {
        this.robot.setMode(Mode.OFF);
    }

    public void submitAction(RobotAction robotAction) {
        RobotCommand command; //Create command to execute the action.
        if (RobotAction.UNDO == robotAction) {
            if (!actions.isEmpty()) {
                RobotAction lastAction = actions.pop();
                command = RobotCommandFactory.getRevertCommand(lastAction);
            } else {
                System.out.println("Impossible");
                return;
            }
        } else {
            command = RobotCommandFactory.getCommand(robotAction);
            actions.add(robotAction);
        }

        command.setRobot(robot); // Concrete Command receives the Receiver object.
        actionInvoker.setRobotCommand(command); //Invoker is assigned the command
        actionInvoker.execute(); // Invoker executes the action.
    }
}
