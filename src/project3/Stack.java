
package project3;

/**
 *
 * @author 200316059 İkram Celal KESKİN
 */

import java.util.Arrays;

public class Stack {
  // class creates a data structure for each stack
  private static class StackData {
    public int start;
    public int pointer;
    public int size = 0;
    public int capacity;

    public StackData(int start, int capacity) {
      this.start = start;
      this.pointer = start - 1;
      this.capacity = capacity;
    }
  }

  private int stackSize = 31;
  private StackData[] info;
  private char[] innerStack;

  public Stack(int num_stacks) {
    // Creates arrays and creates object for each stack
    info = new StackData[num_stacks];
    for (int i = 0; i < num_stacks; i++) {
      info[i] = new StackData(i * stackSize, stackSize);
    }
    innerStack = new char[num_stacks * stackSize];
  }

  public void push(char value, int stackNum) {
    // Locates the specified stack
    StackData stack = info[stackNum];

    // is Stack full? 
    if (stack.size >= stack.capacity) {
      System.out.println("Stack is full");
    }

    // Adds an element to the stack and increments the pointer by one

    stack.size++;
    stack.pointer++;
    innerStack[stack.pointer] = value;
  }

  public char pop(int stackNum)  {
    // Locates the specified stack
    StackData stack = info[stackNum];

    // is Stack empty?
    if (stack.size == 0) {
      System.out.println("Stack is empty");
    }
  // Removes an element from the stack and decrements the pointer by one
  char value = innerStack[stack.pointer];
  innerStack[stack.pointer] = 0;
  stack.pointer--;
  stack.size--;
  return value;
}

public char peek(int stackNum) {
  // Locates the specified stack
  StackData stack = info[stackNum];

  // is Stack empty?
  if (stack.size == 0) {
    System.out.println("Stack is empty");
  }

  // Returns the topmost element of the stack
  return innerStack[stack.pointer];
}

public void printStacks() {
  // Prints stacks
  for (int i = 0; i < info.length; i++) {
    StackData stack = info[i];
    char[] stackElements = Arrays.copyOfRange(innerStack, stack.start, stack.start + stack.capacity);
    System.out.println("Stack " + i + ": " + Arrays.toString(stackElements));
  }
}
}