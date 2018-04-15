package assignment5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st string : ");
        String s1 = input.nextLine();
        System.out.print("Enter 2nd string : ");
        String s2 = input.nextLine();
        
        System.out.println("String 1 : " + s1);
        System.out.println("String 2 : " + s2);
        
        System.out.println("Length of s1 : " + s1.length());
        System.out.println("Length of s2 : " + s2.length());
        
        System.out.println("First occurance of R in s1 is in index : " + s1.indexOf('R'));
        System.out.println("First occurance of R in s2 is in index : " + s2.indexOf('R'));
        
        System.out.println("s1 in upper case : " + s1.toUpperCase());
        System.out.println("s2 in upper case : " + s2.toUpperCase());
        
        System.out.println("s1 in lower case : " + s1.toLowerCase());
        System.out.println("s2 in lower case : " + s2.toLowerCase());
        
        System.out.println("s1 equals to s2 : " + s1.equals(s2));
        
        System.out.println("s1 equals to s2 (ignore case) : " + s1.equalsIgnoreCase(s2));
        
        System.out.println("Charecter at index 6 for s1 : " + s1.charAt(6));
        System.out.println("Charecter at index 6 for s2 : " + s2.charAt(6));
        
        System.out.println("Substring of s1 for (4,12) is : " + s1.substring(4, 12));
        System.out.println("Substring of s2 for (4,12) is : " + s2.substring(4, 12));
        
        System.out.println("Replace G with A in s1 : " + s1.replaceAll("G", "A"));
        
        System.out.print("Enter 3rd string : ");
        String s3 = input.nextLine();
        System.out.println("s3 : " + s3);
        System.out.println("s3 trimmed : " + s3.trim());
    }
}
