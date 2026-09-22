/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity10;

import java.util.Scanner;
public class activity10 {
    public static void main(String[] args){
        //Create a program that will let you enter your age and check if adult or minor
        
        Scanner sc = new Scanner(System.in);
        SubClassAge objAct10 = new SubClassAge(); //object for SubClassAge
        
        int age = 0;
        boolean isValid = true;
        
        while(isValid){
            System.out.print("Enter age: ");
            age = sc.nextInt();
            
            if(age < 0 || age > 120){
                System.out.println("Invalid age, please input again.");
            }else{
                objAct10.setAge(age); //Method call, objAct10 is object, .setAge(age)is the method call, (age) is the Actual Parameter
                objAct10.checker();
                isValid = false;
            }
        } 
    }
    
}
