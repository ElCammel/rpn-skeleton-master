package rpn;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static rpn.CLI.evaluate;

public class CLITest {

    @Test
    public void should_evaluate_single_digit_constant() {
        assertThat(evaluate("5")).isEqualTo(5);
    }

    @Test
    public void should_evaluate_multiple_digits_constant() {
        assertThat(evaluate("17")).isEqualTo(17);
    }

    @Test
    public void should_evaluate_simple_addition() {
        assertThat(evaluate("17 5 +")).isEqualTo(22);
    }

    @Test
    public void should_evaluate_more_complex_addition() {
        assertThat(evaluate("2 3 5 + +")).isEqualTo(10);
    }
    
        @Test
    public void should_evaluate_simple_substraction() {
        assertThat(evaluate("17 5 -")).isEqualTo(12);
    }

    @Test
    public void should_evaluate_more_complex_substraction() {
        assertThat(evaluate("2 3 5 - -")).isEqualTo(-6);
    }
    
            @Test
    public void should_evaluate_simple_mutliplication() {
        assertThat(evaluate("17 5 *")).isEqualTo(85);
    }

    @Test
    public void should_evaluate_more_complex_multiplication() {
        assertThat(evaluate("2 3 5 * *")).isEqualTo(30);
    }
    
            @Test
    public void should_evaluate_simple_division() {
        assertThat(evaluate("17 5 /")).isEqualTo(3.4);
    }

    @Test
    public void should_evaluate_0_divided() {
        assertThat(evaluate("2 0 /")).isEqualTo(0);
    }
    
}
