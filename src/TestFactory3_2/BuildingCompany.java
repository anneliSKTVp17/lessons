/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3_2;

import TestFactory2.Employee;
import java.util.ArrayList;
import java.util.List;
public class BuildingCompany extends Company
{
    @Override
    List GetEmployees()
    {
        List lst = new ArrayList();
        for (int i = 0; i < 10; i++) 
        {
            lst.add( new Builder() );
        }
        lst.add( new Electrician() );
        lst.add( new Foreman() );
        lst.add( new Manager() );
        
        return lst;
        
    }
}
