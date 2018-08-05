import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner guess = new Scanner(System.in);

        int n = guess.nextInt();
        int x = 6;
        int y;

            if (n < x) {
                System.out.println("The stored number is higher");
            } else if (n > x) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + x);
            }

    }
}
