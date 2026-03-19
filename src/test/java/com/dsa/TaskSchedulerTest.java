package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TaskSchedulerTest {

  @Test
  void leastInterval_WithValidInputs_Success() {
    // GIVEN
    char[] input = {'A', 'A', 'A', 'B', 'B', 'B'};
    int n = 2;

    // WHEN
    TaskScheduler scheduler = new TaskScheduler();
    int interval = scheduler.leastInterval(input, n);

    // THEN
    assertEquals(8, interval);
  }

  @Test
  void leastIntervalMaxHeap_WithValidInputs_Success() {
    // GIVEN
    char[] input = {'A', 'A', 'A', 'B', 'B', 'B'};
    int n = 2;

    // WHEN
    TaskScheduler scheduler = new TaskScheduler();
    int interval = scheduler.leastIntervalMaxHeap(input, n);

    // THEN
    assertEquals(8, interval);
  }

}
