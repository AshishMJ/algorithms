package core_java.design_patterns.command;

public class Position {
    private int xPos = 0;
    private int yPos = 0;

    public Position() {
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CurrentPosition{");
        sb.append("xPos=").append(xPos);
        sb.append(", yPos=").append(yPos);
        sb.append('}');
        return sb.toString();
    }
}
