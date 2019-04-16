package com.cput.ac.za.domain.humans;

import com.cput.ac.za.domain.Rental;

import java.io.*;

public class Customer implements Serializable, HumanName
{
    private int custNumber;
    private String firstName;
    private String surname;
    private String phoneNum;
    private String membership;
    private double credit;
    private boolean canRent;


    public Customer()
    {
    }

    //Bulder
    private Customer (Builder builder)
    {
        this.custNumber = builder.custNumber;
        this.firstName = builder.firstName;
        this.surname = builder.surname;
        this.phoneNum = builder.phoneNum;
        this.membership = builder.membership;
        this.credit = builder.credit;
        this.canRent = builder.canRent;

    }

    //Builder Class

    public static class Builder
    {
        private int custNumber;
        private String firstName, surname, phoneNum, membership;
        private double credit;
        private boolean canRent;

        public Builder custNumber(int custNumber)
        {
            this.custNumber = custNumber;
            return this;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder phoneNum(String phoneNum)
        {
            this.phoneNum = phoneNum;
            return this;
        }

        public Builder membership(String membership)
        {
            this.membership = membership;
            return this;
        }

        public Builder credit(double credit)
        {
            this.credit = credit;
            return this;
        }

        public Builder canRent(boolean canRent)
        {
            this.canRent = canRent;
            return this;
        }

        public Customer build()
        {
            return new Customer(this);
        }

    }

    //Get Methods
    public int getCustNumber()  {
        return custNumber;
    }

    public boolean canRent()  {
        return canRent;
    }

    @Override
    public String getName()
    {
        return firstName;
    }

    @Override
    public String getSurname()
    {
        return surname;
    }

    public String getPhoneNum()
    {
        return phoneNum;
    }

    public String getMembership() { return membership;}

    public double getCredit()
    {
        return credit;
    }

    public Object[] toObjectArray()
    {
        return new Object[]{custNumber, firstName, surname, phoneNum, membership, credit, canRent};
    }

    public String toComboBoxItem()
    {
        return custNumber + " - " + firstName;
    }

    //this method can be edited to format strings differently
    @Override
    public String toString()
    {
        return custNumber + " - " + firstName;
    }

}
