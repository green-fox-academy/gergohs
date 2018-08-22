public class Cat extends Animal implements Pet, Mammals {

    @Override
    public void giveSound() {
        System.out.println("It can say: Meow");
    }

    @Override
    public void play() {
        System.out.println("It can play with a ball of yarn");
    }

    @Override
    public void mammal() {
        System.out.println("It's a mammal");
    }
}
