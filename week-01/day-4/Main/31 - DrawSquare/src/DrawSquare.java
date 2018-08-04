import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();

        int a;
        int b;


        for (a = 1; a <= n; a++) {
            for (b = 1; b <= n; b++) {
                if (a == 1 || a == n || b == 1 || b == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

    }
}
