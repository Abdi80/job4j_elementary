package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus13To62Then7Dot07() {
        double expected = 7.07;
        Point a = new Point(-1, 3);
        Point b = new Point(6, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when58To32Then6Dot32() {
        double expected = 6.32;
        Point a = new Point(5, 8);
        Point b = new Point(3, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10713To1529Then8Dot12() {
        double expected = 8.12;
        Point a = new Point(10, 7, 13);
        Point b = new Point(15, 2, 9);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}