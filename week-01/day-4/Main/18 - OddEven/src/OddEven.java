import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner num = new Scanner (System.in);

        int number = num.nextInt();

        System.out.println(number);

        if (number % 2 == 0) {System.out.println("The number is even.");}
            else {System.out.println("The number is odd");}

        }
    }

