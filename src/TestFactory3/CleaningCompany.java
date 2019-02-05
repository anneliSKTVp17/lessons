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
public class CleaningCompany extends Company {   
      @Override
      Employee[] getEmployees() {
        System.out.println("");
        System.out.println("Starting company activity" +CleaningCompany.class.getSimpleName() + "\n");
        Employee[] employee = new Employee[3];
        employee[0] = new Manager();
        employee[1] = new Cleaner();
        employee[2] = new Cleaner();
        employee[2] = new Cleaner();
        return employee;
      }
}
