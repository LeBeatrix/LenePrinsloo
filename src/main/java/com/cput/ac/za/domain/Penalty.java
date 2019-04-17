package com.cput.ac.za.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Penalty extends Rental
{
    public static final double PENALTY_COST_PER_DAY = 5;
    private double totalPenaltyCost;


    private int dateDifference(String dateRented, String dateReturned)
    {
        int yyyy, mm, dd;
        StringTokenizer token;

        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        token = new StringTokenizer(dateRented, "/");
        yyyy = Integer.parseInt(token.nextToken());
        mm = Integer.parseInt(token.nextToken());
        dd = Integer.parseInt(token.nextToken());
        cal1.set(yyyy, mm, dd);

        if (!dateReturned.equalsIgnoreCase("NA"))
        {
            token = new StringTokenizer(dateReturned, "/");
            yyyy = Integer.parseInt(token.nextToken());
            mm = Integer.parseInt(token.nextToken());
            dd = Integer.parseInt(token.nextToken());
            cal2.set(yyyy, mm, dd);
            return (daysBetween(cal1.getTime(),cal2.getTime()));
        }
        else
            return (0);
    }

    private int daysBetween(Date d1, Date d2)
    {
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)+1);
    }

    public int numberOfDaysOverdue()
    {
        int days = dateDifference(super.getDateRented(), super.getDateReturned())-2;
        if (days < 0)
            return 0;
        else
            return days;
    }

}
