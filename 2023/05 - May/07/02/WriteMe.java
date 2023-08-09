public class WriteMe {
	
	public static void methodB() {
		methodA();
	}

	public static void methodA() {
		int[] arr = new int[0];
		arr[1] = 0;
	}

	public static void main(String[] args) {
		methodB();
	}
}
