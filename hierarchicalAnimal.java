package Inheritance;

public class hierarchicalAnimal {
    String name;
	public void eat() {
        System.out.println("Animal is eating");
    }
}
class Dogbarking extends hierarchicalAnimal {
    public void bark() {
    	System.out.println("My dog name is:" +name);
        System.out.println("Dog is barking");
    }
}
class Catmeow extends hierarchicalAnimal {
    public void meow() {
    	System.out.println("My cat name is:" +name);
        System.out.println("Cat is meowing");
    }
}
class MC {
    public static void main(String[] args) {
    	Dogbarking dog = new Dogbarking();
    	Catmeow cat = new Catmeow();
        dog.name="Buddy";
        dog.eat(); 
        dog.bark();
        cat.name="Fluffy";
        cat.meow();
    }
}