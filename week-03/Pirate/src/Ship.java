import java.util.ArrayList;
import java.util.Random;

public class Ship {
    public String name;
    public Ship shipName;
    private ArrayList<Pirate> crew;


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }


        public void fillShip () {
            Random random = new Random();
            int numberOfPirates = random.nextInt(20);
            for (int i = 0; i < numberOfPirates; i++) {
                crew.add(new Pirate(" ", " "));
            }

            System.out.println(crew.size());
        }


        public void getInfo () {
            System.out.println(shipName);
            System.out.println(crew.size());
        }
    }
    /*

    public boolean battle(Ship ship) {

        if (this.shipScore > shipScore) {
            return true;
        }
        return false;
    }

    public void battle(List thePoisonGrail) {

    }*/
  /*  @Override
    public String toString() {
        String info = " ";

        for (Pirate pirate : crew) {
            if (pirate.getTitle() == "captain") {
                info += "The captain's intoxicatelevel is: ";
                info += pirate.getIntoxicateLevel();
                info += ", and he is ";
                info += pirate.isDead();
                info += " \n ";
            }
        }
        info += crew.size() - 1;
        return info;
    }
*/
