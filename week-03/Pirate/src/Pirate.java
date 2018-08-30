import java.util.Random;

public class Pirate {
    private String name;
    private int intoxicateLevel;
    private boolean isDead;


    public Pirate(String name, String title) {
        isDead = false;
        this.name = name;
    }



    public void drinkSomeRum() {
        if (isDead) {
            System.out.println("he's dead");
        } else {
            intoxicateLevel++;
        }
    }

    public void howsItGoingMate() {
        if (intoxicateLevel > 0 && intoxicateLevel < 4) {
            System.out.println("Pour me anudder! \n");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin? \n");
        }
    }

    public void brawl(Pirate pirate) {
        Random rand = new Random();
        int chance = rand.nextInt(3);

        if (chance == 0) {
            this.die();
        } else if (chance == 1) {
            pirate.die();
        } else if (chance == 2) {
            this.die();
            pirate.die();
        }
    }

    public boolean isDead() {
        return isDead;
    }



    public void die() {
        this.isDead = true;
    }

    public int getIntoxicateLevel() {
        return intoxicateLevel;
    }



}
