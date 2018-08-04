import org.omg.CORBA.ARG_OUT;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        int ln = num;
        int r;


        for (ln = 0; ln < num; ln++) {
            System.out.println();
            for (r = 0; r <= ln; r++) {
                System.out.print("*");
            }
        }



    }
}
