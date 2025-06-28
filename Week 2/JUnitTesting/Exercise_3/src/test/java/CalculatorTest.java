import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	private Calculator calci;
    @Before
    public void setUp() {
        calci = new Calculator();
        System.out.println("Setup completed");
    }

    @After
    public void tearDown() {
        System.out.println("Operations completed");
    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        int result = calci.add(a, b);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        int a = 4;
        int b = 5;
        int result = calci.multiply(a, b);
        assertEquals(20, result);
    }
}
