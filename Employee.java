package Encapsulation;

public class Employee {
    // private instance variables
    private String name;
    private int age;
    private double salary;

    // constructor to initialize the instance variables
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // getter method for the name attribute
    public String getName() {
        return name;
    }

    // setter method for the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // getter method for the age attribute
    public int getAge() {
        return age;
    }

    // setter method for the age attribute
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // getter method for the salary attribute
    public double getSalary() {
        return salary;
    }

    // setter method for the salary attribute
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public static void main(String[] args) {

        // create an object of the Person class
    	Employee person = new Employee("John Doe", 25, 50000);

        // print the object using the toString method
        System.out.println(person);

        // use the setter method to change the name attribute
        person.setName("Jane Doe");

        // use the getter method to get the name attribute
        System.out.println("Name: " + person.getName());

        // use the setter method to change the age attribute
        person.setAge(10);

        // use the getter method to get the age attribute
        System.out.println("Age: " + person.getAge());

        // use the setter method to change the salary attribute
        person.setSalary(60000);

        // use the getter method to get the salary attribute
        System.out.println("Salary: " + person.getSalary());

    }

}