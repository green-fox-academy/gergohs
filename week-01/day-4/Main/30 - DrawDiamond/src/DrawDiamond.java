import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int totalSor = num.nextInt();
        int kozepsoSor = (totalSor + 1) / 2;
        int sor;
        int space;
        int csillag;

//gyémánt felső fele, a középvonalat is beleértve
        //addig fut, amíg a sorok száma el nem éri a középső sort
        for (sor = 1; sor <= kozepsoSor; sor++) {

            //space-t rajzol: középső sor-1 sorig csökken a space-ek száma soronként egyel
            for (space = 1; space <= (kozepsoSor - sor); space++) {
                System.out.print(" ");
            }

            // annyi csillagot rajzol, amennyi az (aktuális sor X 2-1)
            for (csillag = 1; csillag <= (2 * sor - 1); csillag++) {
                System.out.print("*");
            }
            System.out.println();
        }
// gyémánt alsó fele, a középvonal alatt
        //addig fut, amíg a sorok száma a középső sor számánál egyel kevesebb
        for (sor = 1; sor <= (kozepsoSor - 1); sor++) {
            //space-t rajzol, annyi space-t ammennyi az aktuális sor száma
            for (space = 1; space <= sor; space++) {
                System.out.print(" ");
            }
            // csillagot rajzol, középsú sorból (5.) kivonva az aktuális sor számát, szorozva azt kettővel, mínusz egy
            for (csillag = 1; csillag <= 2 * (kozepsoSor - sor) - 1; csillag++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
