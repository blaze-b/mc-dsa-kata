package com.dsa;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

  @Test
  void check_WithVailScenarios_Success() {
    TwoSum twoSum = new TwoSum();

    int[] input = {2, 7, 5, 6, 8};
    int[] indices = twoSum.check(input, 9);

    System.out.println(indices[0]);
    System.out.println(indices[1]);
  }

}
