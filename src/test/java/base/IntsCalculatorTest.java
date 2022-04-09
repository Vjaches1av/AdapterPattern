package base;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {
    private static IntsCalculator calculator;

    @BeforeAll
    static void f() {
        calculator = new IntsCalculator();
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "45,88,133"})
    void sum(int a, int b, int c) {
        assertEquals(c, calculator.sum(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"6,8,48", "12,12,144"})
    void mult(int a, int b, int c) {
        assertEquals(c, calculator.mult(a, b));
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,1", "6,3,216"})
    void pow(int a, int b, int c) {
        assertEquals(c, calculator.pow(a, b));
    }
}
