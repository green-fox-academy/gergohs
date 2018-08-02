import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {


            Scanner num = new Scanner(System.in);

            int numOne = num.nextInt();
            int numTwo = num.nextInt();
            int numThree = num.nextInt();
            int numFour = num.nextInt();
            int numFive = num.nextInt();

            System.out.println("Sum :" + ( numOne+numTwo+numThree+numFour+numFive));
            System.out.println("Average : "+(numOne+numTwo+numThree+numFour+numFive)/5.0);

        }
    }