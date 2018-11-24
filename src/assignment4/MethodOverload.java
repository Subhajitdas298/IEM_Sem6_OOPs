package assignment4;

import java.util.Scanner;

public class MethodOverload {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SampleClass obj = new SampleClass();

        System.out.print("Enter two ints to add : ");
        obj.addition(input.nextInt(), input.nextInt());

        System.out.print("Enter two double to add : ");
        obj.addition(input.nextDouble(), input.nextDouble());

        System.out.print("Enter two ints to subtract : ");
        obj.subtraction(input.nextInt(), input.nextInt());

        System.out.print("Enter two doubles to subtract : ");
        obj.subtraction(input.nextDouble(), input.nextDouble());

        System.out.println();
        obj.someMethod();

        System.out.print("Enter an int : ");
        obj.someMethod(input.nextInt());
    }

}

class SampleClass {
    public void addition(int a, int b) {
        System.out.println("Int addition : " + (a + b));
    }

    public void addition(double a, double b) {
        System.out.println("Double addition : " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Int subtraction : " + (a - b));
    }

    public void subtraction(double a, double b) {
        System.out.println("Double subtraction : " + (a - b));
    }

    public void someMethod() {
        System.out.println("Zero parameter method");
    }

    public void someMethod(int a) {
        System.out.println("1 parameter method. a = " + a);
    }
}