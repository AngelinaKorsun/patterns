package patterns.adapter.adapterTraining;

public class CircleHole {
    private int radius;
    CircleHole(int radius){
        this.radius = radius;
    }

    public boolean fits(CirclePeg circlePeg){
        return radius >= circlePeg.getRadius();
    }
}
