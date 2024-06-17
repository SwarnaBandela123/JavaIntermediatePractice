package interfaceexamples;

public class interfacemainmethod {
	   public static void main(String[] args) {
	        // Customer selects a credit card for payment
	        paymentmethod paymentMethod = new creditcard("1234-5678-9012-3456", "John Doe");

	        // Total amount for the purchase
	        double amount = 100.0;

	        // Process payment
	        paymentMethod.pay(amount);
	    }
}
