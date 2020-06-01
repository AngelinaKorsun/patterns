package patterns.flyweight.flyweightLab;

import java.awt.*;
import java.util.Objects;

/**
 * immutable class Pixel that include "internal" state: Color cannot be changed, such as String
 */
public class PixelFlyweight {
    static int count;
    private int size;
    private Color color;

    public PixelFlyweight(int size, Color color) {
        this.size = size;
        this.color = color;
        count++;
    }

    public void draw(Graphics g, int x, int y){
        g.setColor(color);
        g.fillRect(x,y, size,size);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        PixelFlyweight pixFly = (PixelFlyweight)obj;
        return size == pixFly.size && color.equals(pixFly.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, color);
    }
    public static int hashCode(int size, Color color){
        return Objects.hash(size,color);
    }

    public Color getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}

