package methodoverriding;

public class SuperKeyword {
	    String name;
	    int age;

	    SuperKeyword(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Manager extends SuperKeyword {
	    double salary;

	    Manager(String name, int age, double salary) {
	        super(name, age); // calling the constructor of the superclass
	        this.salary = salary;
	    }

	    void display() {
	        super.display(); // calling the display method of the superclass
	        System.out.println("Salary: " + salary);
	    }
	    public static void main(String[] args) {
	        Manager manager = new Manager("John Doe", 30, 50000);
	        manager.display();
	    }
	}
	
