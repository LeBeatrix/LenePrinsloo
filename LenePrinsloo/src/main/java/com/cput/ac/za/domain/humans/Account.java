package com.cput.ac.za.domain.humans;

public class Account extends Employee
{
    private int accountId;
    private int empNumber;
    private String username;
    private String password;
    private String role;

    //Default Constructor

    //Builder
    private Account (Builder builder)
    {
        this.accountId = builder.accountId;
        this.empNumber = builder.empNumber;
        this.username = builder.username;
        this.password = builder.password;
        this.role = builder.role;
    }

    //Builder Class
    public static class Builder
    {
        private int accountId, empNumber;
        private String username, password, role;

        public Builder accountId( int accountId)
        {
            this.accountId = accountId;
            return this;
        }

        public Builder empNumber( int empNumber)
        {
            this.empNumber = empNumber;
            return this;
        }

        public Builder username( String username)
        {
            this.username = username;
            return this;
        }

        public Builder password( String password)
        {
            this.password = password;
            return this;
        }

        public Builder role( String role)
        {
            this.role = role;
            return this;
        }

        public Account build()
        {
            return new Account(this);
        }


    }
    //Get Methods

    //Object Array

    //ToString

}
