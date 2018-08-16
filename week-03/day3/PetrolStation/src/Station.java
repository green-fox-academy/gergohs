public class Station {

    int gasAmount;


    public Station() {
        this.gasAmount = 1000;
    }

   public void reFill(Car car) {
        int actualCapacity = car.capacity-car.gasAmount;
        gasAmount=gasAmount-actualCapacity;
        car.gasAmount=car.gasAmount+actualCapacity;


    }
}
