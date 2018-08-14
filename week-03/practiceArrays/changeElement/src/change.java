// - Create an array variable named `s`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

import java.util.Arrays;

public class change {
    public static void main(String[] args) {


        int [] s = {1,2,3,8,5,6};

        s[3] = 4;

        System.out.println(s[3]);

        //complete list:
        System.out.println(Arrays.toString(s));

    }
}
