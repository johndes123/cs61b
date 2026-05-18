public interface MyQueue<E> {
    void enqueue(E element); // adds an element to the end of the queue
    E dequeue(); // removes and returns the front element of the queue
    boolean isEmpty(); // returns true if the queue is empty
    int size(); // returns the number of elements in the queue
    // removes all items from the queue
    default void clear() {
        while (this.size() > 0) {
            dequeue();
        }
    }

    // removes all items equal to item from the queue
    // the remaining items should be in the same order as they were before
    // use .equals to compare items rather than ==

    default void remove(E item) {
        int n = size();
        int i = 0;
        while (i < n) {
            E check = dequeue();
            if (!check.equals(item)) {
                enqueue(check);
            }
            i += 1;
        }
    }

    // appends all items from the other queue into this queue
    // this method should be non-destructive on the otherQueue!
    default void appendAll(MyQueue<E> otherQueue) {
        int n = otherQueue.size();
        int i = 0;
        while (i < n) {
            E removed_item = otherQueue.dequeue();
            this.enqueue(removed_item);
            otherQueue.enqueue(removed_item);
            i += 1;
        }
    }
}
