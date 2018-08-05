import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        //Scanner num = new Scanner(System.in);

        //int rn = num.nextInt();
        int totalSor=4;
        int sor;
        int oszlop;
        int csillag;

        for (sor = 1; sor <= totalSor; sor++) {             //addig megy, míg el nem éri a megadott számot, ez lesz az össz sorok száma
            for (oszlop = 1; oszlop <= totalSor - sor; oszlop++) {     //annyi szóközt rajzoljon, amennyi a hátralévő sorok száma -1
                System.out.print(" ");
            }
            for (csillag = 1; csillag <= 2 * sor - 1; csillag++) {      //mennyi csillagot rajzoljon: aktuális sor száma * 2 - 1
                System.out.print("*");
            }
            System.out.println();           //miután kirakta a szükséges space és csillagokat, ugorjon egy sort
        }
            for (sor = totalSor - 1; sor <= totalSor; sor--) {
                for (oszlop = 1; oszlop <= totalSor - sor; oszlop++) {
                    System.out.print(" ");
                }
                for (csillag = 1; csillag <= 2 * sor - 1; csillag++) {
                    System.out.print("*");
                }
                System.out.println();
            }




    }


}
