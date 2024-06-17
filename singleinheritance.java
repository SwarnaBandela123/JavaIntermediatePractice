package Inheritance;

class singleinheritance {

	String name;
	
	public void eat()
	{
   	  System.out.println("I can eat meat");
	}
}

class Dog extends singleinheritance {
	public void dogname() {
 	  System.out.println("My name is: " +name);
	}
}
class mainclass{
	public static void main(String[] args) {
		Dog AnimalDog=new Dog();
		AnimalDog.name="Dog";
		AnimalDog.dogname();
		AnimalDog.eat();
		
	}
}