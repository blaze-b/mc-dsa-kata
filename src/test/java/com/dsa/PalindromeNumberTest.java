package com.dsa;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

  @Test
  void isPalindrome_ValidInputs_Success() {
     // GIVEN
    int x = 121;

    // WHEN
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    boolean result = palindromeNumber.isPalindrome(x);

    // WHEN
    assertTrue(result);
  }

  @Test
  void isPalindrome_ValidInputs2_Success() {
    // GIVEN
    int x = -121;

    // WHEN
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    boolean result = palindromeNumber.isPalindrome(x);

    // WHEN
    assertFalse(result);
  }

  @Test
  void isPalindrome_ValidInputs3_Success() {
    // GIVEN
    int x = 10;

    // WHEN
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    boolean result = palindromeNumber.isPalindrome(x);

    // WHEN
    assertFalse(result);
  }

}
