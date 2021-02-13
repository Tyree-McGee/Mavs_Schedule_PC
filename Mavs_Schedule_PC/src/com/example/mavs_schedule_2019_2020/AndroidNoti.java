package com.example.mavs_schedule_2019_2020;

import java.util.TimerTask;

public class AndroidNoti extends TimerTask {
    private int i;
    public AndroidNoti(int i){this.i = i;}

    @Override
    public void run() {
        if(gup.stop()) {
            System.out.println("At " + Timelist.fetchTimes(i) + " we play the " + OpponentList.fetchOpponents(i));
        }
    }

    public static class gup extends ThreadDeath{
        public static boolean stop() {
            return true;
        }
    }
}
