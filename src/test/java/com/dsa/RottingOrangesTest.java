package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RottingOrangesTest {

  @Test
  void orangesRotting_WithValidTest_Success() {
    int [][] input = {
        {2, 1, 1}, {1, 1, 0}, {0, 1, 1}
    };

    RottingOranges rottingOranges = new RottingOranges();
    int min = rottingOranges.orangesRotting(input);

    assertEquals(4, min);
  }

}
