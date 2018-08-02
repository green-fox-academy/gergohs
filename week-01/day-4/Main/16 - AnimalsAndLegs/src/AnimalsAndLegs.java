import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner hens = new Scanner(System.in);

        int numberOfHens = hens.nextInt ();

        Scanner pigs = new Scanner (System.in);

        int numberOfPigs = pigs.nextInt ();

        int totalHenLegs = numberOfHens*2;
        int totalPigLegs = numberOfPigs*4;

        System.out.println(" The total legs on the farm are: " + ((numberOfHens*2)+(numberOfPigs*4)));

    }
}
