package patterns.bridge.bridgeTraining;

public class Blue implements Color {
    java.awt.Color color;
    Blue(int r, int g, int b){
        color = new java.awt.Color(r,g,b);
    }

    @Override
    public java.awt.Color getColor() {
        return color;
    }

    @Override
    public int getRGB() {
        return color.getRGB();
    }

    @Override
    public int getNumberOfDominantColor() {
        return color.getBlue();
    }

    @Override
    public String getDominantColor() {
         return dominantColor();
    }
}
