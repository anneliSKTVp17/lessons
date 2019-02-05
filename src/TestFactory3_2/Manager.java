package TestFactory3_2;

public class Manager implements Employee
{
    @Override
    public void DoWork() {
        System.out.println( "Manager DoWork" );
    }
}