public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }

        /*public int size(){
            if (next == null){
                return 1;
            }
            return next.size() + 1;
        }*/

        /* Recursive helper */
        /*public void addLast(int x) {
            if (next == null) {
                next = new IntNode(x, null);
            } else {
                next.addLast(x);
            }
        }*/

    }
    // first item at sentinel.next if it exists
    private IntNode sentinel;
    private int size;
    private IntNode last;

    public SLList(int x) {
        sentinel = new IntNode(69, null);
        IntNode first = new IntNode(x, null);
        sentinel.next = first;

        last = first;
        size = 1;
    }

    public SLList() {
        sentinel = new IntNode(69, null);
        last = sentinel;
        size = 0;
    }

    /**
     * Adds an item to the front of the list.
     */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        if (size == 0) {
            last = sentinel.next;
        }
        size += 1;
    }

    /**
     * Retrieves the front item from the list.
     */
    public int getFirst() {
        return sentinel.next.item;
    }

    /**
     * Adds an item to the end of the list.
     */
    public void addLast(int x) {
        /*if (first == null){
            first = new IntNode(x, null);
            return;
            //return so that now you have nonempty SLList//
            //If it feels weird, can do if-else with everything below as else branch//
        }*/
        IntNode newNode = new IntNode(x, null);

        last.next = newNode;   // works even if empty
        last = newNode;

        size += 1; //this is the faster method hmmmm

        /*IntNode p = sentinel;

        /* Advance p to the end of the list. */
       /* while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null); */
    }

    /**
     * Returns the size of the list starting at IntNode p.
     */
    /*private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }

        return 1 + size(p.next);
    }*/ // no longer needed if we are caching


    /**
     * Returns the number of items in the list using recursion.
     */
    public int size() {
        return size;
    }
}

void main() {
    SLList testlist = new SLList(7);
    testlist.addFirst(8);
    testlist.addFirst(9);
    IO.println(testlist.size());
}
