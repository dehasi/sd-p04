package ducks.composition;

class RubberDuck extends Duck {

    // or "inject" via a constructor
    public RubberDuck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override void display() {
        System.out.println("I am look like a rubberduck");
    }
}
