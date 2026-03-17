package com.dsa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Deque;

public class ScratchPad {

  public static void main(String[] args) {

//    Deque<String> taskList = new ArrayDeque<>();
//    taskList.add("test");
//    taskList.add("test1");
//    System.out.println(taskList.pollFirst());
//    System.out.println(taskList.peekFirst());
//    System.out.println(taskList.pollLast());
//    System.out.println(taskList.peekFirst());
//    System.out.println(taskList.poll());
//    System.out.println(taskList.poll());
//    System.out.println(taskList.poll());

    int[] [] grid = new int[3][3];
    grid[0] = new int[] {9, 0, 0};

    for(int i = 0 ; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length ; j++) {
        System.out.println(grid[i] [j]);

      }
    }


//    System.out.println(taskList.peek());

    Deque<String> array = new ArrayDeque<>();
    array.addLast("uyuyuy");
    array.addFirst("rrrr");

    int [] num = new int[] {};

    System.out.println();

    System.out.println(array);

    System.out.println(array.peekFirst());

    System.out.println(array.pollFirst());

    System.out.println(array);

    System.out.println(4/2);

    System.out.println(4%2);

    System.out.println(3/2);

    System.out.println(3%2);

    System.out.println(5/2);

    System.out.println(5%2);

    System.out.println(6/2);

    System.out.println(6%2);

    System.out.println(10/2);

    System.out.println(10%2);

    System.out.println(11/2);

    System.out.println(11%2);

    System.out.println(9/3);

    System.out.println(9%3);

    System.out.println(10/3);

    System.out.println(10%3);

    System.out.println(Math.max(111, 10));
    System.out.println(Math.max(111, 10));
    System.out.println(Math.max(111, 10));

    System.out.println(Math.round(10.0));

    double number = 3.14159265358979;
    BigDecimal bd = BigDecimal.valueOf(number);
    bd = bd.setScale(5, RoundingMode.HALF_UP);
    System.out.println(bd.doubleValue());

    String s = "1222";

    System.out.println(s.charAt(0) - '0');

  }

}
