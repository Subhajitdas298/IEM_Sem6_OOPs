package assignment5;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    }

}
