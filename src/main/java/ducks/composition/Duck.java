package ducks.composition;

abstract class Duck {
    protected QuackBehavior quackBehavior;

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    abstract void display();
}
