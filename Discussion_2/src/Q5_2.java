/** Returns a map from each integer x in the list to a list (without duplicates)
 * of all integers in the list that are less than x. */
public static Map<Integer, List<Integer>> buildLessThanMap(List<Integer> L) {
    Map<Integer, List<Integer>> output = new HashMap<>();
    for (int i = 0; i < L.size(); i++) {
        if (!output.containsKey(L.get(i))) {
            output.put(L.get(i), new ArrayList<>());
        }
        for (int j = 0; j < L.size(); j++) {
            if (L.get(j) < L.get(i) && !output.get(L.get(i)).contains(L.get(j))) {
                output.get(L.get(i)).add(L.get(j));
            }
        }
    }
    return output;
}

void main(){
    List<Integer> testlist = new ArrayList<>(List.of(4, 1, 3, 3));
    IO.println(buildLessThanMap(testlist));
}