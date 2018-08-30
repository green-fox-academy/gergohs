import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int getSum(ArrayList<Integer> arraylist) {

        int sum = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            sum += arraylist.get(i);
        }
        return sum;
    }






    /*    ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(10);

        System.out.println(myList.get(0) + myList.get(1));
        int a = myList.get(0);
        int b = myList.get(1);
    }

    public int getSum(int a, int b) {
        return (a + b);
    }
*/

}
