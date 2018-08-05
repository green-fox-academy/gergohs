import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner num = new Scanner (System.in);

        int a = num.nextInt();
        int b = num.nextInt();

        if (a>b) {
            System.out.println(a);
        }
            else {
                System.out.println(b);
            }


    }

}
