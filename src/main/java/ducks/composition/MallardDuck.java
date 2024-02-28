package ducks.composition;

class MallardDuck extends Duck {

    public MallardDuck() {
        // Creating objects in a constructor is not recommended. We'll see why if we have time
        this.quackBehavior = new Quack();
    }

    @Override void display() {
        System.out.println("I am look like a mallard");
    }
}
