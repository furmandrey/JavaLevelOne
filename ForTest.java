import java.util. * ;

public class ForTest {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int food = 0;
        Cat[]cats = {
            new Cat("Tom", 5, "is hungry"),
            new Cat("Buddy", 5, "is hungry"),
            new Cat("Cody", 5, "is hungry"),
            new Cat("Dot", 5, "is hungry"),
            new Cat("Fly", 5, "is hungry")
        };

        Plate plate = new Plate(food);
        System.out.println("Please feed the cats");

        do {

            food = sc.nextInt();
            plate.addFood(food);
            for (Cat cat: cats) {
                if (cat.getH() == "is hungry")
                    cat.eat(plate);
                System.out.println(cat);
            }
            if (cats[cats.length - 1].getH() != "is full")
                System.out.println("It's not enough! Please feed one more.");
        } while (cats[cats.length - 1].getH() != "is full");

        System.out.println("Thank you! Each cat is full.");
        System.out.println(plate);

    }
}
class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    private String h;

    Cat(String name, int appetite, String h) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
        this.h = h;
    }

    void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            fullness = true;
            this.h = "is full";
        }
    }

    public String getH() {
        return h;
    }
     @ Override
    public String toString() {
        //  String h = "is hungry";
        //  if (fullness) h = "is full";
        return "Cat: " + name + " , has an appetite: " + appetite + " " + h;
    }

    //  public void setFullness(String h) {
    //       if () {
    //           this.fullness = "full";
    //       }
    //   }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int a) {
        if ((this.food - a) >= 0) {
            this.food = this.food - a;
            return true;
        }
        this.food = food;
        return false;
    }

    void addFood(int food) {
        this.food += food;
    }

     @ Override
    public String toString() {
        return "Left on the plate: " + food;
    }
}
