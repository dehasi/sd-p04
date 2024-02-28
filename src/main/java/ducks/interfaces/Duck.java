package ducks.interfaces;

abstract class Duck {

    void swim() {
        System.out.println("I'm swimming");
    }

    abstract void display();
}
