package exceptionhandling;

import java.io.IOException;

public class multiplecatchblocks {
public static void multipleexceptions() {
	 int[] array= {1,2,3};

try {
	System.out.println(array[2]/0);
} catch (ArrayIndexOutOfBoundsException E1) {
    System.out.println("ArrayIndexOutOfBoundsException: " + E1.getMessage());
    System.err.println("Please use the index within the array range");
} catch (ArithmeticException E2) {
    System.out.println("ArithmeticException: " + E2.getMessage());
    System.err.println("The value can't divided by Zero");

}
}
public static void main(String[] args) throws Exception {
	multipleexceptions();
}
}
