package com.javier.rodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Department salesDepartment = new SalesDep(1, "Sales department");
        Department financialDepartment = new FinancialDep(2, "Financial department");

        HeadDep headDepartment = new HeadDep(3, "Head department");

        headDepartment.addDepartMent(salesDepartment);
        headDepartment.addDepartMent(financialDepartment);

        headDepartment.printDepartmentName();

    }
}
