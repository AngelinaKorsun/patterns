package patterns.adapter.adapterLab;

public class Line {
    private double length;
    private DoublePoint[] points;
    Line(DoublePoint point1, DoublePoint point2){
        points = new DoublePoint[]{point1,point2};
    }
    Line(){}
    public void draw(){
        /*Arrays.stream(points).forEach(point -> System.out.println(point.getX() +
                " " + point.getY()));*/
        double x = 3.0, y = -1.0;
        for (DoublePoint point : points) {
            point.setX(x--);
            point.setY(y++);
            System.out.println("Point: (" + point.getX() +", " + point.getY() +");");
        }
    }
}


