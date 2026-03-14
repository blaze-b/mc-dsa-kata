package com.dsa;

import com.dsa.node.lru.Node;
import java.util.HashMap;

public class LRUCache {

  private final int capacity;
  private final HashMap<Integer, Node> cache;
  private final Node head;
  private final Node tail;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>();
    this.head = new Node(0, 0);
    this.tail = new Node(0, 0);
    head.setNext(tail);
    tail.setPrev(head);
  }

  public void remove(Node node) {
    Node prevNode = node.getPrev();
    Node nextNode = node.getNext();
    prevNode.setNext(nextNode);
    nextNode.setPrev(prevNode);
  }

}
