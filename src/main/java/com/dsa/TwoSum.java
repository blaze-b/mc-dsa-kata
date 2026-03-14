package com.dsa;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] check(int[] input, int target) {
    Map<Integer, Integer> mapIndices = new HashMap<>();
    int count = 0;

    for (int i : input) {
      int complement = target - i;
      if(mapIndices.containsKey(complement)) {
        return new int[]{mapIndices.get(complement), count};
      }

      mapIndices.put(i, count);
      count ++;
    }

    return new int [] {};
  }

}
