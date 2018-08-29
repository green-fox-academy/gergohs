public class Pirate {

    private String name;
    private int intoxicateLevel;

    public int getIntoxicateLevel() {
        return intoxicateLevel;
    }

    public Pirate(String name, int intoxicateLevel) {
    }

    public int drinkSomeRum() {
        intoxicateLevel++;
        return intoxicateLevel;
    }

    public void howsItGoingMate() {
        if (intoxicateLevel > 0 && intoxicateLevel < 4) {
            System.out.println("Pour me anudder! \n");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin? \n");
        }
    }

    public String brawl() {
        return null;
    }

    public String die() {
        return "he\'s dead";
    }

    public String getName() {
        return name;
    }

    public void setName(String incoming) {
        this.name = incoming;
    }
}
