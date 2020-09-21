import java.util.Stack;

class MyQueue {

    private Stack<Integer> pushStack;

    private Stack<Integer> removeStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        pushStack = new Stack<>();
        removeStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        pushStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!pushStack.empty()){
            removeStack.push(pushStack.pop());
        }
        int element = removeStack.pop();
        while(!removeStack.empty()){
            pushStack.push(removeStack.pop());
        }
        return element;
    }

    /** Get the front element. */
    public int peek() {
        while(!pushStack.empty()){
            removeStack.push(pushStack.pop());
        }
        int element = removeStack.peek();
        while(!removeStack.empty()){
            pushStack.push(removeStack.pop());
        }
        return element;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pushStack.empty();
    }
}
