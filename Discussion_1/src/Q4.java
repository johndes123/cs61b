public static Map<String, List<String>> listOfFollowers(List<String> x) {
    Map<String, List<String>> followers = new HashMap<>();

    for (int i = 0; i < x.size() - 1; i++) {
        String word = x.get(i);
        String next = x.get(i + 1);

        followers.putIfAbsent(word, new ArrayList<>());
        followers.get(word).add(next);
    }

    return followers;
}
void main(){
    List<String> stringlist = new ArrayList<>();
    stringlist.add("I");
    stringlist.add("love");
    stringlist.add("Java");
    stringlist.add("but");
    stringlist.add("I");
    stringlist.add("love");
    stringlist.add("Python");
    stringlist.add("more");
    IO.println(listOfFollowers(stringlist));

}

/* Got help from chatgpt for this question, the key is to realize that I can define next first,
and also that I can get the array value from the key then add next to it!
 */