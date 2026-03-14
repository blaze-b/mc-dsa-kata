package com.dsa;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowRateLimiter {

  Map<String, Deque<Integer>> map = new HashMap<>();

  private static final Integer TOTAL_REQUEST_PER_SEC = 3;
  private static final Integer TOTAL_WINDOW_SECONDS = 10;

  public boolean allowRequest(final String user, final int timestamp) {
    map.putIfAbsent(user, new ArrayDeque<>());
    Deque<Integer> q = map.get(user);

    while (!q.isEmpty() && timestamp - q.peekFirst() >= TOTAL_WINDOW_SECONDS) {
      q.pollFirst();
    }

    if (q.size() < TOTAL_REQUEST_PER_SEC) {
      q.addLast(timestamp);
      return true;
    }

    return false;
  }

}
