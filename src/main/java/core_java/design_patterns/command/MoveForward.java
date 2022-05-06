package core_java.design_patterns.command;

public class MoveForward extends AbstractRobotCommand {

    @Override
    public void execute() {
        if (isRobotTurnedOn()) {
            Position position = robot.getPosition();
            Direction direction = robot.getDirection();
            switch (direction) {
                case NORTH:
                    position.setyPos(position.getyPos() + 1);
                    break;
                case SOUTH:
                    if (position.getyPos() != 0) {
                        position.setyPos(position.getyPos() - 1);
                    }
                    break;
                case EAST:
                    position.setxPos(position.getxPos() + 1);
                    break;
                case WEST:
                    if (position.getxPos() != 0) {
                        position.setyPos(position.getxPos() - 1);
                    }
                    break;
            }
            System.out.println(position);
        } else {
            System.out.println("Robot is in OFF mode. Turn ON the Robot to take commands.");
        }
    }
}
