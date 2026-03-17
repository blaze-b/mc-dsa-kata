package com.dsa;

import com.dsa.node.heappriorityqueue.QueueUsingStacks;

public class QueueUsingStacksDetails {

  public void runQueues() {
    QueueUsingStacks<String> queues = new QueueUsingStacks<>();

    queues.enqueue("Test");

    queues.enqueue("Test1");

    queues.enqueue("Test2");

    queues.enqueue("Test3");

    queues.enqueue("Test4");

    System.out.println(queues.size());

    queues.dequeue();

    System.out.println(queues.size());

    queues.dequeue();

    System.out.println(queues.size());

    queues.dequeue();

    System.out.println(queues.size());

    queues.dequeue();

    System.out.println(queues.size());

    String result = queues.dequeue();

    System.out.println(result);

    System.out.println(queues.size());

  }

}
