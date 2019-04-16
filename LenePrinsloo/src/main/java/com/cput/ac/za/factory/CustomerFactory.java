package com.cput.ac.za.factory;

import com.cput.ac.za.domain.humans.Customer;

public class CustomerFactory
{
    public static Customer getCustomer(int custNumber, String firstName, String surname, String phoneNum, String membership, double credit, boolean canRent)
    {
        return new Customer.Builder().custNumber(custNumber)
                .firstName(firstName)
                .surname(surname)
                .phoneNum(phoneNum)
                .membership(membership)
                .credit(credit)
                .canRent(canRent)
                .build();

    }
}
