/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user2
 */
public class CleaningCompany extends Company
{
    List GetEmployees()
    {
        List lst = new ArrayList();
       for (int i = 0; i < 3; i++)
       {
           lst.add(new Cleaner());
       }
        lst.add(new Manager());
        return lst;
    }
}
