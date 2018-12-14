import java.util.*;

public class athlete implements Runnable {
    private String name;
    private int time;
    private Random rand = new Random();
    private int rangeLow = 9580;
    private int rangeHigh = 15000;

    athlete(String name) {
        this.name = name;
        time = rand.nextInt(rangeHigh - rangeLow) + rangeLow;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
            System.out.println("Time of " + name + " is: " + ((float) time / 1000) + " seconds");
        } catch (Exception ignored) {
        }
    }
}