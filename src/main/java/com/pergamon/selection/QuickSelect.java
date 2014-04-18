package com.pergamon.selection;

import java.util.Comparator;

/**
 * Created by ge3k on 15/4/14 7:47 AM.
 */
public class QuickSelect {

    /**
     *
     * @param a
     * @param k
     * @param lo
     * @param hi
     * @return the 0 based nth smallest element
     */
    public static int select(Integer[] a ,int k, int lo, int hi) {
        if (lo == hi) {
            return a[lo];
        }
        while (true) {
            int p = partition(a,lo,hi);
            if (k < p) {
                hi = p-1;
            }
            else if (k > p) {
                lo = p+1;
            }
            else {
                return p;
            }
        }
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi +1;
        while (true) {
            while (a[++i].compareTo(a[lo]) < 0) {
                if (i==hi) break;
            }
            while (a[lo].compareTo(a[--j]) < 0) {
                if (j == lo) break;
            }
            if ( i >= j) {
                break;
            }
            arrSwap(a,i,j);
        }

        arrSwap(a,lo,j);
        return j;

    }

    private static void arrSwap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }

}
