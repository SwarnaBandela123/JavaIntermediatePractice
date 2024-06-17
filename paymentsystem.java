package AbstractClass;

public class paymentsystem extends payment{
    public paymentsystem(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        // Create a CreditCardPayment object
        payment creditCard = new CreditCardPayment(100.0, "1234-5678-9012-3456");
        creditCard.validatePayment();
        creditCard.processPayment();
}

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		
	}

}
