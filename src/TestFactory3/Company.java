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
public abstract class Company {
    Employee[] getEmployees() {
        return null;
    }
    void startWorking(Employee[] employeers) {
        for (Employee employeer : employeers) {
            employeer.doWork();
        }
    }
}
