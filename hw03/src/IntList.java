public class IntList {
    int first;
    IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Modifies the original list.
     * You are not allowed to use "new" in this method.
     */
    public static IntList incrRecursiveDestructive(IntList L, int x) {
        // TODO: Fill in this code
        L.first += x;
        if (L.rest != null) {
            L.rest = IntList.incrRecursiveDestructive(L.rest, x);
        }
        return L;
    }

    /*
     * =================================================================
     * OPTIONAL METHODS
     * =================================================================
     */

    /**
     * Returns the sum of all elements in the IntList.
     */
    public int sum() {
        // Optional: Fill in this code
        if (this.rest == null){
            return this.first;
        }
        int first_value = this.first;
        return this.rest.sum() + first_value;
    }
    // rmb to check base case
    /**
     * Destructively adds x to the end of the list.
     */
    public void addLast(int x) {
        // Optional: Fill in this code
        IntList q = this;
        while (q.rest != null) {
            q = q.rest;
        }
        q.rest = new IntList(x, null);
    }
    // need to set a pointer so that we don't destroy structure of original linked list

    /**
     * Destructively adds x to the front of this IntList.
     * This is a bit tricky to implement. The standard way to do this would be
     * to return a new IntList, but for practice, this implementation should
     * be destructive.
     */
    public void addFirst(int x) {
        this.rest = new IntList(this.first, this.rest);
        this.first = x;



        /*IntList q = this;
        int k = this.first;
        int l = 0;
        q.first = x;
        while (q.rest != null) {
            l = q.rest.first;
            q.rest.first = k;
            q = q.rest;
            k = l;
        }
        q.rest = new IntList(l, null);*/

        //this solution is O(n), I could not find the O(1) method
        //O(1) method above from chatgpt, why so smart



    }
}
