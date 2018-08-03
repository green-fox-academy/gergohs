import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int n = num1;

        if (num2 < num1) {
            System.out.println("The second number should be bigger");
        }
        while (n < num2) {
            System.out.println(n);
            n++;
        }


    }
}
