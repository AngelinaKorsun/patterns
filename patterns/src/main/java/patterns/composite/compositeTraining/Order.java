package patterns.composite.compositeTraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Order {
    private List<Box> boxes;

    public Order(Box ...boxes) {
        this.boxes = Arrays.asList(boxes);
    }

    public int getPrice(){
        return boxes.stream().flatMapToInt(box -> IntStream.of(box.getPrice())).sum();
    }
}
