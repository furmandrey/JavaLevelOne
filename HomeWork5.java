/**
 * Java 1. HomeWork #5
 *
 *@author Andrei Furman
 *@version 22.12.2021
 */
//ООП

import java.util. * ;

public class HomeWork5 {
    public static void main(String[]args) {
        Employee employee = new Employee("Kevin Smit", "manager", "kevin@gmail.com", "+7(916)2223344", 10000, 35);
        //System.out.println(employee.display());
        System.out.println(employee);

        Employee[]employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@gmail.com", "+7(916)2223344", 10000, 50);
        employeeArray[1] = new Employee("Peter Hubbard", "Engineer", "Peter@mgmail.com", "+7(915)1113344", 10000, 35);
        employeeArray[2] = new Employee("Dwayne Buttler", "manager", "Dwayne@gmail.com", "+7(918)5553344", 10000, 39);
        employeeArray[3] = new Employee("Clifton Walsh", "manager", "Clifton@gmail.com", "+7(916)2221100", 10000, 41);
        employeeArray[4] = new Employee("Anthony Good", "manager", "Anthony@gmail.com", "+7(916)2226677", 10000, 45);

        employeeArray[4].setSalary(11000);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40)
                System.out.println(employeeArray[i].display());
            //if (employeeArray[i].getAge() > 40) employeeArray[i].show();
        }

    }
}
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        if (salary != 0) {
            this.salary = salary;
        }
    }

    String display() {
        return fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age;
    }

    // public void show() {
    //     System.out.println(fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age);
    // }

    public void show() {
        System.out.println(fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age);
    }

    public String toString() {
        return fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age;

    }
}
