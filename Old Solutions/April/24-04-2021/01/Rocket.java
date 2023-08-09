public class Rocket {
	public static final int SIZE = 6;
	public static void draw() {
		drawTopBottom();
		drawSectionSeperator();
		drawMiddle();
		drawSectionSeperator();
		drawSectionSeperator();
		drawTopBottom();

	}

	// Draws Middle Portion Of The Rocket
	private static void drawMiddle() {
		for (int i = 0; i < 3; i++) {
			drawMiddleHelper();
		}
		drawMiddleHelperFlip();
	}

	// Draws A Portion Of The Middle Section
	// |../\..../\..|
	// |./\/\../\/\.|
	// |/\/\/\/\/\/\|
	private static void drawMiddleHelper() {
		for (int i = 0; i < SIZE; i++) {
			System.out.print("|");
			for (int k = 0; k < 2; k++) {
				for (int j = 0; j < SIZE - 1 - i; j++) {
					System.out.print(".");
				}
				for (int j = 0; j <= i; j++) {
					if (j % 2 == 0) {
						System.out.print("/");
					} else {
						System.out.print("\\");
					}
				}
				for (int j = 0; j <= i; j++) {
					if ((j + i) % 2 == 0) {
						System.out.print("\\");
					} else {
						System.out.print("/");
					}
				}
				for (int j = 0; j < SIZE - 1 - i; j++) {
					System.out.print(".");
				}
			}
			System.out.println("|");
		}
	}
	
	// Draws A Portion Of The Middle Section Upside Down
	// |\/\/\/\/\/\/|
	// |.\/\/..\/\/.|
	// |..\/....\/..|
	private static void drawMiddleHelperFlip() {
		for (int i = 0; i < SIZE; i++) {
			System.out.print("|");
			for (int k = 0; k < 2; k++) {
				for (int j = 0; j < i; j++) {
					System.out.print(".");
				}
				for (int j = 0; j <= SIZE - i - 1; j++) {
					if (j % 2 == 0) {
						System.out.print("\\");
					} else {
						System.out.print("/");
					}
				}
				for (int j = 0; j <= SIZE - i - 1; j++) {
					if ((j + i) % 2 == 1) {
						System.out.print("\\");
					} else {
						System.out.print("/");
					}
				}
				for (int j = 0; j < i; j++) {
					System.out.print(".");
				}
			}
			System.out.println("|");
		}
	}

	// Draws The Top/Bottom Portion Of The Rocket
	//      /**\     
	//     //**\\    
	//    ///**\\\   
	//   ////**\\\\  
	//  /////**\\\\\ 
	private static void drawTopBottom() {
		for (int i = 0; i < SIZE * 2 - 1; i++) {

			for (int j = SIZE * 2 - 1; j >= i + 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j ++) {
				System.out.print("/");
			}
			for (int j = 0; j < 2; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < i + 1; j ++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}


	// Draws Seperator +=#=#=#=#=#=#=#=#+
	private static void drawSectionSeperator() {
		System.out.print("+");
		for (int i = 0; i < SIZE * 4; i++) {
			if (i % 2 == 0) {
				System.out.print("=");
			} else {
				System.out.print("#");
			}
		}
		System.out.println("+");
	}
}