#include <iostream>
using namespace std;

class Invoice {
	private:
		string partNumber;
		string partDescription;
		int quantity;
		double pricePerItem;
	
	public:
		Invoice(string partNumber, string partDescription, int quantity, double pricePerItem) {
			if (quantity < 0) {
				quantity = 0;
			}

			if (pricePerItem < 0) {
				pricePerItem = 0;
			}

			this->partNumber = partNumber;
			this->partDescription = partDescription;
			this->quantity = quantity;
			this->pricePerItem = pricePerItem;
		}


		string getPartNumber() {
			return partNumber;
		}

		string getPartDescription() {
			return partDescription;
		}

		int getQuantity() {
			return quantity;
		}

		double getPricePerItem() {
			return pricePerItem;
		}

		void setPartNumber(string partNumber) {
			this->partNumber = partNumber;
		}

		void setPartDescription(string partDescription) {
			this->partDescription = partDescription;
		}

		void setQuantity(int quantity) {
			if (quantity < 0) {
				quantity = 0;
			}

			this->quantity = quantity;
		}

		void setPricePerItem(double pricePerItem) {
			if (pricePerItem < 0) {
				pricePerItem = 0;
			}

			this->pricePerItem = pricePerItem;
		}

		double getInvoiceAmount() {
			return pricePerItem * quantity;
		}
};


int main() {
	Invoice laptop("INV0100", "IBM Laptop", 3, 1920.5);
	Invoice mouse("INV0101", "Mouse Logitech", 10, 24.6);


	cout << "Invoice Amount For " << laptop.getPartDescription() << " is " << laptop.getInvoiceAmount() << endl;
	cout << "Invoice Amount For " << mouse.getPartDescription() << " is " << mouse.getInvoiceAmount() << endl;

	return 0;
}