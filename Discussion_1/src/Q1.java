import java.util.*;

public class Q1 {

    public static List<Integer> even(List<Integer> L) {
        List<Integer> output = new ArrayList<>();

        for (Integer integer : L) {
            if (integer % 2 == 0) {
                output.add(integer);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        List<Integer> testlist = new ArrayList<>();

        testlist.add(1);
        testlist.add(2);
        testlist.add(3);
        testlist.add(4);
        testlist.add(5);
        testlist.add(6);

        System.out.println(even(testlist));
    }
}