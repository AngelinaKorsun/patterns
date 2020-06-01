package patterns.flyweight.flyweightLab;

import java.awt.*;
import java.util.*;

public class PixelFlyweightFactory {
    private static Map<Integer, PixelFlyweight> flyweights = new HashMap<>();
    static int count;

    public static PixelFlyweight getFlyweight(int size, Color color){
        int hash;
        if(flyweights.containsKey(hash = Objects.hash(size, color)))
            return flyweights.get(hash);
        else {
            PixelFlyweight pixFly = new PixelFlyweight(size, color);
            flyweights.put(pixFly.hashCode(), pixFly);
            count++;
            return pixFly;
        }
    }
}
