public interface IQueue {
	public void enqueue(Object item);
	public Object dequeue();
	public Object peek();
	public int indexOf(Object item);
	public int getSize();
	public boolean isEmpty();
}
