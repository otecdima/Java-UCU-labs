package lab3;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        /*Write code HERE*/
        NewMan man = new NewMan();

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(); // <- 93

        System.out.println(man.sayAge()); // prints '0'
        changeAge(man, age);
        System.out.println(man.sayAge()); // prints '93'
        /*or HERE*/
    }

    public static void changeAge(NewMan a, int age){
        /*HERE*/
        a.setAge(age);
    }
}

/* even HERE if you want, THIS IS ALL PLACES WHERE YOU CAN WRITE CODE*/
class NewMan extends Man {
    private int age;

    public int sayAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Man {
    /* but not here */
    private int age;

    public Man(){
        age = 0;
    }

    public Man(int age){
        this.age = age;
    }

    public int sayAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}
