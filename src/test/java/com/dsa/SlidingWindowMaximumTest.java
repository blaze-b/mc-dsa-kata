package com.dsa;

import java.beans.BeanProperty;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SlidingWindowMaximumTest {

  @Test
  void  tes() {
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
    int[] result = slidingWindowMaximum.slidingWindowRun(nums, k);

    System.out.println(Arrays.toString(result));
  }

}
