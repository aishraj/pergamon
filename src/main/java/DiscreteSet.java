/**
 * Created by ge3k on 2/4/14.
 */
public class DiscreteSet {

    int[] parentArray;
    int[] rank;
    int count;

    public DiscreteSet(int N) {
        if (N < 0) throw new IllegalArgumentException();
        this.count = N;
        parentArray = new int[N];
        rank = new int[N];
        for (int i = 0; i < N; i++) {
            parentArray[i] = i;
            rank[i] = 0;
        }
    }

    public void union(int p, int q) {
        if (connected(p,q)) {
            return;
        }
        if (rank[p] > rank[q]) {
            parentArray[q] = p;
        }
        else if ( rank[q] > rank[p]) {
            parentArray[p] = q;
        }
        else {
            parentArray[q] = p;
            rank[p] += rank[q];
            count--;
        }
    }

    public int find(int p) {
        if (p < 0 || p > parentArray.length) throw new IndexOutOfBoundsException();
        while ( p != parentArray[p]) {
            parentArray[p] = parentArray[parentArray[p]];
            p = parentArray[p];
        }
        return p;
    }

    public boolean connected(int p, int q) {
        if (find(p) == find(q)) {
            return true;
        }
        return false;
    }

    public int count() {
        return count;
    }
}
