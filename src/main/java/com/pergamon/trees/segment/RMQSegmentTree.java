package com.pergamon.trees.segment;

/**
 * Created by ge3k on 15/4/14 8:35 AM.
 */
public class RMQSegmentTree {
    private int[] lookupArray;
    private int[] dataArray;

    private enum TreeDirections {
        LEFT,
        RIGHT
    }

    public int[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(int[] dataArray) {
        this.dataArray = dataArray;
    }

    public int[] getLookupArray() {
        return lookupArray;
    }

    public void setLookupArray(int[] lookupArray) {
        this.lookupArray = lookupArray;
    }

    /**
     * Method to intialize the segment tree. Works like a Binary Heap with a 0 based array implementation.
     * @param node
     * @param beginIndex
     * @param endIndex
     */
    private void initialize(int node, int beginIndex, int endIndex) {
        if (beginIndex == endIndex) {
            lookupArray[node] = beginIndex;
        } else {
            //Initialize the left subtree
            initialize(node*2+1,beginIndex,(beginIndex + endIndex)/2);
            initialize(node*2+2,(beginIndex+endIndex)/2,endIndex);
            if (dataArray[lookupArray[node*2+1]] <= dataArray[lookupArray[node*2+2]]) {
                lookupArray[node] = lookupArray[node*2+1];
            } else {
                lookupArray[node] = lookupArray[node*2+1];
            }
        }
    }

    /**
     * Returns the RMQ in the ranges queryBeginIndex and queryEndIndex inclusive.
     * @param node
     * @param beginIndex
     * @param endIndex
     * @param queryBeginIndex
     * @param queryEndIndex
     * @return -1 if not valid. else the rmq
     */
    public int query(int node,int beginIndex, int endIndex, int queryBeginIndex, int queryEndIndex) {
        int p1,p2;

        if (queryBeginIndex > endIndex || queryEndIndex < beginIndex) {
            return -1;
        }
        if (queryBeginIndex >= beginIndex && queryBeginIndex <= endIndex) {
            return lookupArray[node];
        }

        //Else recurse
        p1 = query(node*2+1,beginIndex,(beginIndex+endIndex)/2,queryBeginIndex,queryEndIndex);
        p2 = query(node*2+2,(beginIndex+endIndex)/2,queryEndIndex,queryBeginIndex,queryEndIndex);

        if (p1 == -1) {
            return p2;
        }
        if (p2 == -1) {
            return p1;
        }
        if (dataArray[p1] <= dataArray[p2]) {
            return dataArray[p1];
        }
        return dataArray[p2];
    }

    public RMQSegmentTree(int dataArraySize, int lookUpArraySize) {
        dataArray = new int[dataArraySize];
        lookupArray = new int[lookUpArraySize];
        initialize(0,0,dataArraySize-1);
    }
}
