/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3_2;

import java.util.List;
/**
 *
 * @author User
 */
public class Company
{
    List GetEmployees(){ return null; }
    public void StartWorking(List<Employee> empls) 
    {
        for( Employee Each : empls)
        { Each.DoWork(); }
    }
}
