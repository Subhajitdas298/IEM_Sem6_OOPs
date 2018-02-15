package assignment1;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        int operand1 = 0, operand2 = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Operations :- ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int option = 0;
            while (option < 1 || option > 5) {
                System.out.print("Enter option : ");
                option = input.nextInt();
                if (option == 5) System.exit(0);
                if (option < 1 || option > 5) {
                    System.out.println("Invalid option");
                }
            }

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
                    if (operand2 != 0) {
                        System.out.println(operand1 + " / " + operand2 + " : " + (operand1 / operand2));
                    } else {
                        System.out.println("Can not divide by zero");
                    }
                    break;                    
            }
            System.out.println();
        }
    }
}
