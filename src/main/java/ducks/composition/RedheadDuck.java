package ducks.composition;

class RedheadDuck extends Duck {

    // we can use a "classical" setter
    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // we can use a "fluent" setter
    RedheadDuck withQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this;
    }

    @Override void display() {
        System.out.println("I am look like a readhead");
    }
}
