public class Dog extends Animal implements Pet, Mammals {

    @Override
    public void giveSound() {
        System.out.println("It can say: Wufffff");
    }

    @Override
    public void play() {
        System.out.println("It can bring back the ball");
    }

    @Override
    public void mammal() {
        System.out.println("It's a mammal");
    }
}
