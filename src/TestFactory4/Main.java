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

    public class Main {
    public static void main(String[] args) {
       Company cleancompany = new CleaningCompany();
       List workers = cleancompany.getEmployees();
      cleancompany.startWorking(workers);
    }
}


