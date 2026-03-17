package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void fib_Test() {
    Fibonacci fibonacci = new Fibonacci();
    int result = fibonacci.fib(6);

    assertEquals(8, result);
    System.out.println(fibonacci.map);
  }

}
