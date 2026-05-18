public class Q2_3 {
    public static class IntList2 {
        public int first;

        public IntList2 rest;

        public IntList2(int f, IntList2 r) {
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


        /**
         * Returns the int at index i.
         */
        public int get(int i) {
            if (i == 0) {
                return this.first;
            }
            return rest.get(i - 1);
        }

        /**
         * Returns the int at index i, using an iterative approach.
         */
        public int getIterative(int i) {
            IntList2 current = this;
            while (i > 0) {
                current = current.rest;
                i -= 1;
            }
            return current.first;
        }

        /**
         * Return a new list with the same ints, but incremented by 1.
         */
        public IntList2 incrementRecursiveNonDestructive() {
            IntList2 incremented = new IntList2(first + 1, null);
            if (rest != null) {
                incremented.rest = rest.incrementRecursiveNonDestructive();
            }
            return incremented;
        }

        public static void replace(IntList2 L, int a, int b){
            IntList2 p = L;
            while (p.rest != null){
                if (p.first == a) {
                    p.first = b;
                }
                p = p.rest;
            }
        }

        public static IntList2 replace2(IntList2 L, int a, int b){
            if (L == null) {
                return null;
            }
            if (L.first == a){
                return new IntList2(b, replace2(L.rest, a, b));
            }
            else {
                return new IntList2(L.first, replace2(L.rest, a, b));
            }
        }

        public static void replace3(IntList2 L, int a, int b){
            if (L == null) {
                return;
            }
            if (L.first == a) {
                L.first = b;
            }
            replace3(L.rest, a, b);
        }

        public static void RemoveDuplicates(IntList2 p){
            if (p.rest == null){
                return;
            }
            IntList2 curr = p.rest;
            IntList2 prev = p;
            while (curr != null){
                if(curr.first == prev.first){
                    prev.rest = curr.rest;
                } else {
                    prev = curr;
                }
                curr = curr.rest;
            }
        }
    }


}
