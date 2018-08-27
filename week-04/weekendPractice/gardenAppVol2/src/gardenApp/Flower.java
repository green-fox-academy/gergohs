package gardenApp;

public class Flower extends Plant {

    protected static int wateringLimit = 5;

    protected Flower(String plantType, String color, double absorbLevel, int thirstLevel, int wateringLimit) {
        super(plantType, color, absorbLevel, thirstLevel, wateringLimit);
    }
}
