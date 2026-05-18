/** Rotates the Deque left by x places. Assume x is non-negative.
 * Example: [3, 6, 9, 12, 15, 18].rotateLeft(4) yields [15, 18, 3, 6, 9, 12].
 */
/*public class Q2_4 {
    public void rotateLeft(int x) {
        if (size <= 1) {return; }
        for (i = 0; i < size; i++) {
        Node OldLast = sentinel.prev;
        Node OldFirst = sentinel.next;
        Node OldSecond = sentinel.next.next;
        sentinel.next = OldSecond;
        OldFirst.next = sentinel;
        OldFirst.prev = OldLast;
        OldLast.next = OldFirst;
        sentinel.prev = OldFirst;
        OldSecond.prev = sentinel;

    }
}

public void rotateLeft(int x) {
       if (size <= 1) { return; }
       x = x % size;
       while (x > 0) {
       T OldCard = removeFirst();
       addLast(OldCard);
       x -= 1;
       }




}
 */