package patterns.bridge.bridgeTraining;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new Blue(2,3,5),5);
        shape.drawInConsole();
        System.out.println(shape.getData());

        Shape shape1 = new Square(new Red(0,0,0), 10);
        System.out.println(shape1.getData());
        shape1.drawInConsole();

        String[] str = new String[]{"one","two","three"};

        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuilder(str[i]).reverse().toString();
        }
        Collections.reverse(Arrays.asList(str));
        System.out.println(Arrays.toString(str));
    }
}
