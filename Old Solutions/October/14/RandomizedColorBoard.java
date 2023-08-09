import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizedColorBoard {
	int getRandIdx(int bound) {
		return ThreadLocalRandom.current().nextInt(bound);
	}

	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	int[][] solve(int height, int width, int[] colors) {
		int[][] board = new int[height][width];
		Map<Integer, Integer> colorsIdx = new HashMap<Integer, Integer>();

		for (int i = 0; i < colors.length; i++) {
			colorsIdx.put(colors[i], i);
		}

		

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int excludeIdx = colors.length - 1;

				if (j > 1 && board[i][j - 2] == board[i][j - 1]) {
					int val = board[i][j - 2];
					int excludeItemCurrIdx = colorsIdx.get(val);
					int lastItem = colors[excludeIdx];
					swap(colors, excludeItemCurrIdx, excludeIdx);
					colorsIdx.put(val, excludeIdx);
					colorsIdx.put(lastItem, excludeItemCurrIdx);
					excludeIdx--;
				}

				if (i > 1 && board[i - 2][j] == board[i - 1][j]) {
					int val = board[i - 2][j];
					int excludeItemCurrIdx = colorsIdx.get(val);
					int lastItem = colors[excludeIdx];
					colorsIdx.put(val, excludeIdx);
					colorsIdx.put(lastItem, excludeItemCurrIdx);
					excludeIdx--;
				}
				int randIdx = getRandIdx(excludeIdx + 1);
				board[i][j] = colors[randIdx];
			}
		}
		return board;
	}

	public static void main(String[] args) {
		RandomizedColorBoard rcb = new RandomizedColorBoard();
		int[][] board = rcb.solve(4, 4, new int[] { 3, 1, 2, 4 });
		System.out.println("Result");
		for (int[] row : board) {
			System.out.println(Arrays.toString(row));
		}
	}
}