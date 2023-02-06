#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 50

// Single Node
struct Node {
	struct Node * next;
	int data;
};

// Node Typedef
typedef struct Node Node;

// Push An Item Onto Stack
void push(Node ** head, int data) {
	// Allocate A New Node
	Node * newNode = (Node *) malloc(sizeof(Node));
	// Set The Pointers
	newNode->data = data;
	newNode->next = *(head);
	// Make It New Head Node
	*(head) = newNode;
}

// Prints Stack
// I've Used Single Function To Print Char Stacks And Int Stacks
void display(Node * head, int isCharStack) {
	// Temporary Pointer
	Node * current = head;
	// While Current Isn't Null
	while (current != NULL) {
		if (isCharStack) {
			// Display Char Data If Stack Holds Characters
			printf("%c -> ", current->data);
		} else  {
			// Display Int Data If Stack Holds Integers
			printf("%d -> ", current->data);
		}
		// Advance The Pointer
		current = current->next;
	}
	printf("NULL\n");
}

// Pop An Item From Stack
int pop(Node ** head) {
	// If Head Is Null, Return -1
	if (*(head) == NULL) {
		return -1;
	}
	// Get The Node To Be Deleted
	Node * toDelete = *(head);
	// Get It's Data
	int data = toDelete->data;
	// Advance Head Pointer
	*(head) = toDelete->next;
	// Free Old Head
	free(toDelete);
	// Return Data
	return data;
}

// Returns The Precedence Of The Operator
int operator(char ch) {
	switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		default:
			return 0;
	}
}

// Computes A Simple Expression
int compute(int x, int y, int operator) {
	switch (operator) {
		// Addition
		case '+':
			return x + y;
		// Subtraction
		case '-':
			return y - x;
		// Division
		case '/':
			return y / x;
		// Multiplication
		case '*':
			return x * y;
		// Unknown
		default:
			return 0;
	}
}

// Evaluates An Expression
void evaluate(char * expression) {
	// Stacks To Hold Operators And Operands
	Node * operatorStack = NULL;
	Node * operandStack = NULL;
	// Iterate Over Each Character
	for (int i = 0; i < MAX && expression[i] != '\0'; i++) {
		// Get The Current Character In The Expression
		char ch = expression[i];
		// If Character Is A Number
		if (ch >= '0' && ch <= '9') {
			// Push It Onto Operand Stack
			push(&operandStack, ch - '0');
		// If Character If Left Parenthesis
		} else if (ch == '(') {
			// Push It Onto Operator Stack
			push(&operatorStack, ch);
		// Else If Character Is An Operator In The Set {+, -, /, *, %}
		} else if (operator(ch)) {
			// If Operator Stack Is Null
			// OR
			// Precedence Of Current Operator > Operator On Top Of The Operator Stack
			if (operatorStack == NULL || operator(ch) > operator(operatorStack->data)) {
				// Push The Operator Onto The Operator Stack
				push(&operatorStack, ch);
			} else {
				// Else An Evaluation Take Place
				// Pop Two Operands
				int x = pop(&operandStack);
				int y = pop(&operandStack);
				// Pop An Operator
				char op = pop(&operatorStack);
				// Compute The Result
				int result = compute(x, y, op);
				// Push The Result Onto Operand Stack
				push(&operandStack, result);
				// Push New Operator Onto Stack
				push(&operatorStack, ch);
			}
		} else if (ch == ' ') {
			continue;
		}

		// If The Character Is Right Parenthesis
		// OR
		//  We Reached End Of Expression
		if (ch == ')' || expression[i + 1] == '\0') {
			// While We Not Encounter Left Parenthesis In The Operator Stack
			// And We Reached End Of Operator Stack
			while (operatorStack && operatorStack->data != '(') {
				// Keep Evaluating
				int x = pop(&operandStack);
				int y = pop(&operandStack);
				char op = pop(&operatorStack);
				int result = compute(x, y, op);
				push(&operandStack, result);
			}
			// Pop Left Parenthesis
			pop(&operatorStack);
		}

		// Display Stack After Each Step
		printf("+-----------------------------+\n");
		printf("Operator Stack: ");
		display(operatorStack, 1);
		printf("Operand Stack: ");
		display(operandStack, 0);
	}
	printf("+-----------------------------+\n\n");
	// Display Result
	printf("%s = %d\n", expression, operandStack->data);
	// Free Any Left Nodes
	while (operandStack) pop(&operandStack);
	while (operatorStack) pop(&operatorStack);
}

int main() {
	char choice, expression[MAX];
	do {
		printf("Enter an expression: ");
		// Input Expression
		fgets(expression, MAX, stdin);
		// Remove Trailing New Line
		expression[strcspn(expression, "\n")] = 0;
		// Evaluate Expression
		evaluate(expression);
		// Check If User Wants To Input More Expressions
		printf("Do you want to enter another expression (Y/N)? ");
		scanf("%c", &choice);
		fflush(stdin);
	} while (choice == 'y' || choice == 'Y');

	printf("Program completed.");
	
	return 0;
}

// (((6 + 9) / 3) * (6 - 4))
// 6 + 9 / 3 * 6 - 4