/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;
/**
 *
 * @author guest-IaiyiC
 */
public class Q3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String s = input.nextLine();
        
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        
    }
    
}
