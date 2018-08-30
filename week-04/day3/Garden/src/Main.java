public class Main {

    public static void main(String[] args) {

        Flower yellowFlower = new Flower("yellow", "flower" );
        Flower blueFlower = new Flower("blue", "flower");

        Tree purpleTree = new Tree("purple", "tree");
        Tree orangeTree = new Tree("orange", "tree");

        yellowFlower.firstWatering(,100);

        purpleTree.firstWatering(100,100);
    }
}