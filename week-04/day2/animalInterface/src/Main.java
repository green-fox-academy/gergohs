public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.giveSound();

        cat.setColor("black and white");
        cat.setNumberOflegs(4);
        cat.setWeight(3);

        cat.printIt();

        cat.play();

        Dog dog = new Dog();

        dog.giveSound();
        dog.setColor("tricolor");

        dog.printIt();

        dog.play();

        Wolf wolf = new Wolf();

        wolf.setColor("grey");

        wolf.printIt();
        wolf.searchFood();

    }
}
