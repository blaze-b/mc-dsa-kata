package com.dsa.node;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNode {
  private int val;
  private ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

}
