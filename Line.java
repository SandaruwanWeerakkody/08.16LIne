public class Line {
    private String colour;
    private Point point;

    public Line(String colour,Point point) {
        this.colour = colour;
        this.point = point;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Line{" +
                "colour='" + colour + '\'' +
                ", point=" + point +
                '}';
    }
}
