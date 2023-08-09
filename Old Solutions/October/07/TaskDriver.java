// Priority.java

interface Priority {
	int getPriority();
	void setPriority(int p);
}

// Complexity.java

interface Complexity {
	public void setComplexity(int complexity);
	public int getComplexity();	
}
	

// Task.java	
/**
* Class Task Implementing the Priority and
* Complexity
*/
	
class Task implements Priority, Complexity, Comparable<Task> {
	private int priority;
	private String name;
	private int complexity;
	public Task(String name) {
		this.name = name;
	}

	// Overriding the Method from the Interface
	@Override
	public void setPriority(int p) {
		this.priority = p;
	}
	
	@Override
	public int getPriority() {
		return this.priority;
	}

	@Override
	public void setComplexity(int c) {
		this.complexity = c;
	}

	@Override
	public int getComplexity() {
		return this.complexity;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return String.format("Task Name : %s\nTask Priority : %d\nTask Complexity : %d\n", getName(), getPriority(), getComplexity());
	}

	// Override compareTo Method Of Comparable Interface
	@Override
	public int compareTo(Task o) {
		// A Task Of Higher Priority > A Task Of Lower Priority
		return Integer.compare(priority, o.priority);
	}
}

// TaskDriver.java

class TaskDriver {
	public static void main(String[] args) {
		// Created Two Task Object
		Task t1 = new Task("task1");
		Task t2 = new Task("task2");

		// Set the Task Priority
		t1.setPriority(4);
		t2.setPriority(2);

		// Set the Task Complexity
		t1.setComplexity(6);
		t2.setComplexity(8);

		System.out.println(t1);
		System.out.println(t2);

		// Test compareTo
		System.out.println("t1.compareTo(t2) = " + t1.compareTo(t2));
		System.out.println("t2.compareTo(t1) = " + t2.compareTo(t1));
		System.out.println("t1.compareTo(t1) = " + t1.compareTo(t1));
	}
}