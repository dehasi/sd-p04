package ducks.composition;


import java.util.List;

class CompositionApplication {

    public static void main(String[] args) {
        var ducks = List.of(
                new MallardDuck(),
                new RedheadDuck().withQuackBehavior(new Quack()),
                new RubberDuck(new Squeak()) // Rubber ducks can't fly, btw wooden ducks can't swim
        );

        ducks.forEach(duck -> {
            System.out.println();
            duck.display();
            duck.performQuack();
            duck.swim();
        });
    }
}
