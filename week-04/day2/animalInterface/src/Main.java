public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setSpecies("cat");
        cat.giveSound();
        cat.setColor("black and white");
        cat.setWeight(3);
        cat.setNumberOfLegs(4);
        cat.mammal();

        cat.play();

        Dog dog = new Dog();

        dog.setSpecies("vizsla");
        dog.giveSound();
        dog.setColor("golden-rust");
        dog.setWeight(25);
        dog.setNumberOfLegs(4);
        dog.play();
        dog.mammal();

        Wolf wolf = new Wolf();

        wolf.setSpecies("grey wolf");
        wolf.giveSound();
        wolf.setColor("grey");
        wolf.setNumberOfLegs(4);
        wolf.searchFood();
        wolf.mammal();

        Owl owl = new Owl();

        owl.setSpecies("snowy owl");
        owl.giveSound();
        owl.setColor("white");
        owl.setNumberOfLegs(2);
        owl.searchFood();
        owl.fly();

        Bat bat = new Bat();

        bat.setSpecies("bat");
        bat.giveSound();
        bat.setColor("black");
        bat.setNumberOfLegs(2);
        bat.searchFood();
        bat.fly();
        bat.mammal();


    }
}
