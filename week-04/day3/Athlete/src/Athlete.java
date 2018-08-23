public class Athlete {

    private String name;
    private int strength;
    private int stamina;
    private int hunger;

    public Athlete(String name, int strength, int stamina, int hunger) {
        this.name = name;
        this.strength = strength;
        this.stamina = stamina;
        this.hunger = hunger;
    }

    public String getName() {

        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getHunger() {
        return hunger;
    }

    public void goToGym() {
        strength += 3;
        hunger -= 2;
    }

    public void goToRun() {
        stamina += 2;
        hunger -= 4;
    }


    public void eatHamburger() {
        strength -= 2;
        hunger += 5;
    }

}
