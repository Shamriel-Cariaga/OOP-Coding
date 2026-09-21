/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity9;

import java.util.Scanner;

public class Activity9 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int num = 1;
        
        do{
            System.out.println("Enter a number: ");
            num = sc.nextInt(0);
            if(num == 0){
                System.out.println("Goodbye!");
                break;
            }
            if(num%2==0){
                System.out.println("The number " + num + " is EVEN.");
            }else{
                System.out.println("The number " + num + " is odd.");
            }
            if(num < 0){
                System.out.println("The number " + num + " is NEGATIVE.");
            }else{
                System.out.println("The number " + num + " is POSITIVE.");
            }     
        }while(num != 0);  
    }
    
}
