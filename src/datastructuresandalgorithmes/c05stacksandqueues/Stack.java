package datastructuresandalgorithmes.c05stacksandqueues;

public class Stack {
    private int[] stack;
    private int top = -1;

    public Stack(int size) {
        this.stack = new int[5];
    }

    void push(int number) {
        if (top +1 >= stack.length-1) {
            throw new RuntimeException();
        }
        this.stack[top++] = number;
    }

    int pop() {
        return this.stack[top--];

    }
}
