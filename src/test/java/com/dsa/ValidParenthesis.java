package com.dsa;

import java.util.Stack;

public class ValidParenthesis {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for(char ch: s.toCharArray()) {

      // check for the opening brackets
      if (ch == '{' || ch == '(' || ch == '[') {
        stack.push(ch);
      }

      // Check for the closing brackets
      else if (ch == '}' || ch == ')' || ch == ']') {

        // stack check empty or top of the stack does not match
        if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
          return false;
        }

      }



    }


    // if stack is empty
    return stack.isEmpty();


  }

  // Helper method to check matching pairs
  private boolean isMatchingPair(char opening, char closing) {
    return (opening == '(' && closing == ')') ||
        (opening == '{' && closing == '}') ||
        (opening == '[' && closing == ']');
  }

}
