/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity7;

import java.util.Scanner;
public class Activity7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char letter = ' ';
        System.out.print("Enter letter: ");
        letter = sc.next().charAt(0); //sero for first letter
        
        switch(letter){
            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println("Letter " + letter + " is a vowel.");
                break;
            default:
                System.out.println("Letter " + letter + " is a consonant.");        
        }
    }
    
}
