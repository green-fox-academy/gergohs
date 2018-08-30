import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animalList;
        animalList = new ArrayList<>();

        Farm myFarm = new Farm();

        int slot = 0;

        animalList.add(new Animal(40, 20));
        animalList.add(new Animal(42, 22));
        animalList.add(new Animal(50, 31));
        animalList.add(new Animal(38, 43));
        animalList.add(new Animal(55, 10));

        myFarm.slaughter();

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i));
        }
    }
}

