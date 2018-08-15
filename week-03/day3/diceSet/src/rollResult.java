import java.util.Arrays;

public class rollResult {

    public static void main(String args[]) {

        //olyan a dobókocka, amelyen 0-5ig vannak rajta számok, 6 helyett 5 a maximum :)

        diceSet firstDice = new diceSet();

        diceSet secondDice = new diceSet();

        diceSet thirdDice = new diceSet();

        diceSet fourthDice = new diceSet();

        diceSet fifthDice = new diceSet();

        diceSet sixthDice = new diceSet();

        int[] results = {firstDice.roll(), secondDice.roll(), thirdDice.roll(),
                fourthDice.roll(), fifthDice.roll(), sixthDice.roll()};

        if (results[0] == 5 && results[1] == 5 && results[2] == 5
                && results[3] == 5 && results[4] == 5 && results[5] == 5) {
            System.out.println(Arrays.toString(results) + " You've got it!!!");
        } else {
            System.out.println(Arrays.toString(results) + " Please roll again!");
        }

    }
}
