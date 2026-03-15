package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringToIntegerAtoiTest {

  @Test
  void myAtoi_ValidInputs_Success() {
    // Given
    String input = "49";

    // When
    StringToInteger toInteger = new StringToInteger();
    int result = toInteger.myAtoi(input);

    // Then
    assertEquals(49, result);
  }

}
