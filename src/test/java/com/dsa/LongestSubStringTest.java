package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LongestSubStringTest {

  @ParameterizedTest
  @CsvSource({"abcabcbb,3"})
  void getLongestSubString_WithValidInputTest_Success(final String input, final String output) {
    LongestSubString longestSubString = new LongestSubString();

    int maxLength = longestSubString.getLongestSubString(input);

    assertEquals(Integer.valueOf(output), maxLength);
  }

  @ParameterizedTest
  @CsvSource({"abcabcbb,3"})
  void getLongestSubStringUsingMap_WithValidInputTest_Success(final String input, final String output) {
    LongestSubString longestSubString = new LongestSubString();

    int maxLength = longestSubString.getLongestSubStringUsingMap(input);

    assertEquals(Integer.valueOf(output), maxLength);
  }

}
