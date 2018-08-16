public class animal {

    int hunger = 50;
    int thirst = 50;

    public animal() {
    }

    public void eat() {
        this.hunger = hunger - 1;
    }

    public void drink() {
        this.thirst = thirst - 1;
    }

    public void play() {
        hunger++;
        thirst++;
    }
}
