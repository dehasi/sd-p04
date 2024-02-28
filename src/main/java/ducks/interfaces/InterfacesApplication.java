package ducks.interfaces;

import java.util.List;

class InterfacesApplication {

    public static void main(String[] args) {
        var ducks = List.of(
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck()
        );

        ducks.forEach(duck -> {
            System.out.println();
            duck.display();
            duck.quack();
            duck.swim();
        });
    }
}
