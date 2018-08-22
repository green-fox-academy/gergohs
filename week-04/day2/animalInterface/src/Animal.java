public abstract class Animal {

    private int weight;
    private String color;
    private int numberOflegs;


    protected void giveSound() {
        System.out.println("any kind of sounds");
    }

    protected void printIt() {
        System.out.println(color);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOflegs() {
        return numberOflegs;
    }

    public void setNumberOflegs(int numberOflegs) {
        this.numberOflegs = numberOflegs;
    }
}
