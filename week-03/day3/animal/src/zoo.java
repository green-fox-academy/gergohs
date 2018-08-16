public class zoo {
    public static void main(String args[]) {

        animal dog = new animal();

        int a = 24;
        for (int i = 0; i < a; i++) {
            dog.eat();
        }
        System.out.println("Dog hunger level is " + dog.hunger);

        int b = 16;
        for (int i = 0; i < b; i++) {
            dog.drink();
        }
        System.out.println("Dog thirst level is " + dog.thirst);

        int dogPlayNum = 6;
        for (int i = 0; i < dogPlayNum; i++) {
            dog.play();
        }
        System.out.println("Dog hunger level is " + dog.hunger +
                ". Dog thirst level is " + dog.thirst);

        System.out.println("***************************************************");

       animal cat = new animal();

        int c = 8;
        for (int i = 0; i < c; i++) {
            cat.eat();
        }
        System.out.println("Cat hunger level is " + cat.hunger);

        int d = 11;
        for (int i = 0; i < d; i++) {
            cat.drink();
        }
        System.out.println("Cat thirst level is " + cat.thirst);

        cat.play();
        System.out.println("Cat hunger level is " + cat.hunger +
                ". Cat thirst level is " + cat.thirst);

    }
}
