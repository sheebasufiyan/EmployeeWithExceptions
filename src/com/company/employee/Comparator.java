package com.company.employee;

import java.util.ArrayList;

public class Comparator  {
    public ArrayList<Employee>  displaySort(ArrayList<Employee> employees){

        employees.sort((o1, o2)
                -> o1.getEmployeeName().compareTo(
                o2.getEmployeeName()));

        System.out.println("_______________________________________________________");
        System.out.println("com.company.Employee list after sorting");
        return employees;
    }
}
