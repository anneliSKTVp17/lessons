package TestFactory3_2;


public class Foreman implements Employee
{
    @Override
    public void DoWork() {
        System.out.println( "Foreman DoWork" );
    }
}