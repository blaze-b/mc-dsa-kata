package com.dsa;

public class MedianSortedArray {

  public double findMedianSortedArrays(int[] num1, int[] num2) {

    int m = num1.length;
    int n = num2.length;

    int totalMergeArraySize = m + n;

    int[] mergerArray = new int[totalMergeArraySize];

    int i = 0, j = 0, k = 0;

    while (i < m && j < n) {

      if (num1[i] < num2[j]) {
        mergerArray[k++] = num1[i++];
      }
      else {
        mergerArray[k++] = num2[j++];
      }
    }

    while( i < m) {
      mergerArray[k++] = num1[i++];
    }

    while( i < n) {
      mergerArray[k++] = num2[i++];
    }

    for (int merger : mergerArray) {
      System.out.println(merger);
    }

    if (totalMergeArraySize % 2 == 0) {
      return (mergerArray[totalMergeArraySize / 2 - 1]
          + mergerArray[totalMergeArraySize/ 2]) / 2.0 ;
    }

    return mergerArray[totalMergeArraySize / 2];
  }

}
