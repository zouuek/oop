public class Segment {
    private Point a, b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    //public void setA(Point a) {
    //   this.a = a;
    //}

    //public void setB(Point b) {
    //   this.b = b;
    //}
    //public String getSvg(){
      //  String result = String.format(Locale.ENGLISH, format "<line x1=\"%.2f\" y1=\"%.2f\" x2=\"%.2f\" y2=\"%.2f\" style=\"stroke:black\"");
        //return result;
    //}
    public double getDistance(){
        return Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y-a.y),2));
    }
}
