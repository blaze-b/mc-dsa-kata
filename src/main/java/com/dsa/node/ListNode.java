package com.dsa.node;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNode implements Comparable<ListNode> {
  private int val;
  private ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  @Override
  public int compareTo(ListNode other) {
    return Integer.compare(this.val, other.val);
  }
}
