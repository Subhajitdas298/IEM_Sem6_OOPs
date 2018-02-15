package assignment1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int operand1 = 0, operand2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Select operation : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int option = input.nextInt();

        System.out.print("Enter Number 1 : ");
        operand1 = input.nextInt();
        System.out.print("Enter Number 2 : ");
        operand2 = input.nextInt();

        switch (option) {
            case 1:
                System.out.println(operand1 + " + " + operand2 + " : " + (operand1 + operand2));
                break;
            case 2:
                System.out.println(operand1 + " - " + operand2 + " : " + (operand1 - operand2));
                break;
            case 3:
                System.out.println(operand1 + " * " + operand2 + " : " + (operand1 * operand2));
                break;
            case 4:
                System.out.println(operand1 + " / " + operand2 + " : " + (operand1 / operand2));
        }
    }
}
