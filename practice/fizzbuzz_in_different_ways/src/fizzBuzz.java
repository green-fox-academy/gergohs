import java.util.stream.IntStream;

public class fizzBuzz {

    public static void main(String[] args) {

        int elements[] = IntStream.range(1, 101).toArray();     // fills the array from 0 to 100

        for (int x : elements) {                                //for:each to go through the array elements
            switch (x % 15) {                                   //switch to find the dividers
                case 0:
                    System.out.println("Fizz-buzz");
                    break;
                case 5:
                case 10:
                    System.out.println("Buzz");
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    System.out.println("Fizz");
                    break;
                default:
                    System.out.println(x);
                    break;
            }
        }
    }
}
