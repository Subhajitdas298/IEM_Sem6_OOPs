package assignment2;

import java.util.Scanner;

public class SimpleCalculatorObject {

    public static void main(String[] args) {
        int operand1 = 0, operand2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        operand1 = input.nextInt();
        System.out.print("Enter Number 2 : ");
        operand2 = input.nextInt();

        MathOperation mop = new MathOperation(operand1, operand2);

        System.out.println(operand1 + " + " + operand2 + " : " + (mop.add()));
        System.out.println(operand1 + " - " + operand2 + " : " + (mop.subtract()));
        System.out.println(operand1 + " * " + operand2 + " : " + (mop.multiply()));
        System.out.println(operand1 + " / " + operand2 + " : " + (mop.divide()));
    }
}

class MathOperation {

    int operand1, operand2;

    public MathOperation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int add() {
        return operand1 + operand2;
    }

    public int subtract() {
        return operand1 - operand2;
    }

    public int multiply() {
        return operand1 * operand2;
    }

    public int divide() {
        return operand1 / operand2;
    }
}
