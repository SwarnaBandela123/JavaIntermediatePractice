package Inheritance;

public class organization {
    String employeeName;
	public void work()
    {
	System.out.println("Employees are working");
    }
}
class manager extends organization {
	public void manager() {
		System.out.println("The manager name is " + employeeName + ", He is managing the team.");
	}
}
class devloper extends organization{
	public void devloper() {
		System.out.println("The developer name is " + employeeName + " He is devloping the code.");	}
}
class Cognineorganization{
	public static void main(String[] org) {
	manager M=new manager();
	devloper D=new devloper();
	M.employeeName="Sanjeev";
	D.employeeName="Harsha";
	M.manager();
	D.devloper();
	}
}