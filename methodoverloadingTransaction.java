package polymorphism;

public class methodoverloadingTransaction {
	  public void processTransaction(int amount) {
	        System.out.println("Processing a regular transaction of amount: $" + amount);
	        // Logic for processing regular transaction
	    }

	    public void processTransaction(int amount, String recipient) {
	        System.out.println("Processing a transaction of amount: $" + amount + " to " + recipient);
	        // Logic for processing transaction with recipient
	    }

	    public void processTransaction(int amount, String recipient, String description) {
	        System.out.println("Processing a transaction of amount: $" + amount + " to " + recipient + " with description: " + description);
	        // Logic for processing transaction with recipient and description
	    }
	
	    public static void main(String[] args) {
	    	methodoverloadingTransaction transaction = new methodoverloadingTransaction();
	        
	        transaction.processTransaction(1000);
	        transaction.processTransaction(500, "Vendor A");
	        transaction.processTransaction(200, "Vendor B", "Monthly subscription");
	    }
	}