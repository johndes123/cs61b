import java.util.*;

public class Q6_2 {

    /** Returns an array containing only the positive integers from the given list */
    public static int[] filterPositive(List<Integer> L) {
        List<Integer> newlist = new ArrayList<>();

        for (Integer value : L) {
            if (value > 0) {
                newlist.add(value);
            }
        }

        int[] output = new int[newlist.size()];
        for (int i = 0; i < newlist.size(); i++) {
            output[i] = newlist.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        List<Integer> testlist =
                new ArrayList<>(List.of(-1, -2, -3, 1, 2, 3));

        System.out.println(Arrays.toString(filterPositive(testlist)));
    }
}