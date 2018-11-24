package assignment7;

import java.util.Scanner;

public class Q4Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("No of rows : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("1 ");
            for (int j = n - i + 1; j <= n; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
