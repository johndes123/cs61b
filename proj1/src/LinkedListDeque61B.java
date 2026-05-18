import java.util.List;
import java.util.ArrayList;

public class LinkedListDeque61B<T> implements Deque61B<T>{

    /**
     * Add {@code x} to the front of the deque. Assumes {@code x} is never null.
     *
     * @param x item to add
     */
    @Override
    public void addFirst(T x) {
        Node to_add = new Node(null, x, null);
        Node original = sentinel.next;
        original.prev = to_add;
        to_add.next = original;
        sentinel.next = to_add;
        to_add.prev = sentinel;

        size += 1;

    }

    /**
     * Add {@code x} to the back of the deque. Assumes {@code x} is never null.
     *
     * @param x item to add
     */
    @Override
    public void addLast(T x) {
        Node to_add = new Node(null, x, null);
        Node original = sentinel.prev;
        original.next = to_add;
        to_add.prev = original;
        sentinel.prev = to_add;
        to_add.next = sentinel;
        size += 1;

    }

    /**
     * Returns a List copy of the deque. Does not alter the deque.
     *
     * @return a new list copy of the deque.
     */
    @Override
    public List<T> toList() {
        List<T> returnList = new ArrayList<>();
        Node first = sentinel.next;
        int counter = size;
        while(counter != 0) {
            returnList.add(first.item);
            first = first.next;
            counter -= 1;
        }
        return returnList;
    }


    /**
     * Returns if the deque is empty. Does not alter the deque.
     *
     * @return {@code true} if the deque has no elements, {@code false} otherwise.
     */
    @Override
    public boolean isEmpty() {
        Node next = sentinel.next;
        if (next == sentinel) {
            return true;
        }
        return false;
    }
    // or can just return size == 0; was abit mislead because question started with return false
    /**
     * Returns the size of the deque. Does not alter the deque.
     *
     * @return the number of items in the deque.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Return the element at the front of the deque, if it exists.
     *
     * @return element, otherwise {@code null}.
     */
    @Override
    public T getFirst() {
        if (size != 0) {
            return sentinel.next.item;
        }
        else {
            return null;
        }
    }

    /**
     * Return the element at the back of the deque, if it exists.
     *
     * @return element, otherwise {@code null}.
     */
    @Override
    public T getLast() {
        if (size == 0) {
            return null;
        }
        return sentinel.prev.item;
    }

    /**
     * Remove and return the element at the front of the deque, if it exists.
     *
     * @return removed element, otherwise {@code null}.
     */
    @Override
    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        Node first = sentinel.next;
        Node second = first.next;
        sentinel.next = second;
        second.prev = sentinel;
        size -= 1;
        return first.item;

    }

    /**
     * Remove and return the element at the back of the deque, if it exists.
     *
     * @return removed element, otherwise {@code null}.
     */
    @Override
    public T removeLast() {
        if (size == 0) {
            return null;
        }
        Node first = sentinel.prev;
        Node second = first.prev;
        sentinel.prev = second;
        second.next = sentinel;
        size -= 1;
        return first.item;
    }

    /**
     * The Deque61B abstract data type does not typically have a get method,
     * but we've included this extra operation to provide you with some
     * extra programming practice. Gets the element, iteratively. Returns
     * null if index is out of bounds. Does not alter the deque.
     *
     * @param index index to get
     * @return element at {@code index} in the deque
     */
    @Override
    public T get(int index) {
        if (index > size - 1) {
            return null;
        } else if (index < 0) {
            return null;
        } else {
            int pointer = index;
            Node current = sentinel.next;
            while (pointer > 0) {
                current = current.next;
                pointer -= 1;
            }
            return current.item;
        }

    }

    /**
     * This method technically shouldn't be in the interface, but it's here
     * to make testing nice. Gets an element, recursively. Returns null if
     * index is out of bounds. Does not alter the deque.
     *
     * @param index index to get
     * @return element at {@code index} in the deque
     */
    @Override
    public T getRecursive(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return helper(sentinel.next, index);
    }

    private T helper(Node n, int index) {
        if (index == 0) {
            return n.item;
        }
        return helper(n.next, index - 1);
    }


    private class Node {
        public T item;
        public Node prev;
        public Node next;

        public Node(Node n, T i, Node m) {
            prev = n;
            item = i;
            next = m;
        }
    }

    private Node sentinel;
    private int size;
    public LinkedListDeque61B() {
        sentinel = new Node(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public static void main(String[] args) {
        Deque61B<Integer> lld = new LinkedListDeque61B<>();
        lld.addLast(0);   // [0]
        lld.addLast(1);   // [0, 1]
        lld.addFirst(-1); // [-1, 0, 1]
    }
}