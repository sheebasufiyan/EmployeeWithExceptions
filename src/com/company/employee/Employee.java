package com.company.employee;

public class Employee {
    private String employeeName;
    private int employeeNumber;
    private String dob;
    private String address;
    private Designation designation;
    private int organisation;
    Employee(){

    }

    Employee(String name, int number, String dob, String address, Designation designation, int Organization) {
        this.employeeName = name;
        this.employeeNumber = number;
        this.dob = dob;
        this.address = address;
        this.designation = designation;
        this.organisation = Organization;

    }
    public void setEmployeeName(String name){
        employeeName=name;
    }

    public void setEmployeeNumber(int num){
        employeeNumber=num;
    }
    public void setdob(String dob){
        this.dob=dob;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setDesignation(Designation desig){
        designation=desig;
    }
    public void  setOrganisation(int org){
        organisation=org;
    }


    public String getEmployeeName(){
        return employeeName;
    }
    public int getEmployeeNumber(){
        return employeeNumber;
    }
    public String getDob(){
        return dob;
    }
    public String getAddress(){
        return address;
    }
    public Designation getDesignation(){
        return designation;
    }
    public int getOrganisation(){
        return organisation;
    }
    public String toString(){
        return "\n" + employeeName+ "," + employeeNumber + " , "+dob+" , "+address+" , "+designation+" , "+organisation;
    }


}

