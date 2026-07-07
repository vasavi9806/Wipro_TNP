class Animal {
    void eat() { System.out.println("Animal is eating..."); }
    void sleep() { System.out.println("Animal is sleeping..."); }
}

class Bird extends Animal {
    @Override
    void eat() { System.out.println("Bird is pecking at seeds..."); }
    
    @Override
    void sleep() { System.out.println("Bird is sleeping in the nest..."); }

    void fly() { System.out.println("Bird is flying high!"); }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();
        myAnimal.sleep();

        Bird myBird = new Bird();
        myBird.eat();
        myBird.sleep();
        myBird.fly();
    }
}