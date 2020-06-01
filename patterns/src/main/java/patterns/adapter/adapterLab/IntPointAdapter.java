package patterns.adapter.adapterLab;

public class IntPointAdapter extends DoublePoint {
    IntPoint point;
    IntPointAdapter(IntPoint p){
        this.point = p;
    }

    @Override
    public void setX(double x) {
        point.setX((int)x);
    }

    @Override
    public void setY(double y) {
        point.setY((int)y);
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }
}
