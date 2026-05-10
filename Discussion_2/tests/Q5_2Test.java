import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Q5_2Test {

    @Test
    void testBasicCase() {
        List<Integer> input = Arrays.asList(4, 1, 3, 3);

        Map<Integer, List<Integer>> result = Q5_2.buildLessThanMap(input);

        assertThat(result.get(4)).containsExactly(1, 3).inOrder();
        assertThat(result.get(3)).containsExactly(1).inOrder();
        assertThat(result.get(1)).isEmpty();
    }

    @Test
    void testNoDuplicatesInValues() {
        List<Integer> input = Arrays.asList(3, 3, 2, 2, 1);

        Map<Integer, List<Integer>> result = Q5_2.buildLessThanMap(input);

        assertThat(result.get(3)).containsExactly(2, 1).inOrder();
        assertThat(result.get(2)).containsExactly(1).inOrder();
    }

    @Test
    void testSingleElement() {
        List<Integer> input = Arrays.asList(5);

        Map<Integer, List<Integer>> result = Q5_2.buildLessThanMap(input);

        assertThat(result.get(5)).isEmpty();
    }

    @Test
    void testAlreadySorted() {
        List<Integer> input = Arrays.asList(1, 2, 3);

        Map<Integer, List<Integer>> result = Q5_2.buildLessThanMap(input);

        assertThat(result.get(3)).containsExactly(1, 2).inOrder();
        assertThat(result.get(2)).containsExactly(1).inOrder();
    }
}