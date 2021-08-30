package hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorLogicsTest {

    @Test
    public void testAdd() throws Exception {
        CalculatorLogics controller = new CalculatorLogics();
        int actual = controller.add(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
