package patterns.adapter.adapterLab;

public class IntPoint {
    private int x,y;

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public IntPoint(){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
