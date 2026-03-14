package com.dsa;

import com.dsa.node.ListNode;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

  @Test
  void addTwoNumbers_Test_Success() {
    // GIVEN
    ListNode l1 = new ListNode(2);
    l1.setNext(new ListNode(4));
    l1.getNext().setNext(new ListNode(3));


    ListNode l2 = new ListNode(5); // 5 -> 6 -> 4
    l2.setNext(new ListNode(6));
    l2.getNext().setNext(new ListNode(4));


    // WHEN
    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

    // THEN
    System.out.println("Result: ");
    printList(result);
  }

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.getVal() + " ");
      node = node.getNext();
    }
    System.out.println(); // for a new line after printing the list
  }

}
