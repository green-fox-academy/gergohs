public class timer {

    public static void main(String[] args) {

        Thread t1 = new Thread(new athlete("Usain"));
        Thread t2 = new Thread(new athlete("Asafa"));
        Thread t3 = new Thread(new athlete("Gatlin"));
        Thread t4 = new Thread(new athlete("Blake"));

        System.out.println("Race starts...");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
