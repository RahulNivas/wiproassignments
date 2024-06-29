import java.util.EmptyStackException;

public class Stack {
    private int[] elements;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.top = -1; 
    }

    public void push(int element) {
        if (top == capacity - 1) {
            throw new StackOverflowError("Stack is full. Cannot push element.");
        }
        elements[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());  

        System.out.println("Peek top element: " + stack.peek());  

        System.out.println("Pop top element: " + stack.pop());  // 

        System.out.println("Stack size after pop: " + stack.size());  
    }
}