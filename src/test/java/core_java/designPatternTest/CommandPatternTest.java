package core_java.designPatternTest;

import core_java.design_patterns.command.Robot;
import core_java.design_patterns.command.RobotAction;
import core_java.design_patterns.command.RobotController;
import org.junit.Test;

public class CommandPatternTest {

    @Test
    public void testMoveFwd() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);
        controller.turnOn();
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
    }

    @Test
    public void testMoveBack() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);
        controller.turnOn();
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MB);
        controller.submitAction(RobotAction.MB);
        controller.submitAction(RobotAction.MB);
    }

    @Test
    public void testUndo() {
        Robot robot = new Robot();
        RobotController controller = new RobotController(robot);
        controller.turnOn();
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.MF);
        controller.submitAction(RobotAction.UNDO);
        controller.submitAction(RobotAction.UNDO);
        controller.submitAction(RobotAction.UNDO);
    }
}
