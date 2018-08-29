import java.util.List;

public class BattleApp {

    public static void main(String[] args) {

        Ship darkEel = new Ship();
        Ship thePoisonGrail = new Ship();

        darkEel.fillShip(new Pirate("name", 0));
        thePoisonGrail.fillShip(new Pirate("name1", 0));

        darkEel.battle((List) thePoisonGrail);

        darkEel.getInfo();
        thePoisonGrail.getInfo();

    }
}
