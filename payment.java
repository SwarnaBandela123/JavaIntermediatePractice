package AbstractClass;

// Abstract class for payment
public abstract class payment {
    // Protected data member for the payment amount
    protected double amount;

    // Constructor
    public payment(double amount) {
        this.amount = amount;
    }

    // Abstract method for processing the payment
    public abstract void processPayment();

    // Concrete method for validating the payment amount
    public void validatePayment() {
        if(amount > 0) {
            System.out.println("The payment amount is valid.");
        } else {
            System.out.println("The payment amount is invalid.");
        }
    }
}

// Concrete class for CreditCard payment
class CreditCardPayment extends payment {
    // Data member for the card number
    private String cardNumber;

    // Constructor
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount); // Calling the constructor of the parent class
        this.cardNumber = cardNumber;
    }

    // Implementing the abstract method
    public void processPayment() {
        // Process credit card payment here
        System.out.println("Processing credit card payment for amount: " + amount);
    }
}

// Concrete class for PayPal payment
class PayPalPayment extends payment {
    // Data member for the email address
    private String email;

    // Constructor
    public PayPalPayment(double amount, String email) {
        super(amount); // Calling the constructor of the parent class
        this.email = email;
    }

    // Implementing the abstract method
    public void processPayment() {
        // Process PayPal payment here
        System.out.println("Processing PayPal payment for amount: " + amount);
    }

    public static void main(String[] args) {
        // Create a CreditCardPayment object
        payment creditCard = new CreditCardPayment(100.0, "1234-5678-9012-3456");
        creditCard.validatePayment(); // Calling the validatePayment method
        creditCard.processPayment(); // Calling the processPayment method

        // Create a PayPalPayment object
        payment payPal = new PayPalPayment(200.0, "user@example.com");
        payPal.validatePayment(); // Calling the validatePayment method
        payPal.processPayment(); // Calling the processPayment method
    }
}
