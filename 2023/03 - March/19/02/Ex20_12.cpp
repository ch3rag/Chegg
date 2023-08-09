// Exercise 20.12 Solution: Ex20_12.cpp
// Infix to postfix conversion
#include <iostream>
#include <cctype>
#include <cmath>
#include <cstring>
#include "Stack.h" //

using namespace std;

// function prototype
void convertToPostfix(char *const, char *const); // Function name says it.
bool isOperator(char);							 // Test if a character is an operator or not.
bool precedence(char, char);					 // Decide which operator has hirher precedence.
int evaluatePostfixExpression(char *const);		 // Compute the final result.
int calculate(int opnd1, int opnd2, char oper);
// Called by evaluatePostfixExpression for calculating (opnd1 oper opnd2), e.g 8+6

int main() {
	const int MAXSIZE = 100;
	char c;
	char inFix[MAXSIZE];
	char postFix[MAXSIZE];
	int pos = 0;
	int answer;
	int i = 0;

	cout << "Enter the infix expression.\n";

	// get input
	while ((c = static_cast<char>(cin.get())) != '\n')
		if (c != ' ')
			inFix[pos++] = c;

	inFix[pos] = '\0';

	cout << "The original infix expression is:\n"
		 << inFix << '\n';

	// change from infix notation into postfix notation
	convertToPostfix(inFix, postFix);

	cout << "The expression in postfix notation is:\n"
		 << postFix << endl;

	answer = evaluatePostfixExpression(postFix);
	cout << "The value of the expression is: " << answer << endl;
	return 0;
} // end main

// take out the infix and change it into postfix
void convertToPostfix(char *const infix, char *const postfix) {
	Stack<char> charStack;
	int infixCount;
	int postfixCount;
	bool higher;
	char popValue;
	char leftParen = '(';

	// push a left paren onto the stack and add a right paren to infix
	charStack.push(leftParen);
	charStack.printStack();
	strcat(infix, ")");

	// convert the infix expression to postfix
	for (infixCount = 0, postfixCount = 0; charStack.stackTop();
		 infixCount++) {
		if (isdigit(infix[infixCount]))
			postfix[postfixCount++] = infix[infixCount];
		else if (infix[infixCount] == '(') {
			charStack.push(leftParen);
			charStack.printStack();
		} else if (isOperator(infix[infixCount])) {
			higher = true; // used to store value of precedence test

			while (higher) {
				if (isOperator(charStack.stackTop())) {
					if (precedence(charStack.stackTop(),
								   infix[infixCount])) {
						charStack.pop(postfix[postfixCount++]);
						charStack.printStack();
					} // end if
					else
						higher = false;
				} // end if
				else
					higher = false;
			} // end while

			charStack.push(infix[infixCount]);
			charStack.printStack();
		} else if (infix[infixCount] == ')') {
			while (charStack.pop(popValue) && popValue != '(') {
				charStack.printStack();
				postfix[postfixCount++] = popValue;
			} // end while
			charStack.printStack();
		} // end else if
	}	  // end for

	postfix[postfixCount] = '\0';
} // end function convertToPostfix

// check if c is an operator
bool isOperator(char c) {
	if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
		return true;
	else
		return false;
} // end function isOperator

// ensure proper order of operations
bool precedence(char operator1, char operator2) {
	if (operator1 == '^')
		return true;
	else if (operator2 == '^')
		return false;
	else if (operator1 == '*' || operator1 == '/')
		return true;
	else if (operator1 == '+' || operator1 == '-') {
		if (operator2 == '*' || operator2 == '/')
			return false;
		else
			return true;
	} // end else if

	return false;
} // end function precedence

// Evaluates A Postfix Expression
int evaluatePostfixExpression(char *const expr) {
	// For Counter Variable
	int i;
	// For Storing Two Popped Operands
	int popVal1;
	int popVal2;
	// For Storing The Value To Be Pushed After Calculation
	int pushVal;
	// For Storing The Final Result Of Calculation
	int finalVal;
	// Stack For Storing Operands
	Stack<int> intStack;
	// For Storing Each Character In The Expression
	char c;

	// Append An Closing Brace
	strcat(expr, ")");

	// Loop Through Each Character In Post Fix Expression
	for (i = 0; expr[i] != ')'; i++) {
		// Store The Current Character In C
		c = expr[i];
		// If C Is A Digit
		if (isdigit(c)) {
			// The Convert C Into Integer Value And Push It Onto Stack
			intStack.push(c - '0');
			// Print The Stack
			intStack.printStack();
		} else {
			// Else Character Is An Operator
			// Pop First Operand
			intStack.pop(popVal1);
			// Print The Stack
			intStack.printStack();
			// Pop Second Operand
			intStack.pop(popVal2);
			// Print The Stack
			intStack.printStack();
			// Calculate The Result Of Applying The Operator On Two Popped Operands
			pushVal = calculate(popVal1, popVal2, c);
			// Push The Calculated Value Onto The Stack
			intStack.push(pushVal);
			// Print The Stack
			intStack.printStack();
		}
	}

	// Pop The Final Result Off The Stack
	intStack.pop(finalVal);
	// Return The Value To The Caller
	return finalVal;
} // end evaluatePostfixExpression

// Calculate The Result Of Applying The Operator On Two Popped Operands
int calculate(int op1, int op2, char oper) {
	// Switch Based On Operator
	switch (oper) {
		// Add
		case '+':
			return op1 + op2;
		// Subtract
		case '-':
			return op2 - op1;
		// Multiply
		case '*':
			return op1 * op2;
		// Divide
		case '/':
			return op2 / op1;
		// Exponent
		case '^':
			return pow(op2, op1);
	} // End Of Switch

	return 0;
} // End Function Calculate
