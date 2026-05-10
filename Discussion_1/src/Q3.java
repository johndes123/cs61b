import java.util.*;

public class Q3 {

    public static int maxMinDiff(List<Integer> L) {
        int max = L.get(0);
        int min = L.get(0);

        for (int number : L) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();

        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);

        System.out.println(maxMinDiff(testList));
    }
}



