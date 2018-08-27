package gardenApp;

public class Tree extends Plant {

    protected static int wateringLimit = 10;

    protected Tree(String plantType, String color, double absorbLevel, int thirstLevel, int wateringLimit) {
        super(plantType, color, absorbLevel, thirstLevel, wateringLimit);
    }
}
