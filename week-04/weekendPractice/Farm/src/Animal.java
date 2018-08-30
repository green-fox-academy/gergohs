public class Animal {

    int hunger;
    int thirst;


    Animal(int hunger, int thirst) {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        this.hunger = hunger - 1;
    }

    public void drink() {
        this.thirst = thirst - 1;
    }

    public void play() {
        this.hunger++;
        this.thirst++;
    }
}