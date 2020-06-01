package patterns.flyweight.flyweightLab;

public class Main {
   // static Map<Integer, NewObject> map = new HashMap<Integer, NewObject>();

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(1320,720);

        rectangle.setSize(1350,750);
        rectangle.setVisible(true);
        System.out.println(rectangle.info());
       /* System.out.println(Runtime.getRuntime().freeMemory() + " MB: " + Runtime.getRuntime().totalMemory()/1024/1024);

        Runtime rt = Runtime.getRuntime();
        long prevTotal = 0;
        long prevFree = rt.freeMemory();

        for (int i = 0; i < 2_000_000; i++) {
            long total = rt.totalMemory();
            long free = rt.freeMemory();
            if (total != prevTotal || free != prevFree) {
                long used = total - free;
                long prevUsed = (prevTotal - prevFree);
                System.out.println(
                        "#" + i +
                                ", Total: " + total +
                                ", Used: " + used +
                                ", ∆Used: " + (used - prevUsed) +
                                ", Free: " + free +
                                ", ∆Free: " + (free - prevFree));
                prevTotal = total;
                prevFree = free;
            }
            map.put(i, new NewObject());
        }*/
    }
    /*public static class NewObject{
        long i = 0L;
        long j = 0L;
        long k = 0L;
    }*/
}
