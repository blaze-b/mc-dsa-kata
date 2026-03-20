package com.dsa;

import com.dsa.node.ListNode;
import java.util.PriorityQueue;

public class MergeKSortedList {


  public ListNode mergeKSortedList(ListNode[] lists) {

    System.out.println("I am here");

    // Initialise a min-heap
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>();

    for (ListNode list: lists) {

      if (list != null) {
        minHeap.offer(list);
      }
    }

    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (!minHeap.isEmpty()) {

      ListNode smallestNode = minHeap.poll();
      current.setNext(smallestNode);
      current = current.getNext();

      if (smallestNode.getNext() != null) {

        minHeap.offer(smallestNode.getNext());

      }

    }

    System.out.println("I am here");

    return dummy.getNext();
  }

}
