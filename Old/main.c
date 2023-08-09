#include <ctype.h>
#include <stdio.h>

int main() {

  char second;
  FILE *from, *to;
  char filename[200], first;

  // Changed &s to %s
  printf("Enter the filename to be scanned: ");
  scanf("%s", filename);

  from = fopen(filename, "r");
  to = fopen("outputtted.txt", "w");

  // Wrong Exit Codition
  while ((first = getc(from)) != EOF) {
    // Removed Chars++, Undefined Variable
    if (isupper(first)) {
      second = getc(from);
      if (first != toupper(second)) {
        putc(first, to);
      }
      // Unget Second From "from"
      ungetc(second, from);
    } else if (isdigit(first)) {

      if (first == '0') {
        // You Were Not Getting Second Character If First Is Zero
        // This Led To An Infinite Loop
        // For Example, Consider "10"
        // First = 1, And Second = 0, Program Will Ungetc 0
        // In Next Loop Execution, First = 0 But You Did NOT Get Second Charater!
        // Therefore, First = 0, Second = 0
        // And Program Will Keep Putting "-" In Output File And Unget Zeros
        fputs("zero", to);
      } else if (first == '1') {
        fputs("one", to);
      } else if (first == '2') {
        fputs("two", to);
      } else if (first == '3') {
        fputs("three", to);
      } else if (first == '4') {
        fputs("four", to);
      } else if (first == '5') {
        fputs("five", to);
      } else if (first == '6') {
        fputs("six", to);
      } else if (first == '7') {
        fputs("seven", to);
      } else if (first == '8') {
        fputs("eight", to);
      } else if (first == '9') {
        fputs("nine", to);
      }

      second = getc(from);
      
      if (isdigit(second)) {
        fputs("-", to);
      }
      ungetc(second, from);
    } else {
      putc(first, to);
    }
  }

  fclose(to);
  fclose(from);
  
  // You Were Returning Zero From Void Function!
  return 0;
}