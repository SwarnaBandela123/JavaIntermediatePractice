package Inheritance;

interface multipleinheritance {
    void attack();
}

interface Weapon {
    void use();
}

class Warrior implements multipleinheritance, Weapon {
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.attack();
        warrior.use();
    }
}