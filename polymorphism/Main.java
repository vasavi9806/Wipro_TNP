// 1. Create a base class Fruit with name, taste, and size as attributes.
class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor to initialize attributes
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Create a method called eat() describing the name and taste
    public void eat() {
        System.out.println("Fruit Name: " + name + ", Taste: " + taste);
    }
}

// 2. Inherit the same in class Apple and override eat()
class Apple extends Fruit {
    // Constructor matching the superclass
    public Apple(String size) {
        super("Apple", "sweet and crisp", size);
    }

    // Override the eat() method to represent Apple's taste
    @Override
    public void eat() {
        System.out.println("Eating a " + size + " " + name + ". It tastes remarkably " + taste + "!");
    }
}

// 3. Inherit the same in class Orange and override eat()
class Orange extends Fruit {
    // Constructor matching the superclass
    public Orange(String size) {
        super("Orange", "sweet and tangy", size);
    }

    // Override the eat() method to represent Orange's taste
    @Override
    public void eat() {
        System.out.println("Peeling a " + size + " " + name + ". It tastes perfectly " + taste + ".");
    }
}

// Driver class to test the implementation
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Base Fruit Object ---");
        Fruit genericFruit = new Fruit("Generic Fruit", "unknown", "medium");
        genericFruit.eat();

        System.out.println("\n--- Testing Apple Object ---");
        Apple myApple = new Apple("large");
        myApple.eat();

        System.out.println("\n--- Testing Orange Object ---");
        Orange myOrange = new Orange("small");
        myOrange.eat();
    }
}