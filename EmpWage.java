package com.bridgelabz.demo;
import java.util.Scanner;


public class EmpWage {

    private String employeeName;
    private int hours;
    private double rate, pay;

    public void setEmployeeName (String name )
    {
        employeeName = name;
    }
    public String getEmployeeName ()
    {
        return employeeName;
    }
    public double calculatePay ( int hours , int rate )
    {
        if (hours > 8) {
            int extraHours = hours - 100;
            pay = (8 * rate) + (extraHours * rate);
        } else pay = hours * 20;

        return pay;
    }
    public void displayEmployee ()
    {
        System.out.printf("Employee's name: %s", getEmployeeName());
        System.out.printf("\nGross Salary: ", +pay);
    }
}
class Employee {
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in);
        EmpWage Employee = new EmpWage();

        System.out.print( "Enter Employee %s name: " );
        String name = input.nextLine();
        Employee.setEmployeeName( name );

        System.out.print( "Enter how many hours worked: " );
        int hours = input.nextInt();

        System.out.print( "Enter hourly rate: " );
        int rate = input.nextInt();

        Employee.calculatePay( hours,rate);
        Employee.displayEmployee();



    }
}

