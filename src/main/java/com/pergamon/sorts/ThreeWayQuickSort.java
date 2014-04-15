package com.pergamon.sorts;

/**
 * Created by ge3k on 15/4/14 7:21 AM.
 */
public class ThreeWayQuickSort {

    private static void arrSwap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }

    public void sort(Comparable[] a, int lo, int hi) {
        Comparable v = a[lo];
        int lt = lo;
        int gt = hi;
        int i = lo;
        while(i <= gt) {
            if (a[i].compareTo(v) < 0) {
                arrSwap(a,i,lt);
                i++;
                lt++;
            }
            else if (a[i].compareTo(v) > 0) {
                arrSwap(a,gt,i);
                gt--;
            }
            else  {
                i++;
            }
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);

    }
}
