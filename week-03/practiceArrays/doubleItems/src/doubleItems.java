// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class doubleItems {
    public static void main(String[] args) {


        int[] numList = {3, 4, 5, 6, 7};

        int[] tempList = new int[numList.length];

        for (int i = 0; i <= numList.length - 1; i++) {
            System.out.print((tempList[i] = numList[i] * 2) + ", ");
        }

    }
}
