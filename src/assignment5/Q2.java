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
public class Q2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no of rows : ");
        int row = input.nextInt();
        
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= 1 + (i-1) * 2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
