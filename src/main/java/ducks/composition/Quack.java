package ducks.composition;

class Quack implements QuackBehavior {
    @Override public void quack() {
        System.out.println("quack!");
    }
}
