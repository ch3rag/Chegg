public class Driver {
	public static void main(String[] args) {
		Invoice laptop = new Invoice("INV0100", "IBM Laptop", 3, 1920.5);
		Invoice mouse = new Invoice("INV0101", "Mouse Logitech", 10, 24.6);

		System.out.println("Invoice Amount For " + laptop.getPartDescription() + " is " + laptop.getInvoiceAmount());
		System.out.println("Invoice Amount For " + mouse.getPartDescription() + " is " + mouse.getInvoiceAmount());
	}	
}

