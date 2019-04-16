package com.cput.ac.za.domain.movie;

import java.io.Serializable;

public class Dvd implements Serializable
{
    private int dvdNumber;
    private String title;
    private String category;
    private double price;
    private boolean newRelease;
    private boolean availableForRent;

    //empty constructor
    public Dvd()
    {

    }

    //Builder
    private Dvd (Builder builder)
    {
        this.dvdNumber = builder.dvdNumber;
        this.title = builder.title;
        this.category = builder.category;
        this.price = builder.price;
        this.newRelease = builder.newRealese;
        this.availableForRent = builder.availableForRent;
    }

    //Builder Class
    public static class Builder
    {
        private int dvdNumber;
        private String title, category;
        private double price;
        private boolean newRealese, availableForRent;

        public Builder dvdNumber( int dvdNumber)
        {
            this.dvdNumber = dvdNumber;
            return this;
        }

        public Builder title( String title)
        {
            this.title = title;
            return this;
        }

        public Builder category( String category)
        {
            this.category = category;
            return this;
        }

        public Builder price( double price)
        {
            this.price = price;
            return this;
        }

        public Builder newRealese( boolean newRealese)
        {
            this.newRealese = newRealese;
            return this;
        }

        public Builder availableForRent( boolean availableForRent)
        {
            this.availableForRent = availableForRent;
            return this;
        }

        public Dvd build()
        {
            return new Dvd(this);
        }

    }

    //get methods
    public int getDvdNumber()
    {
        return dvdNumber;
    }
    public String getTitle()
    {
        return title;
    }
    public String getCategory()
    {
        return category;
    }
    public double getPrice()
    {
        return price;
    }

    //checks if the movie is a new release
    public boolean isNewRelease()
    {
        return newRelease;
    }

    public Object[] toObjectArray()
    {
        return new Object[]{dvdNumber, title, category, price, newRelease, availableForRent};
    }

    //overrides the object method
    @Override
    public String toString()
    {
        return String.format("Dvd number: %-8dTitle: %-30sCategory:%-12sPrice:R%.2f\nNew Release:%b\tAvailable:%b\n", dvdNumber, title,category,price,newRelease,availableForRent);
    }

}
