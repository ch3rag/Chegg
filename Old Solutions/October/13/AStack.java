import java.util.Stack;

public class AStack<E> implements ADTStack<E> {
	Stack<E> stack = new Stack<E>();
	@Override
	public void clear() {
		stack.clear();
	}

	@Override
	public void push(E it) {
		stack.push(it);
		
	}

	@Override
	public E pop() {
		return stack.pop();
	}

	@Override
	public E topValue() {
		return stack.peek();
	}

	@Override
	public int length() {
		return stack.size();
	}
}
