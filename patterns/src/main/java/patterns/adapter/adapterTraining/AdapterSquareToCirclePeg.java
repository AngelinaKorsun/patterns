package patterns.adapter.adapterTraining;

public class AdapterSquareToCirclePeg extends CirclePeg{
    private SquarePeg squarePeg;
    public AdapterSquareToCirclePeg(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
        return (int) Math.sqrt(Math.pow(squarePeg.getWidth(),2) * 2) / 2 ;
    }
}
