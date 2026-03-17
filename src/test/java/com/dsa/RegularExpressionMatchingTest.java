package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RegularExpressionMatchingTest {

  @Test
  void isMatch_ValidNights_Success() {
    //Given
    String s = "aa";
    String p = "a*";

    // When
    RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
    boolean result = regularExpressionMatching.isMatch(s, p);

    // Then
    assertTrue(result);
  }

}
