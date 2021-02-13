package com.example.mavs_schedule_2019_2020;


public class StartAlarm extends Thread{
    private static int i = 0;
    public static void go(){
        for( i = 0; i < fileInput.seasonLength; i++)
        {
            if(Timelist.fetchTimes(i).getTime() - (getTime.HOUR * 2)> System.currentTimeMillis())
            {
                Process.p(i);
            }
        }
    }

}
