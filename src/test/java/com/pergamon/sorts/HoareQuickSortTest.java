package com.pergamon.sorts;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ge3k on 15/4/14 7:13 AM.
 */
public class HoareQuickSortTest {
    @Test
    public void testQuickSort() throws Exception {
        Integer[] temp = new Integer[10];
        for (int i = 9; i >= 0 ; i--) {
            temp[i] = i;
        }
        HoareQuickSort.quickSort(temp,0,10);
        for (int i = 0; i < 10; i++) {
            Integer t = new Integer(i);
            Integer j = new Integer(temp[i]);
            Assert.assertEquals(t,j);
        }
    }
}
