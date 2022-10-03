package lab1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = "";
        while (sc.hasNext()) {
            letters += sc.nextLine();
        }
        for (int i = 0; i < letters.length(); ++i) {
            char letter = letters.charAt(i);
            System.out.println(letter + "=" + (int) letter);
        }
//        Scanner sc = new Scanner(System.in);
//        String letters = "";
//        while (sc.hasNext()) {
//            char letter = sc.nextLine().charAt(0);
//            letters += letter + "=" + (int) letter;
//        }
//        System.out.println(letters);
    }
}
