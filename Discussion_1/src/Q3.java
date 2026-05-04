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


void main() {
    List<Integer> Testlist = new ArrayList<>();
    Testlist.add(1);
    Testlist.add(2);
    Testlist.add(3);
    Testlist.add(4);
    IO.println(maxMinDiff(Testlist));

    }

