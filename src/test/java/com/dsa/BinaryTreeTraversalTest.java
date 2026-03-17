package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.dsa.node.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class BinaryTreeTraversalTest {

  @Test
  void levelOrder_WithValidInputs_Success() {

    // GIVEN
    TreeNode root = new TreeNode(3, new TreeNode(9, null, null)
        , new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));


    // WHEN
    BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
    List<List<Integer>> rootLevel = binaryTreeTraversal.levelOrder(root);


    // THEM
    assertEquals(List.of(List.of(3), List.of(9, 20), List.of(15, 7)), rootLevel);
  }


}
