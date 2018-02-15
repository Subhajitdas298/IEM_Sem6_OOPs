package assignment2;

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
        
        MathOperation mop = new MathOperation(operand1, operand2);

        switch (option) {
            case 1:
                System.out.println(operand1 + " + " + operand2 + " : " + (mop.add()));
                break;
            case 2:
                System.out.println(operand1 + " - " + operand2 + " : " + (mop.subtract()));
                break;
            case 3:
                System.out.println(operand1 + " * " + operand2 + " : " + (mop.multiply()));
                break;
            case 4:
                System.out.println(operand1 + " / " + operand2 + " : " + (mop.divide()));
        }
    }
}

class MathOperation{
    int operand1, operand2;

    public MathOperation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    
    public int add(){
        return operand1 + operand2;
    }
    
    public int subtract(){
        return operand1 - operand2;
    }
    
    public int multiply(){
        return operand1 * operand2;
    }
    
    public int divide(){
        return operand1 / operand2;
    }
}