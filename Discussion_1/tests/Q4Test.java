import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

public class Q4Test {

    @Test
    void testNormalSentence() {
        List<String> input = List.of(
                "I", "love", "Java", "but",
                "I", "love", "Python", "more"
        );

        Map<String, List<String>> result = Q4.listOfFollowers(input);

        assertThat(result.get("I")).containsExactly("love", "love").inOrder();
        assertThat(result.get("love")).containsExactly("Java", "Python").inOrder();
        assertThat(result.get("Java")).containsExactly("but");
        assertThat(result.get("but")).containsExactly("I");
        assertThat(result.get("Python")).containsExactly("more");
    }

    @Test
    void testSingleWord() {
        List<String> input = List.of("Hello");

        Map<String, List<String>> result = Q4.listOfFollowers(input);

        assertThat(result).isEmpty();
    }

    @Test
    void testRepeatedWords() {
        List<String> input = List.of("a", "a", "a");

        Map<String, List<String>> result = Q4.listOfFollowers(input);

        assertThat(result.get("a")).containsExactly("a", "a").inOrder();
    }

    @Test
    void testEmptyList() {
        List<String> input = List.of();

        Map<String, List<String>> result = Q4.listOfFollowers(input);

        assertThat(result).isEmpty();
    }
}
