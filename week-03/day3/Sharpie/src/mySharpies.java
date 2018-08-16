public class mySharpies {
    public static void main(String args[]) {

        Sharpie sharpie1 = new Sharpie();

        String sharpie1Color = "green";
        float sharpie1Width =  2.5f;

        int numOfwrite1 = 26;

        for (int i = 0; i < numOfwrite1; i++) {
            sharpie1.use();
        }

        sharpie1.use();
        if (sharpie1.inkAmount <= 0) {
            System.out.println("The " + sharpie1Color + " sharpie is out of ink.");
        } else {
            System.out.println("Ink amount of the " + sharpie1Color + " sharpie is " + sharpie1.inkAmount);
        }

//*****************************************************************************************

        Sharpie sharpie2 = new Sharpie();

        String sharpie2Color = "blue";
        float sharpie2Width = 5;

        int numOfwrite2 = 32;

        for (int i = 0; i < numOfwrite2; i++) {
            sharpie2.use();
        }
        System.out.println("Ink amount of the " + sharpie2Color + " sharpie is " + sharpie2.inkAmount);

    }
}
