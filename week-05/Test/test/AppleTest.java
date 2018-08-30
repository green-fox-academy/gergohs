import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    Apple apple;

    @Before
    public void setUp() throws Exception {
        apple = new Apple();
    }

    @Test
    public void getApple() {
        assertEquals("apple", apple.getApple());
    }
}