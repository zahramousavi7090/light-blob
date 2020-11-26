package com.zahra;

public class LightBlob {

    public int lightBlob(int[] blobs) {
        int numOfClick = 0;
        int[] seenBlobs = new int[blobs.length];
        int lastLight = 0;
        for (int i = 0; i < blobs.length; i++) {
            if(blobs[i]>blobs.length){
                throw new IllegalArgumentException();
            }
            seenBlobs[blobs[i] - 1] = blobs[i];

            if (blobs[i] == lastLight + 1) {
                numOfClick++;
                while (lastLight < seenBlobs.length && seenBlobs[lastLight] != 0) {
                    lastLight++;
                }
            }
        }
        return numOfClick;
    }
}
