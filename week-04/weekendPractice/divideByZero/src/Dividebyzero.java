public class Dividebyzero {

    public static void main(String[] args) {

        int givenNum = 0;

        try {
            getDivide(givenNum);
        } catch (ArithmeticException num) {
            System.out.println("fail");
        }

    }

    private static void getDivide(int num) {

        System.out.println(10 / num);

    }
}
