package com.pergamon.sorts

import junit.framework.Assert

/**
 * Created by ge3k on 15/4/14 7:38 AM.
 */
class ThreeWayQuickSortTest extends GroovyTestCase {
    void testSort() {
        Integer[] testArray = new Integer[10];
        for (int i = 9; i >= 0; i--) {
            testArray[i] = i;
        }
        ThreeWayQuickSort.sort(testArray,0,9);
        for (int i = 0; i < 10; i++) {
            assertEquals(i,testArray[i])
        }
    }
}
