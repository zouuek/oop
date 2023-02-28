public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Point point = new Point (1,1);
        Segment segment = new Segment(point, new Point(2,2));
        System.out.println(segment.getDistance());
    }
}