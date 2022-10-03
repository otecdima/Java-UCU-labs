package lab3;

import java.util.Scanner;

interface Learnable{
    public int age = 0;
    public int getAge();
    void setAge(int age);
}

class Human {
    public int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Human implements Learnable{
    public int age;
    public String name;
    public String gender;

    public Student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{age=" + age +", name='" + name + "', gender='" + gender + "'}";
    }

    public Student() {
    }

    //Getters and setters for name
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getters and setters for gender
    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = sc.nextInt();
        Student st;
        if (choice == 0) {
            st = new Student();
            System.out.println((st instanceof Learnable) && (st instanceof Human));
        } else if (choice == 1) {
            st = new Student(18, "Oleh", "male");
            System.out.println(st);
        } else if (choice == 2) {
            Human hm = new Student();
            System.out.println(hm.getAge());
        }
    }
}

