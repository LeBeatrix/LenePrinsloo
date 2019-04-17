package com.cput.ac.za.factory;

import com.cput.ac.za.domain.humans.AddCustomer;

public class AddCustomerFactory
{
    public static AddCustomer getAddCustomer(int custNumber, String firstName, String surname, String phoneNumber, String membership) {
        return new AddCustomer.Builder().custNumber(custNumber)
                .firstName(firstName)
                .surname(surname)
                .phoneNumber(phoneNumber)
                .membership(membership)
                .build();

    }
}
