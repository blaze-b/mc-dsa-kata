package com.dsa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

  @Test
  void check_WithVailScenarios_Success() {
    // GIVEN
    int[] input = {2, 7, 5, 6, 8};

    // WHEN
    TwoSum twoSum = new TwoSum();
    int[] indices = twoSum.check(input, 9);

    // THEN
    assertTrue(Arrays.equals(new int[] {0, 1}, indices));
  }

}
