package ducks.interfaces;

class RubberDuck extends Duck implements Quackable {

    @Override public void quack() {
        System.out.println("squeak!");
    }

    @Override void display() {
        System.out.println("I am look like a rubberduck");
    }
}
