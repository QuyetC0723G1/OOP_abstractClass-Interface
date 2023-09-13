import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;
import test.Animal;
import test.Bird;
import test.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Bird();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Dog) {
                Edible edible = (Dog) animal;
                System.out.println(edible.howtoEat());
            }
        }

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit value : fruit) {
            System.out.println(value.howtoEat());
        }


    }
}
