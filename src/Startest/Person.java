/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startest;

/**
 *
 * @author user2
 */
public class Person {
    private final String name;
    private final String LastName;
    
    public Person(String name, String lastName) {
        this.name = name;
        this.LastName = lastName;
        
    }

   @Override
    public String toString() {
        return "Person{" + "name= " + name + ", LastName= " + LastName + '}';
    }
    
    void sayHello() {
        System.out.println("Hello from " + name + " " + LastName);
    }

    void sayBye() {
    System.out.println(name + " " + LastName + " Bye!");
}
} 



