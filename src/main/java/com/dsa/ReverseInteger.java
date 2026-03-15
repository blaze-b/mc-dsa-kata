package com.dsa;

public class ReverseInteger {

  public int reverseWithString(int num) {

    if (num < 0) {
      num = num * -1;
      String reversed = reverseString(num);
      return -1 * Integer.parseInt(reversed);
    }

    String reversed = reverseString(num);
    return Integer.parseInt(reversed);

  }

  private static String reverseString(int num) {
    String input = String.valueOf(num);
    return new StringBuilder(input).reverse().toString();
  }

  public int reverse(int num) {

    int rev = 0;

    while (num != 0) {

      int lastNum = num % 10;

      num = num / 10;

      if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
        return 0;
      }

      rev = rev * 10 + lastNum;

    }

    System.out.println(num);

    return rev;
  }


}
