package gardenApp;

public class Plant {

   // protected static String color;
    protected  int thirstLevel;
    protected  String plantType;       //  flower or tree
    protected  String color;
    protected  double absorbLevel;     //  0.4 - 0.75
    protected  int wateringLimit;      // 5 - 10


    public Plant(String plantType, String color, double absorbLevel, int thirstLevel, int wateringLimit) {
    this.plantType = plantType;
    this.color = color;
    this.absorbLevel = absorbLevel;
    this.thirstLevel = thirstLevel;
    this.wateringLimit = wateringLimit;
    }

     int getThirstLevel()
     {
        return thirstLevel;
    }


     String getPlantType() {
        return plantType;
    }

     String getColor() {
        return color;
    }

     double getAbsorbLevel() {

        return absorbLevel;
    }


    public int getWateringLimit() {
        return wateringLimit;
    }
}

