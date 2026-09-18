/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity6;

import java.util.Scanner;
public class Activity6 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int age = 0;
        
        System.out.print("Enter age: ");
        age = sc.nextInt();
        
        if (age >= 0 && age <= 17) {
            System.out.println("Go home and sleep!");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Let's party!");
        } else if (age >= 60 && age <= 130) {
            System.out.println("Go drink coffee!");
        } else {
            System.out.println("Invalid age.");
        }
        
    }
    
}
