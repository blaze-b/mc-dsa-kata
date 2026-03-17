package com.dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

  public int[] slidingWindowRun(int [] nums, int k) {

    int n = nums.length;
    int windowMax = n-k+1;

    int [] maxInWindows = new int[windowMax];
    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = 0 ; i < n ; i++) {
      // Remove out-of-window indices
      if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
        deque.pollFirst();
      }

      // Remove indices of smaller elements (from back)
      while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
        deque.pollLast();
      }

      // Add current index at the end of the deque
      deque.offerLast(i);

      // Add maximum to result array once the first window is full
      if (i >= k - 1) {
        maxInWindows[i - k + 1] = nums[deque.peekFirst()]; // The max for the current window
      }
    }


    return maxInWindows;
  }

}
