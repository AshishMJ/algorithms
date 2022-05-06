package core_java.design_patterns.command;

public class Robot {
    private Position position;
    private Direction direction = Direction.NORTH;
    private Mode mode = Mode.OFF;

    public Robot() {
        position = new Position();
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Robot{");
        sb.append("position=").append(position);
        sb.append(", direction=").append(direction);
        sb.append(", mode=").append(mode);
        sb.append('}');
        return sb.toString();
    }
}
