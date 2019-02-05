package TestFactory3_2;

import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        Company buildCompany=new BuildingCompany();
        List compWokers=buildCompany.GetEmployees();
        buildCompany.StartWorking(compWokers);
    }
}
