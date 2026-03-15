package com.dsa;

public class PalindromeNumber {

  public boolean isPalindrome(int x) {

    int reversed = 0;

    int original = x;

    if (x < 0 || (x % 10 == 0 && x != 0)) {
      // negative palindrome reversal does not need to reversed
      return false;
    }

    while (x != 0) {

      int lastDigit = x % 10;

      x = x / 10;

      if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
        break;
      }

      reversed = reversed * 10 + lastDigit;
    }

    return reversed == original;
  }

}
