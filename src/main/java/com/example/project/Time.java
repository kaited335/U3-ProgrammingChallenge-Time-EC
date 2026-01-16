package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int hr;
    private int min;
    private int sec;
    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
    public Time(int hour, int minute, int seconds) {
        hr = hour;
        min = minute;
        sec = seconds;
    }

    //GETTERS 
    public int getHour() {
        return hr;
    }

    public int getMinutes() {
        return min;
    }

    public int getSeconds() {
        return sec;
    }


    public String info(){
        String time = "";
        String hour = Integer.toString(hr);
        String minute = Integer.toString(min);
        String second = Integer.toString(sec);
        if (hr < 10) {
            time += "0" + hour;
        } else {
            time += hour;
        }
        time += ":";
        if (min < 10) {
            time += "0" + minute;
        } else {
            time += min;
        }
        time += ":";
        if (sec < 10) {
            time += "0" + second;
        } else {
            time += sec;
        }
        return time;
    }


    public void tick(){
       sec++;
       if (sec == 60) {
            min++;
            sec = 0;
            if (min == 60) {
                hr++;
                min = 0;
                if (hr == 24) {
                    hr = 0;
                }
            }
       }
    }


    public void add(Time time2){
        sec += time2.getSeconds();
        if (sec >= 60) {
            sec = sec - 60;
            min++;
        }
        min += time2.getMinutes();
        if (min >= 60) {
            min = min - 60;
            hr++;
        }
        hr += time2.getHour();
        if (hr >= 24) {
            hr = hr - 24;
        }
    }
}

