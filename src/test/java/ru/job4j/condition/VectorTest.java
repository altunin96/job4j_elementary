package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    @Test
    void whenVector56And44ThenResult910() {
        int x1 = 5, y1 = 6, x2 = 4, y2 = 4;
        String expected = "(9, 10)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus33And66ThenResult33() {
        int x1 = -3, y1 = -3, x2 = 6, y2 = 6;
        String expected = "(3, 3)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenVectorsMinus56AndMinus34thenResultMinus810() {
        int x1 = -5, y1 = -6, x2 = -3, y2 = -4;
        String expected = "(-8, -10)";
        String output = Vector.addVectors(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }
}