import java.io.IOException;

class cf {
	char ch;
	int fr;
}

public class charCount {
	// Reads A Single Character From The Input Stream
	static char gn() throws IOException {
		int l;
		l = System.in.read();
		if (l == -1) {
			return '\0';
		} else {
			return (char)l;
		}
	}

	public static void main(String argv[]) throws IOException {
		int s = 0;
		cf cc[] = new cf[200];
		char ic;
		int i, I, l = 1;

		/* Loop until End of File */
		while (l == 1) {
			ic = gn();
			if ((int)ic <= 0) l = 0;
			if (l > 0) {
				// Find Index of ic in cc
				I = process_data((char)ic, cc, s);
				if (I >= 0) {
					// If Index Is Found
					cc[I].ch = ic;
					// Increment Frequency
					cc[I].fr++;
				} else {
					// Else Index Is Not Found
					// New Cf
					cc[s] = new cf();
					cc[s].ch = ic;
					// Set Initial Frequency To 1
					cc[s].fr = 1;
					s++;
				}
			}
		}

		/* Call s function */
		s(cc, s);
			
		/* Print Answer */
		// Most Frequent Letter
		for (i = 0; i < s; i++) {
			if (Character.isAlphabetic(cc[i].ch)) {
				System.out.printf("Most frequent letter: '%c', %d\n", cc[i].ch, cc[i].fr);
				break;
			}
		}

		// Most Frequent Digit
		for (i = 0; i < s; i++) {
			if (Character.isDigit(cc[i].ch)) {
				System.out.printf("Most frequent digit: '%c', %d\n", cc[i].ch, cc[i].fr);
				break;
			}
		}
	}

	// Returns The Index Of lc In CC
	public static int process_data(char lc, cf cc[], int s) {
		int l;
		for (l = 0; l < s; l++) {
			if (cc[l].ch == lc) {
				return l;
			}
		}
		return -1;
	}

	static void s(cf cc[], int s) {
		int I, l, O;
		cf o;

		for (I = 0; I < s - 1; I++) {
			/* Get Next o */
			O = I;
			for (l = I + 1; l < s; l++) {
				if (cc[l].fr > cc[O].fr) {
					O = l;
				}
			}
			o = cc[I];
			cc[I] = cc[O];
			cc[O] = o;
		}
	}
}
