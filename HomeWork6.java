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
       Cat cat = new Cat("Tom");
       Dog dog = new Dog("Droopy");
        cat.run(200);
        cat.swim(1);
        cat.run(300);
       dog.swim(11);
       dog.swim(10);
       dog.swim(9);
       dog.run(501);
       dog.run(500);
       dog.run(499);
    }
}
interface RunSwim {
    void run(int runLgth);
    void swim(int swimLgth);

}
// interface Swim {
//     void swim(int runLgth);
// }

abstract class Animal implements RunSwim {
    protected String name;
        Animal(String name) {
         this.name = name;
        }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override //cat run
    public void run(int runLgth) {
        if (runLgth <= 200) {
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
    Dog(String name) {
        super(name);
    }

    @Override
    public void run(int runLgth) {
        if (runLgth <= 500) {
            System.out.println(name + " has run " + runLgth + " m.");
        } else {
            System.out.println(" Sorry, " + name + " can't run so long");
        }
    }

    @Override
    public void swim(int swimLgth) {
        if (swimLgth <= 10) {
            System.out.println(name + " has swum " + swimLgth + " m.");
        } else {
            System.out.println(" Sorry, " + name + "can't swim so long");
        }
    }
}
