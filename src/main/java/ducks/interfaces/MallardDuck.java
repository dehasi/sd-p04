package ducks.interfaces;

class MallardDuck extends Duck implements Quackable {

    @Override public void quack() {
        System.out.println("quack!");
    }   // <- Duplication

    @Override void display() {
        System.out.println("I am look like a mallard");
    }
}
