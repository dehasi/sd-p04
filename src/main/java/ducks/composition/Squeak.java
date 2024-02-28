package ducks.composition;

class Squeak implements QuackBehavior {
    @Override public void quack() {
        System.out.println("squeak!");
    }
}
