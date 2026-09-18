/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity8;

/**
 *
 * @author User
 */
public class Activity8 {
    public static void main(String[] args){
        
       //for loop
        System.out.println("FOR LOOP");
        for (int num = 1; num <= 5; num++) {
            System.out.println("The number is " + num); 
        }
        
        //while loop
        System.out.println("\nWHILE LOOP");
        int num1 = 1;
        while(num1 <= 3){
            System.out.println("The number is " + num1);
            num1++;
        }
        
        //do-while loop
        System.out.println("\nDO-WHILE LOOP");
        int num2 = 1;
        do{
            System.out.println("The number is " + num2);
            num2++;
        }while(num2 <= 3);
    }
    
}
