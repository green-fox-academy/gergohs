public class Owl extends Animal implements wildAnimal, ableToFly {


    @Override
    public void giveSound() {
        System.out.println("It can say: Huhu Hu");
    }

    @Override
    public void searchFood() {
        System.out.println("Try to catch a mouse for dinner");
    }

    @Override
    public void fly() {
        System.out.println("It can fly with wings");
    }
}
