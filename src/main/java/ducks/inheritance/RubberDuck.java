package ducks.inheritance;

class RubberDuck extends Duck {

    @Override void quack() {
        System.out.println("squeak!");
    }

    @Override void fly() {
        System.out.println("I can't fly");
    }

    @Override void display() {
        System.out.println("I am look like a rubberduck");
    }
}
