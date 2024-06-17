package interfaceexamples;

public class creditcard implements paymentmethod  {
	  private String cardNumber;
	    private String cardHolderName;

	    public creditcard(String cardNumber, String cardHolderName) {
	        this.cardNumber = cardNumber;
	        this.cardHolderName = cardHolderName;
	    }
	
	public void pay(double amount) {
		System.out.println("Paid $" + amount + ", using credit card - " + cardNumber + ", Credit card holder name - " +cardHolderName);
	}
}
