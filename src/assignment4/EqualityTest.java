package assignment4;

import java.util.Scanner;

public class EqualityTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original no : ");
        final int original = input.nextInt();

        while (true) {
            System.out.print("Try a no : ");
            if (original == input.nextInt()) {
                System.out.println("It is the original no.");
            } else {
                System.out.println("It is not the original no.");
            }

            System.out.print("Exit? (y/n) : ");
            if (input.next().equals("y")) return;
        }
    }

}
