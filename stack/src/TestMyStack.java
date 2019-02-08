/**
 * This program demonstrates a test for MyStack class.
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        // push 10, 20, 30 into the stack
        stack.push("10");
        stack.push("20");
        stack.push("30");

        // pop the element at the top of the stack
        System.out.println("pop: " + stack.pop());

        // peek the element at the top of the stack
        System.out.println("peek: " + stack.peek());

        // push 40 into the stack
        stack.push("40");

        // print stack
        stack.traverseStack();
    }
}
