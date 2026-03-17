package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

  public int orangesRotting(int[][] grid) {

    int rows = grid.length;
    int cols = grid[0].length;

    Queue<int[]> queue = new LinkedList<>();

    // add the queue and count fresh
    int fresh = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j ++ ){
        if (grid[i] [j] == 2) {
          queue.offer(new int[] {i, j} );
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
    while (!queue.isEmpty() && fresh > 0) {
         int size = queue.size();
         for (int i =0; i < size; i++) {
           int[] current = queue.poll();

           int r = current[0];
           int c = current[1];

           for (int[] d: directions) {
             int nr = r + d[0];
             int nc = c + d[1];

             if(nr>=0 && nc>=0 && nr<rows && nc<cols && grid[nr][nc] == 1){
               grid[nr][nc] = 2;
               fresh--;
               queue.offer(new int[] {nr, nc});
             }
           }


         }
      minutes++;
    }

    return fresh == 0? minutes: -1;
  }

}
