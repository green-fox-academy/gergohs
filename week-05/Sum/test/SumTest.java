import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SumTest {
    ArrayList<Integer> myList;

    Sum sum;

    @Before
    public void setUp() throws Exception {
        sum = new Sum();
        myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(10);
    }

    @Test
    public void getSumTest() {
        assertEquals(15, sum.getSum(myList));
    }
}