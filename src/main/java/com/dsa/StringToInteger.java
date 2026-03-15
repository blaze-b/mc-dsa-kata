package com.dsa;

public class StringToInteger {

  public int myAtoi(String s) {

    s = s.trim();

    if (s.isEmpty()) {
      return 0;
    }

    int sign = 1, base = 0, i = 0;

    char firstChar = s.charAt(i);

    if (firstChar  == '-' || firstChar == '+') {
      sign = (firstChar  == '-') ? -1 : 1;
      i++;
    }

    while (i < s.length()) {
      char currentChar = s.charAt(i);
      System.out.println(currentChar);

      if (currentChar < '0' || currentChar > '9') {
        break;
      }

      int digit = currentChar - '0';

      if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && digit > 7)) {
        return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }

      base = base * 10 + digit;

      i++;
    }

    return base * sign;

  }

}
