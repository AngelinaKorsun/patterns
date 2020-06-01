package patterns.composite.compositeTraining;

public abstract class BasePart implements Part {
    private int price, volume, weight;
    private boolean isReady;

    public BasePart(int price, int volume, int weight, boolean isReady) {
        this.price = price;
        this.volume = volume;
        this.weight = weight;
        this.isReady = isReady;
    }
    public BasePart(){}

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isReadyToSent() {
        return isReady;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
}
