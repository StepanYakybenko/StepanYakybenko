import org.junit.jupiter.api.Assertions;

import static org.testng.Assert.*;

public class factorialTNGTest {

    @org.testng.annotations.Test
    public void testCalculateFactorial() {
            factorialTNG calculator = new factorialTNG();

            Assertions.assertEquals(calculator.calculateFactorial(4), 24);
            Assertions.assertEquals(calculator.calculateFactorial(1), 1);
            Assertions.assertEquals(calculator.calculateFactorial(5), 120);
        }
}

