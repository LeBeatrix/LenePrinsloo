package com.cput.ac.za.factory;

import com.cput.ac.za.domain.Rental;

public class RentalFactory
{
    public static Rental getRental(int rentalNumber, String dateRented, int custNumber, int dvdNumber)
    {
        return new Rental.Builder().rentalNumber(rentalNumber)
                .dateRented(dateRented)
                .custNumber(custNumber)
                .dvdNumber(dvdNumber)
                .build();

    }
}
