import java.util.*;

public class Q4_2 {

    /** Capitalizes all strings in the given list in place */
    public static void capitalize1(List<String> L) {
        for (int i = 0; i < L.size(); i++) {
            String s = L.get(i);
            String cap_s = s.toUpperCase();
            L.set(i, cap_s);
        }
    }

    public static void main(String[] args) {
        List<String> testlist =
                new ArrayList<>(List.of("apple", "banana", "orange"));

        capitalize1(testlist);
        System.out.println(testlist);
    }
}
