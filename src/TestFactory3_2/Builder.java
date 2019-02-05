/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFactory3_2;

public class Builder implements Employee
{
    public static int NewID=0;
    int ID;
    public Builder(){ ID=Builder.NewID++; }
    @Override
    public void DoWork() {
        System.out.println( "Builder_"+ID+" DoWork" );
    }
}
