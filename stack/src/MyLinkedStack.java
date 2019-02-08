/**
 * This program demonstrates a self-defined stack which can store any types of data.
 * Using list to implement linked stack.
 */
public class MyLinkedStack<T> {
    // the number of the elements in linked stack
    private int counter;
    // the element at the top of the stack
    private Node topNode;

    // use inner class to define the nodes in the linked stack
    private final class Node {
        public T data;
        public Node next;

        /**
         * Default constructor.
         */
        public Node() {
            data = null;
            next = null;
        }

        /**
         * Constructor with initial parameters.
         */
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Constructs an empty linked stack.
     */
    public MyLinkedStack() {
        counter = 0;
        topNode = null;
    }

    /**
     * Push operation.
     *
     * @param value value of the element need to be pushed into linked stack
     */
    public void push(T value) {
        Node node = new Node(value, null);
        if (isEmpty()) {
            topNode = node;
        } else {
            node.next = topNode;
            topNode = node;
        }
        counter++;
    }

    /**
     * Pop operation.
     *
     * @return value of the element popped out of the linked stack
     */
    public T pop() throws Exception {
        if (topNode == null) {
            throw new Exception("Stack is empty!");
        } else {
            T data = topNode.data;
            topNode = topNode.next;
            counter--;
            return data;
        }
    }

    /**
     * Peek operation.
     *
     * @return value of the top element in the linked stack
     */
    public T peek() {
        if (topNode != null) {
            return topNode.data;
        } else {
            return null;
        }
    }

    /**
     * Gets the current number of elements in the stack.
     *
     * @return the current number of elements in the stack
     */
    public int size() {
        return counter;
    }

    /**
     * Checks whether the linked stack is empty.
     *
     * @return if the stack is empty, return true; if not, return false
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Traverses and prints stack from top to bottom.
     */
    public void traverseStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }

        for (int i = 0; i < size(); i++) {
            System.out.print(topNode.data + " ");
            topNode = topNode.next;
        }
    }
}
