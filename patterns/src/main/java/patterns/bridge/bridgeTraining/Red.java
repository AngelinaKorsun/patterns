package patterns.bridge.bridgeTraining;

public class Red implements Color {
    java.awt.Color color;

    Red(int r, int g, int b){
        color = new java.awt.Color(r,g,b);
    }
    @Override
    public java.awt.Color getColor() {
        return this.color;
    }

    @Override
    public int getRGB() {
        return 0;
    }

    @Override
    public int getNumberOfDominantColor() {
        return 0;
    }

    @Override
    public String getDominantColor() {
        return null;
    }
}
