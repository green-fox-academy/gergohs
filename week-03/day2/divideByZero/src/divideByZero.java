// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Random;

public class divideByZero {
    public static void main(String[] args) {

        Random randomNumber = new Random();

        int randomNum = randomNumber.nextInt(10);
        System.out.println((randomNum));

        calculator(randomNum);
    }


    public static void calculator(int randomNum) {

        try {
            int numToCount = 10 / randomNum;
            System.out.println(numToCount);
        } catch (ArithmeticException e) {
            System.out.println("Can't divided by Zero");
        }
    }


}
