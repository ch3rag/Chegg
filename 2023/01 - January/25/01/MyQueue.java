public interface MyQueue {
	boolean add(String name);
	boolean offer(String name);
	String element();
	String peek();
	String poll();
	String remove();
	boolean contains(String name);
	int size();
}
