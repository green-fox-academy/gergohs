import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int rn = num.nextInt();
        int i;
        int j;
        int k;

        for (i = 1; i <= rn; i++) {             //addig megy, míg el nem éri a megadott számot, ez lesz az össz sorok száma
            for (j = 1; j <= rn - i; j++) {     //annyi szóközt rajzoljon, amennyi a hátralévő sorok száma -1
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {      //mennyi csillagot rajzoljon: aktuális sor száma * 2 - 1
                System.out.print("*");
            }
            System.out.println();           //miután kirakta a szükséges space és csillagokat, ugorjon egy sort
        }

    }
}
