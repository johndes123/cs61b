import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Q6_2Test {

    @Test
    void testBasicFiltering() {
        List<Integer> input = Arrays.asList(-1, -2, -3, 1, 2, 3);

        int[] result = Q6_2.filterPositive(input);

        assertThat(result).asList().containsExactly(1, 2, 3).inOrder();
    }

    @Test
    void testAllNegative() {
        List<Integer> input = Arrays.asList(-5, -4, -3);

        int[] result = Q6_2.filterPositive(input);

        assertThat(result).isEmpty();
    }

    @Test
    void testAllPositive() {
        List<Integer> input = Arrays.asList(1, 2, 3);

        int[] result = Q6_2.filterPositive(input);

        assertThat(result).asList().containsExactly(1, 2, 3).inOrder();
    }

    @Test
    void testEmptyList() {
        List<Integer> input = new ArrayList<>();

        int[] result = Q6_2.filterPositive(input);

        assertThat(result).isEmpty();
    }

    @Test
    void testMixedWithZero() {
        List<Integer> input = Arrays.asList(0, -1, 2, 0, 3);

        int[] result = Q6_2.filterPositive(input);

        assertThat(result).asList().containsExactly(2, 3).inOrder();
    }
}