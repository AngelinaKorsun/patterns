package patterns.bridge.bridgeTraining;

public interface Color {
    java.awt.Color getColor();
    int getRGB();
    int getNumberOfDominantColor();
    String getDominantColor();
    default String dominantColor(){
        String[] s = this.getClass().getName().split("\\.");
        return s[s.length-1].toLowerCase();
    }
}
