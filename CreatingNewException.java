package exceptionhandling;

import java.io.IOException;

public class CreatingNewException {
	 public static void main(String[] args) throws Exception{
	        try {
				System.out.println(1/0);
			} catch (ArithmeticException e) {
				throw new LoginException("Please try again");
			}
	    }
	 
}
