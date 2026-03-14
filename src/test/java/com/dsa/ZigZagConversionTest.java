package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZigZagConversionTest {

  @ParameterizedTest
  @CsvSource({
      "3, PAYPALISHIRING, PAHNAPLSIIGYIR",
      "4, PAYPALISHIRING, PINALSIGYAHRPI",
      "1, A, A"
  })
  void testZigzagConversion(String numRows, String inputString, String expected) {
    // Given
    int rowNum = Integer.parseInt(numRows);

    // WHEN
    ZigZagConversion conversion = new ZigZagConversion();
    String result = conversion.convert(inputString, rowNum);

    // THEN
    assertEquals(expected, result);
  }

}
