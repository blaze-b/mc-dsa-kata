package com.dsa;

import com.dsa.node.ListNode;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {

      int x = (l1 != null ) ? l1.getVal(): 0;
      int y = (l2 != null)  ? l2.getVal(): 0;

      int sum = x + y + carry;

      carry = sum / 10;

      current.setNext(new ListNode(sum % 10));
      current = current.getNext();

      if (l1 != null) {
        l1 = l1.getNext();
      }

      if (l2 != null) {
        l2 = l2.getNext();
      }

    }

    return dummy.getNext();
  }

}


