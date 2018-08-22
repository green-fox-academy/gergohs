public class Wolf extends Animal implements wildAnimal, Mammals {

    @Override
    public void searchFood() {
        System.out.println("Try to catch a rabbit for dinner");
    }

    public void giveSound() {
        System.out.println("It can say: Woooouuuuuuuu");
    }

    @Override
    public void mammal() {
        System.out.println("It's a mammal");
    }
}
