package com.company;

import com.company.Employees;

public class MonthlyEmployees extends Employees {

    void monthlyEmployee(){
        int grossSalary;
        float deduction;

        System.out.println("======= Please Enter Gross Salary ======");
        grossSalary = get.nextInt();
        deduction = (grossSalary*30)/100;
        super.netSalary = grossSalary - deduction;

        System.out.println("======== The Net Salary For The Monthly Employee is: =======");
        System.out.println(super.netSalary);

    }

}




