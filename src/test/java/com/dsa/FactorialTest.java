package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialTest {

  @Test
  void factorial_WithValidDetails_Success() {
    // Given
    int num = 5;

    // When
    Factorial factorial = new Factorial();
    int result = factorial.factorial(num);

    // Then
    assertEquals(120, result);

  }

}
