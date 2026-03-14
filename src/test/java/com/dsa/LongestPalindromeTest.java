package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestPalindromeTest {

  @Test
  void longestPalindrome_WithValidInputs_Success() {
    // GIVEN
    String input = "babad";

    // WHEN
    LongestPalindrome solution = new LongestPalindrome();
    String longestPalindrome = solution.longestPalindrome(input);

    // THEN
    assertEquals("aba", longestPalindrome);
  }

}
