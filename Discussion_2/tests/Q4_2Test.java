import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Q4_2Test {

    @Test
    void testBasicCapitalization() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));

        Q4_2.capitalize1(list);

        assertThat(list).containsExactly("APPLE", "BANANA", "ORANGE").inOrder();
    }

    @Test
    void testEmptyList() {
        List<String> list = new ArrayList<>();

        Q4_2.capitalize1(list);

        assertThat(list).isEmpty();
    }

    @Test
    void testAlreadyCapitalized() {
        List<String> list = new ArrayList<>(Arrays.asList("HELLO", "WORLD"));

        Q4_2.capitalize1(list);

        assertThat(list).containsExactly("HELLO", "WORLD").inOrder();
    }

    @Test
    void testMixedCase() {
        List<String> list = new ArrayList<>(Arrays.asList("aPpLe", "BaNaNa"));

        Q4_2.capitalize1(list);

        assertThat(list).containsExactly("APPLE", "BANANA").inOrder();
    }
}
