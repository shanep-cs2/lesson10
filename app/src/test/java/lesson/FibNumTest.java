package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FibNumTest {

    @Test
    public void testBaseCase() {
        FibNum n = new FibNum();
        int actual = n.calculate(0);
        assertEquals(actual, 0);

        actual = n.calculate(1);
        assertEquals(actual, 1);
    }   

    @Test
    public void testFib(){
        FibNum n = new FibNum();
        int [] expected = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765};

        for(int i = 0; i < expected.length; i++){
            int actual = n.calculate(i);
            assertEquals(actual,expected[i]);
        }
    }
}