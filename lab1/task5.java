package lab1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine();
        String letters_ = sc.nextLine();
        if (letters.equals(letters_)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
