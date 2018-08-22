public class Pirate {

    private String name = "OneTwo";
    int intoxicateLevel;

    //konstruktor, ha van bemenő paraméter:
   // public Pirate(String name, int intoxicateLevel) {}

    //konstruktor, ha nincs bemenő paraméter
    public Pirate() {

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


    public String getName() {
        return name;
    }

    public void setName(String incoming) {
        this.name = incoming;
    }

}
