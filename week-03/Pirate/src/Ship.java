import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    public Ship() {
    }

    public void fillShip(Pirate Pirate) {
        Pirate captain = new Pirate("CleverClifton", 3);
        Pirate crewMember1 = new Pirate("FoolishFrank", 4);
        Pirate crewMember2 = new Pirate("RumLoverLawrence", 8);
        Pirate crewMember3 = new Pirate("OneTeethTom", 2);
        List<Pirate> crew = new ArrayList<>();

        crew.add(captain);
        crew.add(crewMember1);
        crew.add(crewMember2);
        crew.add(crewMember3);
    }

    public void getInfo(ArrayList crew, Pirate pirate) {

        System.out.println(crew);
        System.out.println(pirate.intoxicateLevel);
    }

    public boolean battle(List crew) {
        int shipScore = crew.size() - captain.intoxicateLevel;
        if (this.shipScore > otherShip.shipScore) {
            return true;
        }
        return false;
    }

}