import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner numb = new Scanner(System.in);

        int num = numb.nextInt();

        int n;

        for (n = 1; n <= 10; n++) {
            System.out.println((n + " * " + num + " = " + n * num));
        }


    }
}
