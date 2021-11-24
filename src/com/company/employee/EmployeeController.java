package com.company.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeController {

    public static void main(String args[]) {

        Employee e1=new Employee("Raj",empNum(),"12/06/1999","bengaluru", Designation.SYSTEM_ENGINEER,hashMap("Robosoft"));
        Employee e2=new Employee("Adam",empNum(),"19/08/1999","bengaluru",Designation.TRAINEE,hashMap("Infosys"));
        Employee e3=new Employee("Seema",empNum(),"12/07/1966","Udupi",Designation.PROJECT_LEADER,hashMap("MindTree"));
        Employee e4=new Employee("Ameer",empNum(),"23/06/1976","Manglore",Designation.SYSTEM_ENGINEER,hashMap("Robosoft"));
        Employee e5=new Employee("Sheeba",empNum(),"23/07/1997","bengaluru",Designation.SYSTEM_ENGINEER,hashMap("MindTree"));
        EmployeeService es=new EmployeeService();
        es.register(e1);
        es.register(e2);
        es.register(e3);
        es.register(e4);
        es.register(e5);
        System.out.println("com.company.Employee list before sorting");


        Employee e6=createObject("Rabindranath","18/09/1999","Chikmagaluru",Designation.PROJECT_LEADER,3);

        Employee e7=createObject("Bharath","28/09/1996","Chitradurga",Designation.TRAINEE,1);

        Employee e8=createObject("Shabnum","28/12/1996","hasan",Designation.TRAINEE,1);

        Employee e9=createObject("Raavi","18/09/1989","Bengaluru",Designation.SYSTEM_ENGINEER,2);

        Employee e10=createObject("Bhavesh","28/09/1996","Tumkur",Designation.SYSTEM_ENGINEER,3);

        es.register(e6,e7,e8,e9,e10);


        es.display();

        es.update(22);

        es.remove(12);

        es.displayAfterSorting();


        List<Employee> employeesName =es.employees.stream()
                .filter(str->str.getEmployeeName().length()<6)
                .collect(Collectors.toList());
        System.out.println("______________________________________________________________\nEmployee names whose length is less than 6");
        employeesName.forEach(e->System.out.println(e.getEmployeeName()));



    }
    private static int empNum(){
        int min=1000, max=1999;
        int num = (int)Math.floor(Math.random()*(max-min+1)+min);
        return num;
    }
    private static int hashMap(String company){
        HashMap<String,Integer> org=new HashMap<String,Integer>();
        org.put("Robosoft",1);
        org.put("Infosys",2);
        org.put("MindTree",3);
        return org.get(company);


    }
    private static Employee createObject(String name, String dob, String address, Designation desig, int org){
        Employee e=new Employee();
        e.setEmployeeName(name);
        e.setEmployeeNumber(empNum());
        e.setdob(dob);
        e.setAddress(address);
        e.setDesignation(desig);
        e.setOrganisation(org);
        return e;

    }

}
