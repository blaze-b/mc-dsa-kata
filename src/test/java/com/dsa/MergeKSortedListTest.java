package com.dsa;

import com.dsa.node.ListNode;
import org.junit.jupiter.api.Test;

class MergeKSortedListTest {

  @Test
  public void mergeKSortedList_WithTwoValidInputs_ShouldMergeSuccessfully() {
    // GIVEN
    ListNode l1 = new ListNode(2);
    l1.setNext(new ListNode(4));
    l1.getNext().setNext(new ListNode(3)); // Represents 243

    ListNode l2 = new ListNode(5);
    l2.setNext(new ListNode(6));
    l2.getNext().setNext(new ListNode(4)); // Represents 465

    // WHEN
    MergeKSortedList mergeKSortedList = new MergeKSortedList();
    ListNode[] lists = {l1, l2};
    ListNode mergedNode = mergeKSortedList.mergeKSortedList(lists);

    // THEN
    // Expected merged output should represent 243 + 465 = 708
    System.out.println(mergedNode);
  }

  // Helper method to compare two linked lists
  private boolean areListsEqual(ListNode node1, ListNode node2) {
    while (node1 != null && node2 != null) {
      if (node1.getVal() != node2.getVal()) {
        return false;
      }
      node1 = node1.getNext();
      node2 = node2.getNext();
    }
    return node1 == null && node2 == null; // Both should be null at the end
  }
}
