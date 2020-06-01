package patterns.bridge.bridgeTraining;

public class Square extends Shape{
    int width;
    Square(Color color, int width) {
        super(color);
        this.width = width;
    }

    @Override
    void drawInConsole() {
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < width ; j++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
    }

}
