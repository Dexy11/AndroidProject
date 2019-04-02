package com.company;
import java.util.Scanner;


public class Employees {
    Scanner get = new Scanner(System.in);
    String empName;
    static int empCategory;
    float netSalary;

    void employee(){
        System.out.println("====== Enter the Name of the Employee =====");
        empName = get.nextLine();
        System.out.println("====== please Choose Category of the Employee From The List =====");
        System.out.println("------------------------------------------------------------------");

        System.out.println("===== Enter 1 for hourly Employees: ======");
        System.out.println("===== Enter 2 for monthly Employees: =====");
        empCategory = get.nextInt();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employees obj1 =new Employees();
        obj1.employee();

        if (empCategory == 1){

            HourlyEmployees obj = new HourlyEmployees();
            obj.hourlyEmployee();

        }
        else if (empCategory == 2){
            MonthlyEmployees obj2 = new MonthlyEmployees();
            obj2.monthlyEmployee();

        }

        else{
            System.out.println("Invalid Category, Please Choose The Correct Number.");
        }

    }
}


