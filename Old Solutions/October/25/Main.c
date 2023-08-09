/* For Simplicity, This Program Will Get the Information 
 * of Each Client, and Print It Right Back. We Could Get 
 * the Information of All Clients First, Then Print Them 
 * All Later for Better Readability Using an Array of Struct.
 */
#include<stdio.h>
#include<stdbool.h>
#define length 70

// Assume There's No Names Longer than 70 
/* It's Good Practice to Add All Function Headers to the
 * Top of the Program
 */
 
struct employee getEmployeeInfo();
void printEmployeeInfo(struct employee em);
struct client getClientInfo(int i);
void printClientInfo(struct client cli, int i);
 
/* Employee Struct: All the Arrays Use the Same Constant Size Defined on Top 
 * Name-First, Last-(String)
 * Title (String)
 * Number of Clients (Integer)
 * Number of Years Working at the Company (Can Take Decimal Points).
 */

struct employee {
	char first_name[length];
	char last_name[length];
	char title[length];
	int num_clients;
	float num_yrs_worked; // 3 and a Half Year Would Be 3.5
};

/* Client Struct:
 * Name (First, Last)
 * Client Id (Integer)
 * Age (Integer)
 * Number of Products Purchased (Integer).
 */

struct client {
	char first_name[length];
	char last_name[length];
	int clientID;
	int age;
};


/* Employee This Function Get an Employee's Info, save It to the Employee Struct, 
 * And Return the Employee Struct
 */ 
struct employee getEmployeeInfo() {
	struct employee emp;
	printf("\nNeed 2 values. Enter the employee full name (first, then last): ");
	scanf(" %s %s", emp.first_name, emp.last_name);
	printf("Enter the employee's title: ");
	scanf(" %s", emp.title);
	printf("Need 2 numbers. Enter the number of clients, then years of employment: ");
	scanf("%d %f", &emp.num_clients, &emp.num_yrs_worked);
	return emp;
}

/* This Function Takes an Employee Struct and Print Their Info:
 * Ex:
 * Hello First_name Last_name.
 * Title: Def.
 * Number of Clients: Abc.
 * Years of Employment: Xyz.
 */

void printEmployeeInfo(struct employee em) {
	printf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	printf("Printing back Employee Info\n");
	printf("\nHello %s %s.\nTitle: %s.\n", em.first_name, em.last_name, em.title);
	printf("Number of clients: %d.\n", em.num_clients);
	printf("Number years of employment: %.1f.\n", em.num_yrs_worked);
	printf("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
}

/* Client */
/* This Function Take an Index, Get a Client's Info and Return the Client Struct */
struct client getClientInfo(int i) {
	printf("\nProcessing Client #%d", i+1);
	struct client cli;
	printf("\nNeed 2 values. Enter the client full name (first, then last): ");
	scanf(" %s %s", cli.first_name, cli.last_name);
	printf("Need 2 numbers. Enter your client ID, followed by your age: ");
	scanf("%d %d", &cli.clientID, &cli.age);
	return cli;
}

/* This Function Takes an Client Struct and Print Their Info:
 * Ex:
 * Hello First_name Last_name.
 * Client Id: Abc.
 * Age: Xyz.
 */
void printClientInfo(struct client cli, int i) {
	printf("\n------------------------\n");
	printf("Printing Client #%d info: ", i+1);
	printf("\nHello %s %s.\n", cli.first_name, cli.last_name);
	printf("ClientID: %d.\n", cli.clientID);
	printf("Age: %d.", cli.age);
	printf("\n------------------------\n");
}

// Main
int main() {
	
	// Create 2 Struct for Employee, and Client in That Order
	struct employee my_emp;
	struct client my_cli;
	printf("Hi, I'm here to take some statistics: ");
	
	/* Get and Print Employee's Info */
	my_emp = getEmployeeInfo();
	printEmployeeInfo(my_emp);

	/* Get and Print Clients's Info Use \ to Break Printf to Multiple Lines without Getting Errors*/
	printf("\n\nNow, let's move on to your client(s).\nAccording to the chart, \
you have %d clients.\n", my_emp.num_clients);

	// Going through All the Clients, Get & Print Each Client's Info
	for(int i = 0; i < my_emp.num_clients; i ++) {
		my_cli = getClientInfo(i);
		printClientInfo(my_cli, i);
	}
	printf("\n\nThank you for your patience. You have a great day :)\n");
	return 0;
}
