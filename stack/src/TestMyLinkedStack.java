/**
 * This program demonstrates a test for MyLinkedStack class.
 */
public class TestMyLinkedStack {
    public static void main(String[] args) {
        MyLinkedStack<String> linkedStack = new MyLinkedStack();

        // push 10, 20, 30 into the stack
        linkedStack.push("10");
        linkedStack.push("20");
        linkedStack.push("30");

        // pop the element at the top of the stack
        try {
            System.out.println("pop: " + linkedStack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // peek the element at the top of the stack
        System.out.println("peek: " + linkedStack.peek());

        // push 40 into the stack
        linkedStack.push("40");

        // print stack
        linkedStack.traverseStack();
    }
}
