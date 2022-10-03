package lab1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        String letters = sc.nextLine();
        String finale_letters = "";
        for (int i = 0; i < letters.length(); ++i) {
            finale_letters += alphabet.charAt(alphabet.indexOf(letters.charAt(i)) + 1) + "|";
        }
        System.out.println(finale_letters);
    }
}