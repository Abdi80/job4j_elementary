package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman175Then74Dot75() {
        short input = 175;
        double expected = 74.75;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}