package exceptionhandling;

public class multipleexceptionswithsinglecatchblock {
	public static void multipleexceptions() {
		 int[] array= {1,2,3};

	try {
		System.out.println(array[2]/0);
	} catch (ArrayIndexOutOfBoundsException | ArithmeticException E1) {
	    System.out.println("Common exceptions for array: " + E1.getStackTrace());
	    System.err.println("Exception occured in array");
	    System.exit(0);
	}finally {
		System.out.println("Array program executed successfully");
	}
	}
	
	public static void main(String[] args) throws Exception {
		multipleexceptions();
		try
	}
}