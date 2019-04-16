package com.cput.ac.za.domain;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Rental implements Serializable
{
    private int rentalNumber;
    private String dateRented;
    private String dateReturned;
    private int custNumber;
    private int dvdNumber;
    private double totalPenaltyCost;
    private static final double PENALTY_COST_PER_DAY = 5;

    Penalty penalty = new Penalty();

    public Rental()
    {
    }

    private Rental (Builder builder)
    {
        this.rentalNumber = builder.rentalNumber;
        this.dateRented = builder.dateRented;
        this.dateReturned = builder.dateReturned;
        this.custNumber = builder.custNumber;
        this.dvdNumber = builder.dvdNumber;
    }

    //Get Methods
    public int getDvdNumber()
    {
        return this.dvdNumber;
    }
    public int getCustNumber()
    {
        return this.custNumber;
    }
    public int getRentalNumber()
    {
        return this.rentalNumber;
    }
    public String getDateRented()
    {
        return this.dateRented;
    }
    public String getDateReturned()
    {
        return this.dateReturned;
    }

    //Working out Penalty
    public double getTotalPenaltyCost()
    {
        return totalPenaltyCost;
    }

    //
    public void determineTotalPenaltyCost()
    {
        totalPenaltyCost = penalty.numberOfDaysOverdue() * PENALTY_COST_PER_DAY;

    }

    //Builder Class
    public static class Builder
    {

        private int rentalNumber, custNumber, dvdNumber;
        private String dateRented, dateReturned;
        //private Set<Course> courses;

        public Builder rentalNumber( int rentalNumber)
        {
            this.rentalNumber = rentalNumber;
            return this;
        }

        public Builder custNumber( int custNumber)
        {
            this.custNumber = custNumber;
            return this;
        }

        public Builder dvdNumber( int dvdNumber)
        {
            this.dvdNumber = dvdNumber;
            return this;
        }

        public Builder dateRented( String dateRented)
        {
            this.dateRented = dateRented;
            return this;
        }

        public Builder dateReturned( String dateReturned)
        {
            this.dateReturned = dateReturned;
            return this;
        }

        public Rental build()
        {
            return new Rental(this);
        }

    }

    //Creating Rental Object
    public Object[] toObjectArray()
    {
        return new Object[]{rentalNumber, dateRented, dateReturned, custNumber, dvdNumber, totalPenaltyCost};
    }

    //toString Method
    public String toString()
    {
        return "Rental#:" + rentalNumber + "  Date Rented:" + dateRented + "   Date Returned:" + dateReturned + "\nPenalty cost per day:R" + PENALTY_COST_PER_DAY + "  Total Penalty Cost:R" +
                totalPenaltyCost + "  Customer#:" + custNumber + "  Movie#:" + dvdNumber +"\nNo of Days overdue:" + penalty.numberOfDaysOverdue()+"\n";
    }
}