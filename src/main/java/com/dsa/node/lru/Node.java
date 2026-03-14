package com.dsa.node.lru;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Node {

  private int key;
  private int value;
  private Node prev;
  private Node next;

  public Node(int key, int value) {
    this.key = key;
    this.value = value;
  }

}
