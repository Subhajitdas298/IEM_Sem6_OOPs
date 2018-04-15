package assignment6;

import java.util.Scanner;

public class Q3FiboPattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int rows = input.nextInt();

        int no1 = 0, no2 = 1;
        /*
        int spaceLength = (rows + (rows - 1) * 3) / 2;

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= spaceLength; j++) 
                System.out.print(" ");
            spaceLength -= 2;

            for (int j = 0; j <= i; j++) {
                System.out.print(no1 + "   ");
                int temp = no2;
                no2 = no1 + no2;
                no1 = temp;
            }
            System.out.println();
         */

        String[] lines = new String[rows];

        for (int i = 0; i < rows; i++) {
            lines[i] = "";
            for (int j = 0; j <= i; j++) {
                lines[i] += no1 + "   ";
                int temp = no2;
                no2 = no1 + no2;
                no1 = temp;
            }
            lines[i] = lines[i].trim();
        }

        int len = lines[rows - 1].length();

        for (int i = 0; i < rows - 1; i++) {
            int thisLen = lines[i].length();
            for (int j = 1; j <= (len - thisLen) / 2; j++) {
                lines[i] = " " + lines[i];
            }
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
