/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user2
 */
public class TestSpeed0 
{
//    System.out.println("We are in block 1");  
    static {
    System.out.println("We are in Static block 1");
    }
    public TestSpeed0()
    {
        System.out.println("Constructor has workad");
    }
//    {
//    System.out.println("We are in last blick 2");
//    }
    public static void main(String[] args) 
    {
      TestSpeed0 test = new TestSpeed0();
      TestSpeed0 test2 = new TestSpeed0();
    }
}
