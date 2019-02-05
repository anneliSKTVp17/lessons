/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3;

/**
 *
 * @author user2
 */
public class GameDevCompany extends Company {   
      @Override
      Employee[] getEmployees() {
        System.out.println("");
        System.out.println("Starting company activity" +GameDevCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[3];
        employee[0] = new Designer();
        employee[1] = new Programmer();
        employee[2] = new Tester();
        return employee;
      }
}
