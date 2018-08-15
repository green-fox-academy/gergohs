import java.util.Random;

public class diceSet {


    public diceSet() {
    }

    public int roll() {

        Random random = new Random();

        int roll = (int) random.nextInt(6);

        return roll;

    }

    public int reRoll () {

        Random random2 = new Random();

        int reRoll = (int) random2.nextInt(6);

        return reRoll();
    }

}
