public interface MyList {
	public void append(Object o);
	public void insertAt(int index, Object o);
	public void removeAt(int index);
	public Object getAt(int index);
	public int getSize();
	public MyListIterator getIterator();

}
