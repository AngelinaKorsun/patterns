package patterns.composite.compositeTraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Box extends BasePart {
    List<Part> parts;

    public Box(Part ...parts) {
        this.parts = Arrays.asList(parts);
    }
    public void addParts(Part ...parts){
        this.parts.addAll(Arrays.asList(parts));
    }

    @Override
    public int getPrice() {
        return parts.stream().flatMapToInt( part -> IntStream.of(part.getPrice())).sum();
    }

    @Override
    public int getVolume() {
        return parts.stream().flatMapToInt( part -> IntStream.of(part.getVolume())).sum();
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public boolean isReadyToSent() {
        return super.isReadyToSent();
    }
}
