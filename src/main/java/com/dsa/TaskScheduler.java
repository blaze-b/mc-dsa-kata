package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {

  public int leastInterval(char[] tasks, int n) {

    // A-Z characters
    int [] freq = new int[26];

    // frequncy
    for (char t : tasks) {
      freq[t - 'A'] ++;
    }

    Arrays.sort(freq);

    int maxFreq = freq[25];
    int maxCount = 0;

    // Count how many task has max frequency

    for (int i = 25; i>=0; i--) {

      if(freq[i] == maxFreq) {
        maxCount ++;
      }

    }

    System.out.println(maxFreq);
    System.out.println(maxCount);

    int formula = (maxFreq - 1) * (n + 1) + maxCount;

    System.out.println(formula);

    return Math.max(tasks.length, formula);

  }

  public int leastIntervalMaxHeap(char[] tasks, int n) {

    Map<Character, Integer> map = new HashMap<>();

    for (char c: tasks) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    maxHeap.addAll(map.values());

    int time = 0;

    while (!maxHeap.isEmpty()) {

      List<Integer> temp = new ArrayList<>();

      int cycle = n + 1;

      while (cycle > 0 && !maxHeap.isEmpty()) {
        int freq = maxHeap.poll();

        if (freq > 1) {

          temp.add(freq - 1);
        }

        time ++;

        cycle--;


      }

      for (int t : temp) {
        maxHeap.offer(t);
      }

      if (!maxHeap.isEmpty()) {
        time += cycle; // idle time
      }

    }

    return time;

  }

}
