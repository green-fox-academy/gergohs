
public class Cat extends Animal implements Pet{


    @Override
    public void giveSound (){
        System.out.println("Meow");
    }


    @Override
    public void play() {
        System.out.println("Play with a ball of yarn");
    }
}
