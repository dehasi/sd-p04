package ducks.inheritance;

// Add fly
abstract class Duck {
    void quack() {
        System.out.println("quack!");
    }

    void fly() {
        System.out.println("I'm flying!");
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    abstract void display();
}
