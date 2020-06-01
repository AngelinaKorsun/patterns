package patterns.composite.compositeTraining;

public interface Part {
    int getPrice();
    int getVolume();//объем
    int getWeight();
    boolean isReadyToSent();
}
