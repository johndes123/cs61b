import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation {

    private WeightedQuickUnionUF ufP;
    private WeightedQuickUnionUF ufF;
    private int top;
    private int bottom;
    private int n;
    private boolean[] open1;
    private int opencount;
    public Percolation(int N) {
        if (N <= 0) throw new IllegalArgumentException();
        ufP = new WeightedQuickUnionUF(N * N + 2);
        ufF = new WeightedQuickUnionUF(N * N + 2);
        n = N;
        top = n * n;
        bottom = n * n + 1;
        open1 = new boolean[N * N];


    }

    public void open(int row, int col) {
        if (row < 0 || row >= n || col < 0 || col >= n) {
            throw new IndexOutOfBoundsException();
        }

        int idx = row * n + col;

        if (!open1[idx]) {
            open1[idx] = true;
            opencount++;
        } else {
            return;
        }

        if (row > 0 && open1[idx - n]) {
            ufP.union(idx, idx - n);
            ufF.union(idx, idx - n);
        }
        if (row < n - 1 && open1[idx + n]) {
            ufP.union(idx, idx + n);
            ufF.union(idx, idx + n);
        }
        if (col > 0 && open1[idx - 1]) {
            ufP.union(idx, idx - 1);
            ufF.union(idx, idx - 1);
        }
        if (col < n - 1 && open1[idx + 1]) {
            ufP.union(idx, idx + 1);
            ufF.union(idx, idx + 1);
        }
        if (row == 0) {
            ufP.union(idx, top );
            ufF.union(idx, top);
        }
        if (row == n - 1) {
            ufP.union(idx, bottom);
        }


    }

    public boolean isOpen(int row, int col) {
        if (row < 0 || row >= n || col < 0 || col >= n) {
            throw new IndexOutOfBoundsException();
        }

        int idx = row * n + col;
        return open1[idx];
    }

    public boolean isFull(int row, int col) {
        if (row < 0 || row >= n || col < 0 || col >= n) {
            throw new IndexOutOfBoundsException();
        }

        int idx = row * n + col;
        return ufF.find(idx) == ufF.find(top);
    }

    public int numberOfOpenSites() {
        return opencount;
    }

    public boolean percolates() {
       return ufP.find(top) == ufP.find(bottom);
    }

    // TODO: Add any useful helper methods (we highly recommend this!).
    // TODO: Remove all TODO comments before submitting.

}

