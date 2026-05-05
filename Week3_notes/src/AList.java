public class AList {
    private int[] items; // Formerly known as listArray
    private int size;

    public AList() {
        items = new int[999];
        size = 0;
    }

    /** Adds x to the end of our list. */
    public void addLast(int x) {
        items[size] = x;
        size += 1;
    }

    /** Returns the item at index i. */
    public int get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    /** Removes and returns the last item in the list. */
    public int removeLast() {
        size -= 1;
        return items[size]; // Note that we don't need to zero out this item!
    }
}

/* int[] a = new int[size + 1];
System.arraycopy(items, 0, a, 0, size);
a[size] = 11;
items = a;
size = size + 1; */

/*public void insertBack(int x) {
    if (size == items.length) {
           resize(size * RFACTOR);
    }
    items[size] = x;
    size += 1;
}*/ //only double the arry when it is full?


 /* Glorp[] items = (Glorp []) new Object[8]; */ // syntax for generic Alist