package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MedianSortedArrayTest {

  @Test
  void findMedianSortedArrays_WithValidDetails_Success() {
    // GIVEN
    int [] num1 = new int[] {1, 3};
    int [] num2 = new int[] {2};

    // WHEN
    MedianSortedArray sortedArray = new MedianSortedArray();
    double result = sortedArray.findMedianSortedArrays(num1, num2);

    // THEN
    assertEquals(2.0, result);
  }

}
