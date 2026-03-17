package com.dsa;

import com.dsa.node.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeTraversal {


  public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();

    if (root == null)
      return result;

    // Initialise the queue
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    // BFS
    while (!queue.isEmpty()) {

      int size = queue.size();

      List<Integer> level = new ArrayList<>();

      for (int i = 0; i < size; i++) {

        TreeNode currentTree = queue.poll();;

        level.add(currentTree.getVal());

         if (currentTree.getLeft() != null) {
           queue.offer(currentTree.getLeft());
         }

         if (currentTree.getRight() != null) {
           queue.offer(currentTree.getRight());
         }

      }

      result.add(level);

    }

    return result;
  }

}
