package com.dsa;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SlidingWindowRateLimiterTest {

  @Test
  void allowRequest_WithValidRequest_Success() {

    // WHEN & THEN
    SlidingWindowRateLimiter slidingWindowRateLimiter = new SlidingWindowRateLimiter();

    boolean success1 = slidingWindowRateLimiter.allowRequest("u1", 1);
    assertTrue(success1);
    boolean success2 = slidingWindowRateLimiter.allowRequest("u1", 2);
    assertTrue(success2);
    boolean success3 = slidingWindowRateLimiter.allowRequest("u1", 3);
    assertTrue(success3);
    boolean success4 = slidingWindowRateLimiter.allowRequest("u1", 4);
    assertFalse(success4);
    boolean success5 = slidingWindowRateLimiter.allowRequest("u1", 5);
    assertFalse(success5);
    boolean success6 = slidingWindowRateLimiter.allowRequest("u1", 20);
    assertTrue(success6);
  }


}
