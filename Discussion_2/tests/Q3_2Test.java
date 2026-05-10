import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Q3_2Test {

    @Test
    void testCommonBasic() {
        List<Integer> L1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> L2 = Arrays.asList(2, 4, 6);

        List<Integer> result = Q3_2.common1(L1, L2);

        assertThat(result).containsExactly(2, 4, 6).inOrder();
    }

    @Test
    void testNoCommonElements() {
        List<Integer> L1 = Arrays.asList(1, 3, 5);
        List<Integer> L2 = Arrays.asList(2, 4, 6);

        List<Integer> result = Q3_2.common1(L1, L2);

        assertThat(result).isEmpty();
    }

    @Test
    void testDuplicatesInInput() {
        List<Integer> L1 = Arrays.asList(1, 2, 2, 3, 3, 3);
        List<Integer> L2 = Arrays.asList(2, 3);

        List<Integer> result = Q3_2.common1(L1, L2);

        assertThat(result).containsExactly(2, 3).inOrder();
    }

    @Test
    void testEmptyLists() {
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = Arrays.asList(1, 2, 3);

        List<Integer> result = Q3_2.common1(L1, L2);

        assertThat(result).isEmpty();
    }

    @Test
    void testOrderFollowsL1() {
        List<Integer> L1 = Arrays.asList(6, 4, 2);
        List<Integer> L2 = Arrays.asList(2, 4, 6);

        List<Integer> result = Q3_2.common1(L1, L2);

        assertThat(result).containsExactly(6, 4, 2).inOrder();
    }
}
