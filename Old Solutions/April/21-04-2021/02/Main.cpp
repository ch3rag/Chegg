#include <stdio.h>
#include <string.h>
char jobTitles[5][50] {
	"Lecturer",
	"Assistant Professorial Lecturer",
	"Associate Professorial Lecturer",
	"Professorial Lecturer",
	"Senior Professorial Lecturer"
};

double ratesPerHour[5] {
	578, 817, 890, 1890, 2592
};

void drawLine (int len) {
	for (int i = 0; i < len; i++) {
		printf("-");
	}
	printf("\n");
}

void displaySalaryMatrix() {
	int i;

	printf("%-8s%-35s%-15s\n", "Rank", "Job Title", "Rate Per Hour");
	drawLine(56);
	for (i = 0; i < 5; i++) {
		printf("%-8d%-35s%-15.2f\n", i + 1, jobTitles[i], ratesPerHour[i]);
	}
	printf("\n");
}

char * getJobTitle(int rank)  {
	return jobTitles[rank - 1];
}

double getRatePerHour(int rank) {
	return ratesPerHour[rank - 1];
}

double getGrossPay(int numOfHours, double ratePerHour) {
	return numOfHours * ratePerHour;
}

double getTaxDeductions(double gross) {
	if (gross <= 10000) {
		return gross * 0.05;
	} else if (gross <= 30000) {
		return 500 + (gross - 10000) * 0.10;
	} else if (gross <= 70000) {
		return 2500 + (gross - 30000) * 0.15;
	} else if (gross <= 140000) {
		return 8500 + (gross - 70000) * 0.20;
	} else if (gross <= 250000) {
		return 22500 + (gross - 140000) * 0.25;
	} else if (gross <= 500000) {
		return 50000 + (gross - 250000) * 0.30;
	} else {
		return 125000 + (gross - 500000) * 0.32;
	}
}

int main() {
	char name[30];
	char * jobTitle;
	int idNumber, rank, numOfHours;
	double grossPay, ratePerHour, tax, sss, totalDeductions, netPay;
	double philHealth = 150.00, pagIbig = 150.00;

	// Part 1: Display Salary Matrix
	displaySalaryMatrix();

	// Part 2: Prompt The User For Info
	printf("Name: ");
	fgets(name, 50, stdin); strtok(name, "\n");

	printf("Id Number: ");
	scanf("%d", &idNumber);
	
	printf("Rank: ");
	scanf("%d", &rank);

	printf("Number Of Hours Rendered: ");
	scanf("%d", &numOfHours);

	// Part 3: Determine Job Title And Rate Per Hour
	jobTitle = getJobTitle(rank);
	ratePerHour = getRatePerHour(rank);

	// Part 4: Compute Gross Pay
	grossPay = getGrossPay(numOfHours, ratePerHour);

	// Part 5: Compute The Tax
	tax = getTaxDeductions(grossPay);

	// Part 6: Compute SSS Premium
	sss = grossPay * 0.03;

	// Part 7: Compute Total Deductions
	totalDeductions = tax + sss + philHealth + pagIbig;

	// Part 8: Compute Net Pay
	netPay = grossPay - totalDeductions;

	// Part 9: Display Payslip
	drawLine(56);
	printf("Id Number: %-19dName: %s\n", idNumber, name);
	printf("Rank: %d\n", rank);
	printf("Rate Per Hour: %-15.2fNo. Of Hours Rendered: %d\n", ratePerHour, numOfHours);
	drawLine(56);
	printf("%-25s%.2f\n", "Gross Pay: ", grossPay);
	printf("%-25s%.2f\n", "Tax: ", tax);
	printf("%-25s%.2f\n", "SSS: ", sss);
	printf("%-25s%.2f\n", "Pag-Ibig: ", pagIbig);
	printf("%-25s%.2f\n", "PhilHealth: ", philHealth);
	printf("%-25s%.2f\n", "Total Deductions: ", totalDeductions);
	drawLine(56);
	printf("%-25s%.2f\n", "Net Pay: ", netPay);
	drawLine(56);

	return 0;
}


