package com.example.mavs_schedule_2019_2020;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Process {
    static Timer t[] = new Timer[fileInput.seasonLength];
    public static void p(int i) {
        t[i] = new Timer();
        long twoHoursBefore = (Timelist.fetchTimes(i).getTime()) - (getTime.HOUR * 2);
        long current = System.currentTimeMillis();
        long nextGame = twoHoursBefore - current ;
        TimerTask k = new AndroidNoti(i);
        System.out.println(new Date(Timelist.fetchTimes(i).getTime()));
        t[i].schedule(k, nextGame);
    }
}
