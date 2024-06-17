package exceptionhandling;

import java.util.Scanner;

public class trycatchfinallyblocs {
public static void arthimeticoperation() {
	System.out.println("Please enter regular salary");
	Scanner input1=new Scanner(System.in);
	int regsalary= input1.nextInt();
	System.out.println("Please enter variablepay");
	Scanner input2=new Scanner(System.in);
	int variablepay= input2.nextInt();
	int marchsalary=0;
	try {
		marchsalary=regsalary+variablepay;
	}
	catch(ArithmeticException AE){
		System.out.println(AE.toString());
	}
	
	System.out.println("March month salary: "+marchsalary);

}
public static void main(String[] arg) {
	System.out.println("Program execution started");
	arthimeticoperation();
	System.out.println("Program execution ended");

}
}
