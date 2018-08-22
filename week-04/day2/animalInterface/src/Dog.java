public class Dog extends Animal implements Pet {
    @Override
    public void play() {
        System.out.println("Bring back the ball");
    }

    public void giveSound() {
        System.out.println("Wufffff");
    }
}
