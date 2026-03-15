package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

  @Test
  void reverse_WithValidInputs_Success() {
    // Given
    int input = 123;

    // When
    ReverseInteger integer = new ReverseInteger();
    int reversed = integer.reverse(input);

    // Then
    assertEquals(321, reversed);
  }

  @Test
  void reverse_WithValidInputs2_Success() {
    // Given
    int input = -123;

    // When
    ReverseInteger integer = new ReverseInteger();
    int reversed = integer.reverse(input);

    // Then
    assertEquals(-321, reversed);
  }

}
