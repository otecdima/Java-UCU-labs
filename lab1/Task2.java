package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int number_ = numbers.nextInt();
        String finale = "";
        finale += number_;
        while (number_ != 1) {
            if (number_ % 2 == 0) {
                number_ /= 2;
                finale += " " + number_;
            }
            else {
                number_ = number_ * 3 + 1;
                finale += " " + number_;
            }
        }
        System.out.println(finale);
    }
}
