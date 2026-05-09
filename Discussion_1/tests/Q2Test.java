import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

import static com.google.common.truth.Truth.assertThat;


public class Q2Test {

    @Test
    void testCounts_basic() {
        List<String> input = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple"
        );

        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        expected.put("banana", 2);
        expected.put("orange", 1);

        assertThat(Q2.counts(input)).isEqualTo(expected);
    }
}
