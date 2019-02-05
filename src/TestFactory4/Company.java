/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory4;

import java.util.List;

/**
 *
 * @author user2
 */
public class Company {

    List getEmployees() {
        return null;
    }
    void startWorking(List<Employee> employeers) 
    {
        for (Employee employeer : employeers) 
        {
            employeer.doWork();
        }
    }
}

