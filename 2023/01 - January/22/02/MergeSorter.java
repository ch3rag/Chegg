import java.util.Arrays;

// MergeSorter.java

public class MergeSorter {

	public static void sort(int[] a, int from, int to) {
		if (from == to) { return; }
		int mid = (from + to) / 2;
		sort(a, from, mid);
		sort(a, mid + 1, to);
		int[] merged = merge(a, from, mid + 1, to);
		for (int i = 0; i < merged.length; i++) {
			a[from + i] = merged[i];
		}
	}

	private static int[] merge(int[] a, int from1, int from2, int to) {
		int iFirst = from1;
		int iSecond = from2;
		int j = 0;

		int[] result = new int[to - from1 + 1];

		while (iFirst < from2 && iSecond <= to) {
			if (a[iFirst] < a[iSecond]) {
				result[j] = a[iFirst]; iFirst++;
			} else {
				result[j] = a[iSecond]; iSecond++;
			}
			j++;
		}

		while(iFirst < from2) {
			result[j] = a[iFirst];
			iFirst++;
			j++;
		}

		while(iSecond <= to) {
			result[j] = a[iSecond];
			iSecond++;
			j++;
		}

		return result;
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 4, 9, 16, 2, 3, 5, 8 };
		sort(a, 0, 5);
		System.out.println(Arrays.toString(a));
	}
}
