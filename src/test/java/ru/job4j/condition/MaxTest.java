package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2to5Then5() {
        int one = 3;
        int two = 2;
        int three = 5;
        int result = Max.max(one, two, three);
        int expected = 5;
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
    void whenMax4To2To6To9Then4() {
        int one = 4;
        int two = 4;
        int three = 6;
        int four = 9;
        int result = Max.max(one, two, three, four);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}