import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;



public class Q3Test {

    @Test
    void testNormalCase() {
        List<Integer> input = List.of(1, 2, 3, 4);

        int result = Q3.maxMinDiff(input);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void testSingleElement() {
        List<Integer> input = List.of(5);

        int result = Q3.maxMinDiff(input);

        assertThat(result).isEqualTo(0);
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> input = List.of(-10, -3, -20, -1);

        int result = Q3.maxMinDiff(input);

        assertThat(result).isEqualTo(19);
    }

    @Test
    void testMixedNumbers() {
        List<Integer> input = List.of(-5, 0, 10, 3);

        int result = Q3.maxMinDiff(input);

        assertThat(result).isEqualTo(15);
    }
}
