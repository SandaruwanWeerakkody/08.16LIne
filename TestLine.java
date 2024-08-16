public class TestLine {
    public static void main(String[] args) {
        Point p1 = new Point(1,2,3,4);
        Line l1 = new Line("Black",p1);
        System.out.println(l1.toString());
    }
}
