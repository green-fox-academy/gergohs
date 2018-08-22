public class City {
    public static void main(String args[]) {

        Car car = new Car();

        car.gasAmount = 18;
        car.capacity = 80;
        System.out.println("Before reFill:");
        System.out.println("Total gas capacity of the car: " + car.capacity);
        System.out.println("Actual gas amount of the car: " + car.gasAmount);
        System.out.println("Actual gas capacity of the car (liters to be refill): " +
                (car.capacity - car.gasAmount));
        System.out.println(); //just to put a break line

        Station petrolStation = new Station();

//car goes to reFill only if the gasAmount is under 20 liters

        if (car.gasAmount < 20) {
            for (int i = car.gasAmount; i <= car.capacity; i++) {
                petrolStation.reFill(car);
            }
        }
        System.out.println("After reFill:" + "\n" +
                "Gas amount of the car: " + car.gasAmount + "\n" +
                "Gas amount of the station: " + petrolStation.gasAmount);

    }
}
