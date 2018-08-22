public class Bat extends Animal implements Mammals, ableToFly, wildAnimal {

    @Override
    public void mammal() {
        System.out.println("It's a mammal");
    }

    @Override
    public void fly() {
        System.out.println("It can fly with wings");
    }

    @Override
    public void searchFood() {
        System.out.println("Try to catch some bugs and mosquitos for dinner");
    }

    public void giveSound() {
        System.out.println("It has only ultrasounds");
    }
}

