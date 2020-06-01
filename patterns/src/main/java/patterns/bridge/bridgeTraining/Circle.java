package patterns.bridge.bridgeTraining;

import java.util.Arrays;
import java.util.Collections;

public class Circle extends Shape {
    private double pi = Math.PI;
    private int radius;
    Circle(Color color, int radius){
        super(color);
        this.radius = radius;
    }

    @Override
    void drawInConsole() {
//        drawHalf(true);
        System.out.println(assembleCircle());
    }

    private String assembleCircle(){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < radius; i++) {
            str.append(reverseHalfOfHalf(true, true)[i]);
            str.append(reverseHalfOfHalf(false, true)[i]);
            str.append("\n");
        }
        for (int i = 0; i < radius; i++) {
            str.append(reverseHalfOfHalf(true,false)[i]);
            str.append(reverseHalfOfHalf(false,false)[i]);
            str.append("\n");
        }

        return str.toString();
    }

    private String[] reverseHalfOfHalf(boolean left, boolean above){
        String[] s = getHalfofHalf();
        if(!left)
            for (int i = 0; i < s.length; i++) {
                s[i] = new StringBuilder(s[i]).reverse().toString();
            }
        if(!above)
            Collections.reverse(Arrays.asList(s));
        return s;
    }

    private String[] getHalfofHalf(){
        String[] strings = new String[radius];

        for (int i = 0; i < radius ; i++) {
            for (int j = 0; j < radius ; j++) {
                if(strings[i] == null)
                    strings[i] = "";
                strings[i] += radius - i - 1  >= j ? " " : "#";
            }
        }
        return strings;
    }


}
