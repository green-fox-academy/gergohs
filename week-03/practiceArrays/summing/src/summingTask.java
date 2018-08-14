// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

import java.util.Random;

public class summingTask {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        System.out.println("The sum of the two number is : " + calculator(randomNumber));

    }

    private static int calculator(Random randomNumber) {

        int randNum1 = randomNumber.nextInt(100);
        int randNum2 = randomNumber.nextInt(100);

        return randNum1 + randNum2;

    }
}
