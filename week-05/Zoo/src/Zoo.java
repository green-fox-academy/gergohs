import main.java.animals.*;

public class Zoo {
    public static void main(String[] args) {


        Mammals mammal = new Mammals("Dog");
        Bird bird = new Bird("Kookaburra");
        Reptile reptile = new Reptile("Crocodile");

        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    }
}
