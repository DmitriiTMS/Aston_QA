import com.chunosov.Factorial;
import jdk.jfr.Name;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test(description = "Расчёт для 0")
    public void testFactorialOfZero() {
        assertEquals (factorial.calculateFactorial(0), 1);
    }

    @Test(description = "Расчёт для 120")
    public void testFactorialOfPositiveNumber() {
        assertEquals(factorial.calculateFactorial(5), 120);
    }

    @Test(description = "Расчёт для 1")
    public void testFactorialOfOne() {
        assertEquals(factorial.calculateFactorial(1), 1);
    }

    @Test(description = "Расчёт для 3628800")
    public void testFactorialOfLargeNumber() {
        assertEquals(factorial.calculateFactorial(10), 3628800);
    }

    @Test(description = "Расчёт для негативного числа", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        factorial.calculateFactorial(-1);
    }
}
