package com.cput.ac.za.domain.humans;

public class AddCustomer
{

    private int custNumber;
    private String firstName, surname, phoneNumber, membership;

    //Default Constructor

    //Builder
    private AddCustomer (Builder builder)
    {
        this.custNumber = builder.custNumber;
        this.firstName = builder.firstName;
        this.surname = builder.surname;
        this.phoneNumber = builder.phoneNumber;
        this.membership = builder.membership;
    }
    //Builder Class
    public static class Builder
    {
        private int custNumber;
        private String firstName, surname, phoneNumber, membership;

        public Builder custNumber( int custNumber)
        {
            this.custNumber = custNumber;
            return this;
        }

        public Builder firstName( String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder surname( String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder phoneNumber( String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder membership( String membership)
        {
            this.membership = membership;
            return this;
        }

        public AddCustomer build()
        {
            return new AddCustomer(this);
        }

    }
//Get Methods

    //Object Array

    //ToString
}
