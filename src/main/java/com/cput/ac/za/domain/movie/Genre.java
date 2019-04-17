package com.cput.ac.za.domain.movie;

public class Genre extends Dvd
{
    private String category;

    public void setCategory(int sCategory)
    {
        switch(sCategory)
        {
            case 1:
                category = "Horror";
                break;
            case 2:
                category = "Sci-fi";
                break;
            case 3:
                category = "Drama";
                break;
            case 4:
                category = "Romance";
                break;
            case 5:
                category = "Comedy";
                break;
            case 6:
                category = "Action";
                break;
            case 7:
                category = "Cartoon";
                break;
        }
    }
}
