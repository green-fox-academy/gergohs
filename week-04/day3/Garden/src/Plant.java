public abstract class Plant {

    private String color;
    private String type;
    private double absorbLevel;
    private int thirstLevel;


    public Plant(String color, String type, double absorbLevel, int thirstLevel) {
        this.color = color;
        this.type = type;
        this.thirstLevel = thirstLevel;
        this.absorbLevel = absorbLevel;
    }

    int firstWatering;
    int secondWatering;
    int needsWaterIfUnder;

    public void firstWatering(int firstWatering, int secondWatering, double absorbLevel, int thirstLevel) {

        if (getThirstLevel() < needsWaterIfUnder) {
            thirstLevel = (int) (firstWatering * absorbLevel);
            System.out.println("The actual water level after the first watering is: " + this.thirstLevel);
        }
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getThirstLevel() {
        return thirstLevel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

}
