public class Stack1 {

	int[] stack;
	int top;
	int size;

	// Constructor
	Stack1(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}

	// Push
	void push(int value) {
		if (top == size - 1) {
			System.out.println("Stack Overflow");
			return;
		}

		top++;
		stack[top] = value;
		System.out.println(value + " pushed");
	}

	// Pop
	void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return;
		}

		System.out.println(stack[top] + " popped");
		top--;
	}

	// Peek
	void peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}

		System.out.println("Top element: " + stack[top]);
	}

	// Check if empty
	boolean isEmpty() {
		return top == -1;
	}

	// Main method
	public static void main(String[] args) {

		Stack1 s = new Stack1(5);

		s.push(10);
		s.push(20);
		s.push(30);

		s.peek();

		s.pop();
		s.peek();

		System.out.println("Is stack empty? " + s.isEmpty());
	}
}