import java.lang.String;
import java.util.Arrays;

public class mySeconds {

    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the orignal list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

        int[] exampleList = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(elementSelector(exampleList)));
    }

    private static int[] elementSelector(int[] exampleList) {

//        ArrayList<Integer> selectorList = new ArrayList<>();

        int [] selectorList = {exampleList.length};

        for (int i = 0; i <= exampleList.length-1; i++) {
            if (((exampleList[i]) % 2) != 0) {
                selectorList [i] = exampleList [i];
            }
        }
        return selectorList;
    }


}
