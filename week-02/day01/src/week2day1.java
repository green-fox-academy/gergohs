public class week2day1 {

    public static void main(String[] args) {
    // innen kell hívni a függvényeket
        System.out.println("**********************excersie 1: doubling********************");

        int baseNum = 123;

        int returnNum = doubling(baseNum);
        System.out.println(returnNum);

    }
    // ide kellenek a függvények (MAIN függvény után)
System.out.println("**********************excersie 1: doubling********************");
    public static int doubling(int input) {

        int doublebaseNum = input*2;
        return doublebaseNum;
    }
System.out.println("**********************excersie 2: ********************");


}
