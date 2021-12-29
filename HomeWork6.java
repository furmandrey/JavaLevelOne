/**
 * Java 1. HomeWork #6
 *
 *@author Andrei Furman
 *@version 27.12.2021
 */
//ООП++

import java.util. * ;

public class HomeWork6 {
    public static void main(String[]args) {
        Cat cat = new Cat("Tom", 200);
        Dog dog = new Dog("Droopy", 500, 10);
        cat.run(200);
        cat.swim(1);
        cat.run(300);
        dog.swim(11);
        dog.swim(10);
        dog.swim(9);
        dog.run(501);
        dog.run(500);
        dog.run(499);
       System.out.println("Animals were created: " + Animal.countOfAnimals + "pcs"); 
    }
}
interface RunSwim {
    void run(int runLgth);
    void swim(int swimLgth);

}

abstract class Animal implements RunSwim {
    protected String name;
    protected int maxRunLghth;
    protected static int countOfAnimals = 0;

    Animal(String name, int maxRunLghth) {
        this.name = name;
        this.maxRunLghth = maxRunLghth;
        countOfAnimals++;
    }

    public static int countOfAnimals() {
      return countOfAnimals;
    }
}

class Cat extends Animal {
    Cat(String name, int maxRunLghth) {
        super(name, maxRunLghth);
    }

     @Override //cat run
    public void run(int runLgth) {
        if (runLgth <= maxRunLghth) {
            System.out.println(name + " has run " + runLgth + " m.");
        } else {
            System.out.println(" Sorry, " + name + " can't run so long");
        }
    }

     @Override //cat swim
    public void swim(int swimLgth) {

        System.out.println("Sorry, " + name + " can't swim at all :-( ");

    }
}

class Dog extends Animal {
    protected int maxSwimLghth;

    Dog(String name, int maxRunLghth, int maxSwimLghth) {
        super(name, maxRunLghth);
        this.maxSwimLghth = maxSwimLghth;
    }

     @Override
    public void run(int runLgth) {
        if (runLgth <= maxRunLghth) {
            System.out.println(name + " has run " + runLgth + " m.");
        } else {
            System.out.println(" Sorry, " + name + " can't run so long");
        }
    }

     @Override
    public void swim(int swimLgth) {
        if (swimLgth <= maxSwimLghth) {
            System.out.println(name + " has swum " + swimLgth + " m.");
        } else {
            System.out.println(" Sorry, " + name + "can't swim so long");
        }
    }
}
