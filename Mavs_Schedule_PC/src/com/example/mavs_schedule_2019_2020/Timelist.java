package com.example.mavs_schedule_2019_2020;

import java.util.ArrayList;
import java.util.Date;

public class Timelist {
    private static ArrayList <Date> gameTimes = new ArrayList<Date> ();
    public static void add(Date d)
    {
        gameTimes.add(d);
    }
    public static void print()
    {
        for(Date time: gameTimes)
        {
            System.out.println(time);
        }
    }
    public static Date fetchTimes(int i){
        return gameTimes.get(i);
    }
}
