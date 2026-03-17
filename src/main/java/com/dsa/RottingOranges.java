package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

  public int orangesRotting(int[][] grid) {

    int rows = grid.length;
    int cols = grid[0].length;

    Queue<int[]> rotten = new LinkedList<>();

    // add the rotten and count fresh
    int fresh = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j ++ ){
        if (grid[i] [j] == 2) {
          rotten.offer(new int[] {i, j} );
        }

        if (grid[i] [j] == 1) {
          fresh ++;
        }
      }
    }

    // intialise directions
    int minutes = 0;
    int [] [] directions = {
        {1, 0}, {-1, 0}, {0, 1}, {-1, 0}
    };

    // BFS
    while (!rotten.isEmpty() && fresh > 0) {
         int size = rotten.size();
         for (int i =0; i < size; i++) {
           int[] current = rotten.poll();

           int r = current[0];
           int c = current[1];

           for (int[] d: directions) {
             int nr = r + d[0];
             int nc = c + d[1];

             if(nr>=0 && nc>=0 && nr<rows && nc<cols && grid[nr][nc] == 1){
               grid[nr][nc] = 2;
               fresh--;
               rotten.offer(new int[] {nr, nc});
             }
           }


         }
      minutes++;
    }

    return fresh == 0? minutes: -1;
  }

}
