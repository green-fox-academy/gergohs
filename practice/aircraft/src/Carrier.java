import java.util.ArrayList;
import java.util.List;

public class Carrier {
    ArrayList<Aircraft> carrier;
    private int ammoStore;
    private int healthPoint;

    public Carrier(int ammoStore, int healthPoint) {
        carrier = new ArrayList<>();
        this.ammoStore = ammoStore;
        this.healthPoint = healthPoint;
    }

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill() {
        //for ciklus

        if (ammoStore <= 0) {
            throw new ArithmeticException();
        }


        for (Aircraft aircraft : carrier) {
        }
    }

    public void fight(Carrier carrier) {

    }


    public String getStatus() {

        if (this.healthPoint == 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + this.healthPoint + ", Aircraft count: " + carrier.size() + ", Ammo storage: " +
                    this.ammoStore + ", Total damage: " + "AirCrafts: ");
        }
        return getStatus();
    }
}
