public class Main {

	public static int rotateUntilEqual(int[] arr1, int[] arr2) {
		int id = 1234;	// Replace With Your Student ID Number
		if (arr1.length == arr2.length) {

			// Temp Array To Store Rotated Form
			int[] temp = new int[arr1.length];

			// Rotate And With Every Rotation Check If They Are Equal
			for (int i = 0; i < arr1.length; i++) {	

				// Rotate Array1
				for (int j = 0; j < arr1.length; j++) {
					temp[j] = arr1[(j + i) % arr1.length];
				}

				// Check For The Equality
				boolean equal = true;
				for (int k = 0; k < arr1.length; k++) {
					
					if (temp[k] != arr2[k]) {
						equal = false;
						break;
					}
				}
				// If They Are Equal Return Number Of Rotations
				if (equal) {
					return i;
				} 
			}
		}
		// Equality Not Possible
		return id;
	}
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };		
		int[] arr2 = { 1, 2, 3, 4, 5};

		System.out.println(rotateUntilEqual(arr1, arr2)); 	// Returns Student Id


		int[] arr3 = { 1, 2, 3, 4 };		
		int[] arr4 = { 1, 2, 3, 4 };

		System.out.println(rotateUntilEqual(arr3, arr4)); 	// Returns 0

		int[] arr5 = { 3, 4, 1, 2 };		
		int[] arr6 = { 1, 2, 3, 4 };

		System.out.println(rotateUntilEqual(arr5, arr6)); 	// Returns 2


		int[] arr7 = { 5, 1, 2, 3, 4 };		
		int[] arr8 = { 1, 2, 3, 4, 5 };

		System.out.println(rotateUntilEqual(arr7, arr8)); 	// Returns 1


		
		int[] arr9 =  { 2, 3, 4, 5, 1 };		
		int[] arr10 = { 1, 2, 3, 4, 5 };

		System.out.println(rotateUntilEqual(arr9, arr10)); 	// Returns 4


				
		int[] arr11 =  { 2, 3, 4, 5, 2 };		
		int[] arr12 = { 1, 2, 3, 4, 5 };

		System.out.println(rotateUntilEqual(arr11, arr12)); 	// Returns 4
	}
}