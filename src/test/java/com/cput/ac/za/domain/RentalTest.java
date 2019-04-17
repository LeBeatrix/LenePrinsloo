package com.cput.ac.za.domain;

import com.cput.ac.za.domain.Rental;
import com.cput.ac.za.factory.RentalFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest
{

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRental()
    {
        int rentalNumber = 0000;
        String dateRented = "20190415";
        int custNumber = 0001;
        int dvdNumber = 0002;

        Rental rental = RentalFactory.getRental(rentalNumber, dateRented, custNumber, dvdNumber);

        System.out.println(rental);

        Assert.assertNotNull(rental.getRentalNumber());

    }
}