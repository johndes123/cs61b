public class Q3_3 {
    public static void RemoveDuplicates(Q2_3.IntList2 p) {
        if (p.rest == null) {
            return;
        }
        Q2_3.IntList2 curr = p.rest;
        Q2_3.IntList2 prev = p;
        while (curr != null) {
            if (curr.first == prev.first) {
                prev.rest = curr.rest;
            } else {
                prev = curr;
            }
            curr = curr.rest;
        }
    }
}
