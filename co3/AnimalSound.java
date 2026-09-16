interface Soundable {
    void makeSound();
}

interface Feedable {
    void eat();
}

abstract class Animal implements Soundable, Feedable {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating bones.");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is drinking milk.");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.makeSound();
        dog.eat();
        dog.sleep();

        System.out.println();

        Animal cat = new Cat("Whiskers");
        cat.makeSound();
        cat.eat();
        cat.sleep();
    }
}
