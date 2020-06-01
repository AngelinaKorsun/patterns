package patterns.composite.compositeTraining;

public class Computer extends BasePart {
    private String type;
    public Computer(int price, int volume, int weight, boolean isReady, String type) {
        super(price, volume, weight, isReady);
        this.type = type;
    }
    public void ready(){setReady(true);}
    public void unready(){setReady(false);}

}
