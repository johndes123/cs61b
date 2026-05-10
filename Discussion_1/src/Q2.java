import java.util.*;

public class Q2 {

    public static Map<String, Integer> counts(List<String> L) {
        Map<String, Integer> wordcount = new HashMap<>();

        for (String word : L) {
            if (!wordcount.containsKey(word)) {
                wordcount.put(word, 1);
            } else {
                wordcount.put(word, wordcount.get(word) + 1);
            }
        }

        return wordcount;
    }
    void main() {
        List<String> testlist = new ArrayList<>();
        testlist.add("Hello");
        testlist.add("Hello");
        testlist.add("Bye");
        testlist.add("Bye");
        IO.println(counts(testlist));
    }
}



