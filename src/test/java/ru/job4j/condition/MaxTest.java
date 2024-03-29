package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To7Then7() {
        int left = 1;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax89To5Then89() {
        int left = 89;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 89;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To89To55Then89() {
        int first = 6;
        int second = 89;
        int third = 55;
        int result = Max.max(first, second, third);
        int expected = 89;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax89To9To554To48Then554() {
        int first = 89;
        int second = 9;
        int third = 554;
        int fourth = 48;
        int result = Max.max(first, second, third, fourth);
        int expected = 554;
        assertThat(result).isEqualTo(expected);
    }
}