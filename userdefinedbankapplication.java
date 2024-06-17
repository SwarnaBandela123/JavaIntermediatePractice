package exceptionhandling;

import java.util.Scanner;

public class userdefinedbankapplication {

	public static void main(String[] args) throws DayLimitCrossException{
System.out.println("Please enter the withdraw money");
Scanner withdramoney=new Scanner(System.in);
int amount=withdramoney.nextInt();
if (amount>10000) {
	throw new DayLimitCrossException("Please check the limit");
}else {
	System.out.println("Amount withdrawn successfully");
}
	}
}
class DayLimitCrossException extends Throwable{
	DayLimitCrossException(String s){
		super(s);
	}
}