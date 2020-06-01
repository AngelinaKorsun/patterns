package patterns.flyweight.flyweightLab;

import java.awt.*;

public class Pixel {
    static int count;
    private int x,y;
    private PixelFlyweight pixelFly;

    public Pixel(int x, int y, int size, Color color){
        this.x = x;
        this.y = y;
        this.pixelFly = PixelFlyweightFactory.getFlyweight(size, color);
        count++;
    }

    public void draw(Graphics graphics){
        pixelFly.draw(graphics,x,y);
    }

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

    public PixelFlyweight getPixelFly() {
        return pixelFly;
    }

    public void setPixelFly(PixelFlyweight pixelFly) {
        this.pixelFly = pixelFly;
    }
}
