public class timer {
    public static void main(String[] args) {

        Thread t1 = new Thread(new athlete("Bolt"));
        Thread t2 = new Thread(new athlete("Gatlin"));
        Thread t3 = new Thread(new athlete("De Grasse"));
        Thread t4 = new Thread(new athlete("Blake"));
        Thread t5 = new Thread(new athlete("Simbine"));
        Thread t6 = new Thread(new athlete("Meite"));
        Thread t7 = new Thread(new athlete("Vicaut"));
        Thread t8 = new Thread(new athlete("Bromell"));

        setNameForThreads(t1, t2, t3, t4, t5, t6, t7, t8);
        startThreads(t1, t2, t3, t4, t5, t6, t7, t8);
        printWinner(t1, t2, t3, t4, t5, t6, t7, t8, selectWinner(t1, t2, t3, t4, t5, t6, t7, t8));
    }


    private static void setNameForThreads(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5, Thread t6,
                                          Thread t7, Thread t8) {
        t1.setName("Bolt");
        t2.setName("Gatlin");
        t3.setName("De Grasse");
        t4.setName("Blake");
        t5.setName("Simbine");
        t6.setName("Meite");
        t7.setName("Vicaut");
        t8.setName("Bromell");
    }

    private static void startThreads(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5, Thread t6, Thread t7,
                                     Thread t8) {
        System.out.println("The race starts... /note: program is running, please wait 9-13 seconds/ \n");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

    private static void printWinner(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5, Thread t6, Thread t7,
                                    Thread t8, String name) {
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            System.out.println("\n* * * * * What a fantastic final, " + name + " wins the gold medal!!! * * * * * \n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String selectWinner(Thread t1, Thread t2, Thread t3, Thread t4, Thread t5, Thread t6, Thread t7,
                                       Thread t8) {

        String winner = null;
        while ((t1.isAlive() || t2.isAlive() || t3.isAlive()) || t4.isAlive() || t5.isAlive() || t6.isAlive()
                || t7.isAlive() || t8.isAlive()) {
            if (!(t1.isAlive())) {
                winner = t1.getName();
                break;
            }
            if (!(t2.isAlive())) {
                winner = t2.getName();
                break;
            }
            if (!(t3.isAlive())) {
                winner = t3.getName();
                break;
            }
            if (!(t4.isAlive())) {
                winner = t4.getName();
                break;
            }
            if (!(t5.isAlive())) {
                winner = t5.getName();
                break;
            }
            if (!(t6.isAlive())) {
                winner = t6.getName();
                break;
            }
            if (!(t7.isAlive())) {
                winner = t7.getName();
                break;
            }
            if (!(t8.isAlive())) {
                winner = t8.getName();
                break;
            }
        }
        return winner;
    }
}

