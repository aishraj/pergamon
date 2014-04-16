package com.pergamon.selection;

import java.util.Comparator;

/**
 * Created by ge3k on 15/4/14 7:47 AM.
 */
public class QuickSelect {
    public static int select (int[] items, int lo, int hi, int k) {
        while(true) {
            int p = partition(items,lo,hi);
            if ( k  > p) {
                lo = p;
            }
            else if (k < p) {
                hi = p;
            }
            else if (k == p) {
                break;
            }
        }
        return items[k];
    }

    private static int partition(int[] items, int lo, int hi) {
        int v = items[lo];
        while(true) {
            while(items[++lo] < hi) {
                if (lo==hi) break;
            }
            while (items[lo])
        }
    }
}
