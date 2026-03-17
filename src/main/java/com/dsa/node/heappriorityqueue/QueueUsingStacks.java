package com.dsa.node.heappriorityqueue;

import java.util.Stack;

public class QueueUsingStacks<T> {

  private Stack<T> stack1;// enqueuing
  private Stack<T> stack2;// dequeuing


  public QueueUsingStacks() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void enqueue(T item) {
    stack1.push(item);
  }

  // With removing
  public T dequeue() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }

    if (stack2.isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }

    return stack2.pop();
  }

  // Without removing
  public T peek() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }

    if (stack2.isEmpty()) {
      throw new IllegalStateException("Queue is empty");
    }

    return stack2.peek();
  }


  // Method to check if the queue is empty
  public boolean isEmpty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }

  // Method to get the size of the queue
  public int size() {
    return stack1.size() + stack2.size();
  }

}
