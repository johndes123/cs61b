public class Q4_3 {
    public class SLList2 {
        private class IntNode2 {
            public int item;
            public IntNode2 next;

            public IntNode2(int item, IntNode2 next) {
                this.item = item;
                this.next = next;
            }
        }

        private IntNode2 sentinel;
        public int size;

        public void addFirst(int x) {
            sentinel.next = new IntNode2(x, sentinel.next);
            size += 1;
        }

        public void insert(int x, int position) {
            IntNode2 pointer = sentinel;
            if (position < 0) {
                position = 0;
            } else if (position > size) {
                position = size;
            }
            while (position > 0) {
                pointer = pointer.next;
                position -= 1;

            }
            pointer.next = new IntNode2(x, pointer.next);
            size += 1;

        }
    }
}
