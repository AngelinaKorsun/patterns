package patterns.bridge.bridgeTraining;

public abstract class Shape {
    Color color;
    Shape(Color color){
        this.color = color;
    }
    abstract void drawInConsole();

    String getData() {
        return "RGB: " + color.getRGB() +
                ", color: " + color.getColor() +
                ", dominantColor: " + color.getDominantColor() +
                ", number of dominant color: " + color.getNumberOfDominantColor() + ";\n";
    }
}
