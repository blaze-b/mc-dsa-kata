package com.dsa;

public class LongestPalindrome {

  public String longestPalindrome(String s) {
    if (s.isEmpty()) return "";

    int start = 0, end = 0;

    for (int i = 0; i < s.length(); i++) {
      // Check for odd-length palindromes
      int len1 = expandAroundCenter(s, i, i);
      // Check for even-length palindromes
      int len2 = expandAroundCenter(s, i, i + 1);
      // Get the maximum length
      int maxLen = Math.max(len1, len2);

      // Update start and end indices
      if (maxLen > end - start) {
        start = i - (maxLen - 1) / 2;
        end = i + maxLen / 2;
      }
    }

    return s.substring(start, end + 1);
  }

  private int expandAroundCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
      left--;
      right++;
    }
    return right - left - 1; // Length of the palindrome
  }

}
