package com.company;

public class HourlyEmployees extends Employees{





    int rate,bonus;
    int hours, extrahrs;

    void hourlyEmployee(){

        System.out.println("===== Enter the amount per hour =====");
        rate = get.nextInt();

        System.out.println("===== Enter The Number Of Hours Worked in a Week! =====");
        hours = get.nextInt();
        if (hours <= 40){
            super.netSalary =( hours*rate*25)/100;
            System.out.println("===== The Net Salary is: =====" );
            System.out.println(super.netSalary);
        }
        else{

            System.out.println("===== Enter the amount of bonus =====");
            bonus = get.nextInt();
            extrahrs = hours - 40 ; // if hours exceed 40 hours
            bonus = bonus * extrahrs;
            netSalary =(( hours*rate*25)/100)+ bonus;
            System.out.println("========== The Net Salary is: =======");
            System.out.println(super.netSalary);
        }
    }
}



