/*
 * Name: Roham Mehrabi
 * PID: A17025640
 */

import java.util.*;

/**
 * implements a stack data structure that, in addition to standard 
 * stack operations, tracks and retrieves the maximum value
 *
 * @author Roham Mehrabi
 * @since A17025640
 */

public class DonationStack {

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public DonationStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (maxStack.isEmpty() || val >= maxStack.peek()) {
            maxStack.push(val);
        }
    }

    public int peek() {
        return stack.peek();
    }

    public int pop() {
        int val = stack.pop();
        if (val == maxStack.peek()) {
            maxStack.pop();
        }
        return val;
    }

    public int max() {
        return maxStack.peek();
    }
}