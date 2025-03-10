package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus1to12then3Dot16() {
        double expected = 3.16;
        Point a = new Point(0, -1);
        Point b = new Point(1, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to126then12Dot08() {
        double expected =12.08;
        Point a = new Point(1, 1);
        Point b = new Point(12, 6);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when203to304then1Dot41() {
        double expected =1.41;
        Point a = new Point(2, 0,3);
        Point b = new Point(3, 0, 4);
        double output = b.distance3d(a);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to678then1Dot41() {
        double expected =8.66;
        Point a = new Point(1, 2,3);
        Point b = new Point(6, 7, 8);
        double output = b.distance3d(a);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}