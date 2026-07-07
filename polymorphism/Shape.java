// 1. Create a base class named Shape with draw() and erase() methods
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}

// 2. Create Circle subclass overriding the parent functions
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

// 3. Create Triangle subclass overriding the parent functions
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

// 4. Create Square subclass overriding the parent functions
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

// Driver class to observe the polymorphic behavior
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Polymorphic Behavior Demo ---");

        // Instantiating subclasses using a superclass reference variable
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        // Calling methods on Circle reference
        c.draw();
        c.erase();
        System.out.println();

        // Calling methods on Triangle reference
        t.draw();
        t.erase();
        System.out.println();

        // Calling methods on Square reference
        s.draw();
        s.erase();
    }
}