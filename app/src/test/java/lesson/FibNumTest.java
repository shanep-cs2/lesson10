package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FibNumTest {

    @Test
    public void testBaseCase() {
        int val = FibNum.calculate(1);
        assertEquals(val, 0);
    }   

    @Test
    public void testFib(){
        //TODO
    }
}
