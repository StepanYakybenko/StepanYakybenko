import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class factorialU5Test {
        @Test
        void calculateFactorial () {
            int result = factorialU5.calculateFactorial(0);
            assertEquals(1, result);
        }

        @Test
        void testFactorialOfFive () {
            int result = factorialU5.calculateFactorial(5);
            assertEquals(120, result);
        }

        @Test
        void testFactorialOfFour () {
            int result = factorialU5.calculateFactorial(4);
            assertEquals(24, result);
        }
 }

