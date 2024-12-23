import com.chunosov.Factorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тест для расчёта факториала числа")
public class FactorialTest {

    Factorial factorial = new Factorial();

    @Test
    @DisplayName("Расчёт для 0")
    void testFactorialOfZero() {
        assertEquals(1, factorial.calculateFactorial(0));
    }

    @Test
    @DisplayName("Расчёт для 120")
    void testFactorialOfPositiveNumber() {
        assertEquals(120, factorial.calculateFactorial(5));
    }

    @Test
    @DisplayName("Расчёт для 1")
    void testFactorialOfOne() {
        assertEquals(1, factorial.calculateFactorial(1));
    }

    @Test
    @DisplayName("Расчёт для 3628800")
    void testFactorialOfLargeNumber() {
        assertEquals(3628800, factorial.calculateFactorial(10));
    }

    @Test
    @DisplayName("Расчёт для негативного числа")
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> factorial.calculateFactorial(-1));
    }
}
