package com.dsa;

public class ZigZagConversion {

  public String convert(String s, int numRows) {

    if (numRows <= 1 || numRows >= s.length()) {
      return s;
    }

    StringBuilder[] rows = new StringBuilder[numRows];
    for (int i = 0; i < rows.length; i++) {
      rows[i] = new StringBuilder();
    }

    int currentRow = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {

      rows[currentRow].append(c);

      // Change direction when reaching the top or bottom row
      if (currentRow == 0 || currentRow == numRows - 1) {
        goingDown = !goingDown;
      }
      // Move up or down
      currentRow += goingDown ? 1 : -1;


      System.out.println(currentRow);

    }

    StringBuilder result = new StringBuilder();
    for (StringBuilder row : rows) {
      result.append(row);
    }

    return result.toString();
  }

}
