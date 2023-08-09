import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 1, 4, 5, 6, 0, 0, 0, 0};
		arr = makePerfect(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static int[] makePerfect(int[] arr) {
		int i = 0;
		while (arr[arr.length - 1 - i] == 0) {
			i++;
		}
		int[] perfect = Arrays.copyOf(arr, i + 1);
		return perfect;
	}
}