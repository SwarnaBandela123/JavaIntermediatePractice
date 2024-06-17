package methodoverriding;
public class MethodOverridingBank {
    double getInterestRate() {
        return 0.0;
    }
}

class SavingsAccount extends MethodOverridingBank {
    @Override
    double getInterestRate() {
        return 2.5; // Savings account interest rate
    }
}

class CurrentAccount extends MethodOverridingBank {
    @Override
    double getInterestRate() {
        return 1.0; // Current account interest rate
    }

	public static void main(String[] args) {
        MethodOverridingBank bank = new MethodOverridingBank();
        SavingsAccount savings = new SavingsAccount();
        CurrentAccount current = new CurrentAccount();

        System.out.println("Bank Interest Rate: " + bank.getInterestRate());
        System.out.println("Savings Account Interest Rate: " + savings.getInterestRate());
        System.out.println("Current Account Interest Rate: " + current.getInterestRate());
    }
}