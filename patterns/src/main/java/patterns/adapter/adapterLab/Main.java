package patterns.adapter.adapterLab;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(new DoublePoint(2.0,3.0), new DoublePoint(4,5));
        IntPoint intPoint = new IntPoint(),
                intPoint2 = new IntPoint();
        IntPointAdapter intPointAdapter = new IntPointAdapter(intPoint),
                     intPointAdapter2 = new IntPointAdapter(intPoint2);
        Line line2 = new Line(intPointAdapter, intPointAdapter2);
        line.draw();
        line2.draw();
    }
}
