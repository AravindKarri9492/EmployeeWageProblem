package com.bridgelabz;

public class EmployeeWage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Employee Wage Computation Program");
        int IS_EMP_PRESENT = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_EMP_PRESENT)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
