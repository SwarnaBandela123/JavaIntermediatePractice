package Inheritance;

//Parent class
class multilevelinheritance {
	public void eat() {
	    System.out.println("I can eat meat");
	  }
	}

	// child class
	class Cat extends multilevelinheritance {
	  public void bark() {
	    System.out.println("I can bark");
	  }
	}

	// SubChild class
	class Labrador extends Cat {
	  public void color() {
	    System.out.println("My cat color is white");
	  }
	}

	// Main class
	class Main {
	  public static void main(String[] args) {
	    Labrador labrador = new Labrador();
	    labrador.eat();
	    labrador.bark();
	    labrador.color();
	  }
	}