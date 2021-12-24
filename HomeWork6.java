/**
 * Java 1. HomeWork #6
 *
 *@author Andrei Furman
 *@version 24.12.2021
 */
//ООП++

import java.util. * ;

public class HomeWork6 {
    public static void main(String[]args) {
        Cat cat = new Cat("Tom", 150, 0);
        Dog dog = new Dog("Droopy", 100, 2);

        if (dog.conditions() == true) {
            System.out.println(dog);
        } else {
            System.out.println("invalid value fo dog " + dog.name);
        }

        if (cat.conditions() == true) {
            System.out.println(cat);

        } else {
            System.out.println("invalid value fo cat " + cat.name);
        }

    }
}

class Cat extends Animal {
    Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    boolean conditions() {
        return run < 200 && swim == 0;
    }

     @ Override
    public String toString() {
        return name + " has run " + run + "m";

    }
}

class Dog extends Animal {
    Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    boolean conditions() {
        return run < 500 && swim < 10;
    }
}

class Animal {
    protected String name;
    protected int run;
    protected int swim;

    Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    String run() {
        return name + " has run " + run + "m";
    }

    String swim() {
        return " has swum " + swim + "m";
    }

     @ Override
    public String toString() {
        return name + " has run " + run + "m" + " and " + "has swum " + swim + "m";

    }
}
