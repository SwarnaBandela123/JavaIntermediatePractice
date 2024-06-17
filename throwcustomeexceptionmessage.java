package exceptionhandling;

public class throwcustomeexceptionmessage {
	public static void multipleexceptions() {
		 int[] array= {1,2,3};

	try {
		System.out.println(array[2]/0);
	} 
	catch (ArithmeticException E1) {
	   throw new ArithmeticException("Can't divided the value with Zero");

	}
	}
	public static void main(String[] args) throws Exception {
		multipleexceptions();
	}
	}
