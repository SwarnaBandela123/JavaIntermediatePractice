package methodoverloading;

public class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling method to add two integers
        System.out.println("Addition of two integers: " + calc.add(10, 20));

        // Calling overloaded method to add two double values
        System.out.println("Addition of two doubles: " + calc.add(15.5, 4.5));

        // Calling overloaded method to add three integers
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
    }
}