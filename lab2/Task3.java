package lab2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(calculate(s));
    }


    public static int calculate(String target) {
        String initial = "";
        int counter = 0;
        for (int i = 0; i < target.length()/3; i++) {
            initial += "SOS";
        }
        System.out.println(initial);
        for (int i = 0; i < target.length(); i++) {
            if (!String.valueOf(initial.charAt(i)).equals(String.valueOf(target.charAt(i)))) {
                ++counter;
            }
        }
        return counter;
    }
}
