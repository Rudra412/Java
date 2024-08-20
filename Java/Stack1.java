class Stack1 {
    private int[] items;
    private int top;

    public Stack1(int maxSize) {
        items = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        items[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items[top];
    }

    public static void main(String args[]) {
        Stack1 stack = new Stack1(5);

        System.out.println("Stack is empty: " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack peek: " + stack.peek());

        stack.pop();

        System.out.println("Stack peek after pop: " + stack.peek());

        System.out.println("Stack is full: " + stack.isFull());

        stack.pop();
        stack.pop();

        System.out.println("Stack is empty after pops: " + stack.isEmpty());
    }
}