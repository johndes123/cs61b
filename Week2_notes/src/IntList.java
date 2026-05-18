public class IntList {
    public int first;

    public IntList rest;
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    //Then we can add a size method to the class
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }


/** Returns the int at index i. */
public int get(int i) {
    if (i == 0) {
        return this.first;
    }
    return rest.get(i - 1);
}

/** Returns the int at index i, using an iterative approach. */
public int getIterative(int i) {
    IntList current = this;
    while (i > 0) {
        current = current.rest;
        i -= 1;
    }
    return current.first;
}

/** Return a new list with the same ints, but incremented by 1. */
public IntList incrementRecursiveNonDestructive() {
    IntList incremented = new IntList(first + 1, null);
    if (rest != null) {
        incremented.rest = rest.incrementRecursiveNonDestructive();
    }
    return incremented;
}

public static void main() {
    IntList l1 = new IntList(5, new IntList(10, new IntList(15, null)));

    IntList l2 = new IntList(5, null);
    l2.rest = new IntList(10, null);
    l2.rest.rest = new IntList(15, null);

    IntList l3 = new IntList(15, null);
    l3 = new IntList(10, l3);
    l3 = new IntList(5, l3);
}
}



