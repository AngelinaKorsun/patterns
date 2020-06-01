package patterns.flyweight.flyweightLab;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Rectangle  extends JFrame implements Shape {
    private int width, height;
    private List<Pixel> pixels = new ArrayList<>();

    private int rand(int floor, int ceil){
        return (int)(Math.random()*(ceil - floor) + floor);
    }
    private int rand(int ceil){
        return rand(0, ceil);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

        final int size = 50;
        Color color = Color.blue;
        for (int i = 0; i < width/size; i++) {
            for (int j = 0; j < height/size; j++) {
                pixels.add(new Pixel(i*size, j*size, size, color));
            }
            color = new Color((color.getRed() + rand(50) ) % 255,
                    (color.getGreen() + rand(200)) % 255,
                    (color.getBlue() + rand(150)) % 255);
            System.out.println("Red: " + color.getRed() + ", green: " + color.getGreen() + ", blue: " + color.getBlue());
        }
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
//                pixels.get(i*width + j).draw();
                pixels.forEach(x -> x.draw(g));
            }
        }
    }

    public String info(){
        return "PixelFlyweight: " + PixelFlyweight.count + "\nPixFly in Factory: " + PixelFlyweightFactory.count +
                    "\nPixel: " + Pixel.count;
    }
}
