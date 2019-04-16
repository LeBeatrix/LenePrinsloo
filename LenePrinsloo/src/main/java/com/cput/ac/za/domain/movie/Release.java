package com.cput.ac.za.domain.movie;

public class Release extends Dvd
{
    private double price;
    private boolean newRelease;
    
    public void setRelease(boolean sRelease)
    {
        newRelease = sRelease;
        setPrice();//sets the price based on whether movie is new release or not
    }

    private void setPrice()
    {
        if(super.isNewRelease())
             price = 15;
        else
            price = 10;
    }
}
