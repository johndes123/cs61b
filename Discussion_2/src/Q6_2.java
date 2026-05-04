/** Returns an array containing only the positive integers from the given list */
public static int[] filterPositive(List<Integer> L) {
    List<Integer> newlist = new ArrayList<>();
    for (Integer value: L){
        if (value > 0){
            newlist.add(value);
        }
    }
    int[] output = new int[newlist.size()];
    for (int i = 0; i < newlist.size(); i++){
        output[i] = newlist.get(i);
    }
    return output;
}


void main() {
    List<Integer> testlist = new ArrayList<>(List.of(-1, -2, -3 , 1, 2, 3));
    IO.println(Arrays.toString(filterPositive(testlist)));
}