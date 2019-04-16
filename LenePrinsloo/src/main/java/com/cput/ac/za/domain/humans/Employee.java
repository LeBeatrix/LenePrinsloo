package com.cput.ac.za.domain.humans;

public class Employee implements HumanName
{
    private int empNumber;
    private String firstName;
    private String surname;

    //Default Constructor
    public Employee()
    {

    }

    //Builder

    //Builder Class


    //Get Methods
    public int getEmpNumber() {
        return empNumber;
    }

    @Override
    public String getName() {
        return firstName;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    //Object Array

    //ToString
}
