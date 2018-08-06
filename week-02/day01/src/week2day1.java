public class week2day1 {

    public static void main(String[] args) {
        // innen kell hívni a függvényeket
        System.out.println("*********************************** excersie 1: doubling  **********************************");

        int baseNum = 123;

        int returnNum = doubling(baseNum);
        System.out.println(returnNum);

        System.out.println("*********************************** excersie 2: greetings **********************************");

        String a1 = "Greenfox";

        String a2 = greet(a1);

        System.out.println(a2);

        System.out.println("*********************************** excersie 3: Append A **********************************");

        String typo = "Chinchill";

        String typo2 = appendAFunc(typo);
        System.out.println(typo2);

        System.out.println("*********************************** excersie 4: Summing **********************************");

        //not a perfect solution, i just give two numbers manually

        int a = 54;
        int b = 46;

       System.out.println(summing(a,b));



    }
    // ide kellenek a függvények (MAIN függvény után)

    //***********************************excersie 1: doubling ********************************************************

    public static int doubling(int input) {

        int doublebaseNum = input * 2;
        return doublebaseNum;
    }
    //***********************************excersie 2: greeting ********************************************************

    public static String greet(String greeting) {

        String attach = "Greetings dear, " + greeting;

        return attach;
    }
    //***********************************excersie 3: Append a ********************************************************

    public static String appendAFunc(String typoFromMain) {

        String add = "a";
        String add2 = typoFromMain + add;

        return add2;
    }
    //***********************************excersie 4: Summing ********************************************************


    public static int summing (int a, int b) {

        int sum = a+b;

        return sum;

    }

}
