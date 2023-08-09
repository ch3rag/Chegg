public class Main {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Declare Array
        int[] array = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        
        // Print Array Before Re-Arraging
        System.out.print("Array Before Re-Arranging: ");
        printArray(array);

        // We Can Array The Given In Required Format By Sorting It
        // We Will Use Insertion Sort For This
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }

        // Print The Re-Arranged Array
        System.out.print("Array After Re-Arranging: ");
        printArray(array);
    }
}