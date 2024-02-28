package ducks.inheritance;

import java.util.List;

class InheritanceApplication {

    public static void main(String[] args) {
        var ducks = List.of(
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck() // Rubber ducks can't fly, btw wooden ducks can't swim
        );

        ducks.forEach(duck -> {
            System.out.println();
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
        });
    }
}
