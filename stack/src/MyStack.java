/**
 * This program demonstrates a self-defined stack which can store any types of data.
 * Using array to implement sequence stack.
 */
public class MyStack<T> {
    // default capacity
    private static final int DEFAULT_CAPACITY = 10;
    // generic array
    private T[] objectArray;
    // the number of the elements in stack
    private int counter;

    /**
     * Constructs a stack using default parameters.
     */
    public MyStack() {
        clear();
    }

    /**
     * Initializes the array, default size is 10, element number initialized to 0.
     */
    private void clear() {
        this.counter = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    /**
     * Gets the current number of elements in the stack.
     *
     * @return the current number of elements in the stack
     */
    public int size() {
        return this.counter;
    }

    /**
     * Capacity expansion for stack.
     *
     * @param newCapacity new capacity
     */
    private void ensureCapacity(int newCapacity) {
        // copy old elements into new arrays, which means the new capacity should be larger than counter
        // the value of the new capacity should be 10 at least
        if (newCapacity < counter) {
            return;
        }

        // copy old elements in old array into new arrays
        T[] oldArray = this.objectArray;
        this.objectArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            this.objectArray[i] = oldArray[i];
        }
    }

    /**
     * Push operation.
     *
     * @param value value of the element need to be pushed into sequence stack
     */
    public void push(T value) {
        // check whether there is enough space
        if (objectArray.length == size()) {
            // double capacity
            ensureCapacity(size() * 2);
        }

        // do not need to expand capacity of the stack
        this.objectArray[counter++] = value;
    }

    /**
     * Checks whether the sequence stack is empty.
     *
     * @return if the stack is empty, return true; if not, return false
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Pop operation.
     *
     * @return value of the element popped out of the sequence stack
     */
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T theValue = objectArray[counter - 1];
        objectArray[--counter] = null;
        return theValue;
    }

    /**
     * Peek operation.
     *
     * @return value of the top element in the sequence stack
     */
    public T peek() {
        if (isEmpty()) {
            return null;
        }

        T topElement = objectArray[counter - 1];
        return topElement;
    }

    /**
     * Traverses and prints stack from bottom to top.
     */
    public void traverseStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        }

        for (int i = 0; i < size(); i++) {
            System.out.print(objectArray[i] + " ");
        }
    }
}
