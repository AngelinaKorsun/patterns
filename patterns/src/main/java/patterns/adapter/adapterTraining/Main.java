package patterns.adapter.adapterTraining;

public class Main {
    public static void main(String[] args) {
        CircleHole circleHole = new CircleHole(10);

        CirclePeg circlePeg = new CirclePeg(10);
        CirclePeg circlePeg2 = new CirclePeg(12);

        SquarePeg squarePeg = new SquarePeg(16);
        SquarePeg squarePeg2 = new SquarePeg(8);
        AdapterSquareToCirclePeg adapterSquareToCirclePeg = new AdapterSquareToCirclePeg(squarePeg);
        AdapterSquareToCirclePeg adapterSquareToCirclePeg2 = new AdapterSquareToCirclePeg(squarePeg2);

        System.out.println("1: " + circleHole.fits(circlePeg) +
                " 2: " + circleHole.fits(circlePeg2) + " 3: " + circleHole.fits(adapterSquareToCirclePeg) +
                " 4: " +  circleHole.fits(adapterSquareToCirclePeg2));
        System.out.println(7419 % 11);
    }
}
