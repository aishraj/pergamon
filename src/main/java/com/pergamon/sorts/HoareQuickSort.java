package com.pergamon.sorts;

/**
 * Created by ge3k on 15/4/14.
 */
public class HoareQuickSort  {

    public static void quickSort(Comparable[] a, int lo, int hi) {
        Shuffle.shuffleArray(a);
        sort(a,lo,hi-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo <= hi) {
            int p = partition(a,lo,hi);
            sort(a,lo,p-1);
            sort(a,p+1,hi);
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
