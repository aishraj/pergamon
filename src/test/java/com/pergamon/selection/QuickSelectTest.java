package com.pergamon.selection;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ge3k on 18/4/14 6:07 AM.
 */
public class QuickSelectTest {
    @Test
    public void testSelect() throws Exception {
        int[] testArrayPrim = {1,2,4,5,6,3,0};
        Integer[] testArray = new Integer[testArrayPrim.length];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = testArrayPrim[i];
        }
        int k = QuickSelect.select(testArray,1,0,testArray.length-1);
        Assert.assertEquals(k,1);
    }
}
