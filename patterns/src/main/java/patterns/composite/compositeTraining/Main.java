package patterns.composite.compositeTraining;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(
                new Box(new Computer(1000,1000,1000,false, "PC")),
                new Box(new Computer(2000,500,500,true,"Lap-Top"),
                        new Box(new Computer(500,120,100,false,"PC"),
                                new Computer(10,10,10,true,"PC")))
        );
        System.out.println(order.getPrice());
        System.out.println();
        System.out.println(new Date().toString());
    }
}
