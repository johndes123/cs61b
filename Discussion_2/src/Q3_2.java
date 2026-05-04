/** Returns a list containing the common items of the two given lists */
public static List<Integer> common1(List<Integer> L1, List<Integer> L2) {
    List<Integer> common_list = new ArrayList<>();
    for (int L: L1){
        if (L2.contains(L) && !common_list.contains(L)) {
            common_list.add(L);
        }
    }
    return common_list;
}



void main() {
    List<Integer> List1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
    List<Integer> List2 = new ArrayList<>(List.of(2, 4, 6));
    IO.println(common1(List1, List2));


}