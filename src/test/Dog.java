package test;

import edible.Edible;

public class Dog extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Go go go...";
    }

    @Override
    public String howtoEat() {
        return "An ca xuong ";
    }
}
