/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity10;

//Encapsulation - Hiding sensitive data.
//private instance variable, public getter and setter

public class SubClassAge {
    private int age = 0; //instance variable
    
    //setter method
    public void setAge(int age){ //(int age) - Formal Parameter
        this.age = age; //this.age is instance, = age is Formal Parameter
    }
    
    //getter method
    public int getAge(){
        return age;
    }
    
    public void checker(){
        if (age <= 18){
            System.out.println("MINOR");
        }else{
            System.out.println("ADULT");
        }
    }
    
}
