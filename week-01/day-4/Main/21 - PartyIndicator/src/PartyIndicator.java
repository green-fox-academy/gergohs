import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int girls = num.nextInt();
        int boys = num.nextInt();


        if ((girls == boys) && (girls + boys) >= 20) {
            System.out.println("The party is excellent!");
        } else if ((girls != boys) && (girls !=0) && (girls + boys) >= 20) {
            System.out.println("The party is quite good!");
        } else if ((girls + boys) < 20) {
            System.out.println("Average party");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }

    }
}