package com.cput.ac.za.factory;

import com.cput.ac.za.domain.movie.Dvd;

public class DvdFactory
{
    public static Dvd getRental(int dvdNumber, String title, String category, double price, boolean newRelease, boolean availableToRent)
    {
        return new Dvd.Builder().dvdNumber(dvdNumber)
                .title(title)
                .category(category)
                .price(price)
                .newRealese(newRelease)
                .availableForRent(availableToRent)
                .build();

    }
}
