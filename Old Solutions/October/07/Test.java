interface Priority {
	// Method setPriority()
	public void setPriority();
	// Method getPriority()
	public int getPriority();
}

class Task implements Priority, Comparable<Task> {
	String p_level;
	int p;
	
	Task(String p_level) {
		this.p_level = p_level;
		setPriority();
	}

	public void setPriority() {
		if("higher".equals(p_level))
			p = 4;
		else if("high".equals(p_level))
			p = 3;
		else if("normal".equals(p_level))
			p = 2;
		else if("low".equals(p_level))
			p = 1;
		else if("lower".equals(p_level))
			p = 0;
	}

	public int getPriority(){
		return p;
	}

	// Override compareTo Method Of Comparable Interface
	@Override
	public int compareTo(Task o) {
		// A Task Of Higher Priority > A Task Of Lower Priority
		return Integer.compare(p, o.p);
	}
}

public class Test {
	public static void main(String args[]) {
		Task task1 = new Task("high");
		Task task2 = new Task("higher");
		Task task3 = new Task("low");
		Task task4 = new Task("normal");
		
		System.out.println("Priority of task1: " + task1.getPriority());
		System.out.println("Priority of task2: " + task2.getPriority());
		System.out.println("Priority of task3: " + task3.getPriority());
		System.out.println("Priority of task4: " + task4.getPriority());

		// Test compareTo
		System.out.println("task1.compareTo(task2) = " + task1.compareTo(task2));
		System.out.println("task1.compareTo(task3) = " + task1.compareTo(task3));
		System.out.println("task1.compareTo(task1) = " + task1.compareTo(task1));
	}
}
