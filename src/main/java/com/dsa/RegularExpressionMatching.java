package com.dsa;

public class RegularExpressionMatching {

  public boolean isMatch(String s, String p) {

    return recursiveCheck(s, p, 0, 0);

  }

  private boolean recursiveCheck(String s, String p, int i, int j) {

    // If we've reached the end of the pattern
    if (j == p.length()) {
      return i == s.length();
    }

    boolean firstMatch = (i < s.length() &&
        (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

    if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
      return (recursiveCheck(s, p, i, j + 2)) ||
          (firstMatch && recursiveCheck(s, p, i + 1, j));
    } else {
      return firstMatch && recursiveCheck(s, p, i + 1, j + 1);
    }

  }


}
