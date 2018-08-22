public abstract class Animal {

    private String species;
    private int weight;
    private String color;
    private int numberOfLegs;

    public void setSpecies(String species) {
        System.out.println("\nThis is a " + (this.species = species));
    }

    public void setNumberOfLegs(int numberOfLegs) {
        System.out.println("It has " + numberOfLegs + " legs!");
    }

    protected void giveSound() {
        System.out.println("any kind of sounds");
    }


    public void setWeight(int weight) {
        System.out.println("It's weight is " + (this.weight = weight) + " kg");
    }


    public void setColor(String color) {
        System.out.println("It has " + color + " color.");
    }

}
