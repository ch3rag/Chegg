#include <stdio.h>
#define MAX_MSG_LEN 256

int main(void) {
	char msg[MAX_MSG_LEN + 1];

	fgets(msg, MAX_MSG_LEN, stdin);

	/* write your solution here ... */

	// This Will Store Our Modified Message
	char resultMsg[MAX_MSG_LEN + 1];
	int k = 0;

	// Loop Through Each Character In The Message
	for (int i = 0; msg[i] != '\n'; i++) {
		// Get The Current Character
		char ch = msg[i];
		// Check If The Character Is A Punctuation
		if (ch == '!' || ch == '\'' || ch == '?' || ch == ';' ||
			ch == ':' || ch == ','  || ch == '.') {
				// Skip The Loop
				continue;
		}

		// Not A Punctuation
		// Add Ch To Result Message
		resultMsg[k++] = ch;
	}
	// Add Null Character To Result Message
	resultMsg[k] = '\0';

	// Print Result
	printf("%s", resultMsg);
	return 0;
}