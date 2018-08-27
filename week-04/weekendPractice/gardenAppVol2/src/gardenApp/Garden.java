package gardenApp;

import java.util.ArrayList;
import java.util.List;

class Garden {

    static ArrayList<Flower> flowers = new ArrayList<>();
    static ArrayList<Tree> trees = new ArrayList<>();

    Garden() {
        Flower flower1 = new Flower("flower", "yellow", 0.75, 2, 5);
        Flower flower2 = new Flower("flower", "blue", 0.75, 9, 5);
        Tree tree1 = new Tree("tree", "purple", 0.4, 7, 10);
        Tree tree2 = new Tree("tree", "orange", 0.4, 20, 10);
        flowers.add(flower1);
        flowers.add(flower2);
        trees.add(tree1);
        trees.add(tree2);
    }

    public void getInfo() {

        for (Flower flower : flowers) {
            if (flower.getThirstLevel() < flower.getWateringLimit()) {
                System.out.println("The " + flower.getColor() + " " + flower.getPlantType() + " needs water");
            } else {
                System.out.println("The " + flower.getColor() + " " + flower.getPlantType() + " doesn't need water");
            }
        }
        for (Tree tree : trees) {
            if (true) {
                System.out.println("The " + tree.getColor() + " " + tree.getPlantType() + " needs water");
            } else {
                System.out.println("The " + tree.getColor() + " " + tree.getPlantType() + " doesn't need water");
            }
        }
    }

    void watering(int irrigationAmount) {

        //  += (irrigationAmount*Plant.absorbLevel)/trees.size();
        // System.out.println(Plant.thirstLevel);

    }
}





