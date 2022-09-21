package cr.ac.itcr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void one_plus_one() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

		@Test
		@DisplayName("10 / 2 = 5")
    void ten_div_two() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.div(10, 2), "10 / 2 should equal 5");
    }

		@Test
		@DisplayName("3 * 7 = 21")
    void three_mul_seven() {
        Calculator calculator = new Calculator();
        assertEquals(21, calculator.mul(3, 7), "3 * 7 should equal 21");
    }
}
