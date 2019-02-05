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
public class Main {
    public static void main(String[] args) {
        CleaningCompany company = new CleaningCompany();
        Employee[] computerWorkers = company.getEmployees();
        company.startWorking(computerWorkers);
    }
}
