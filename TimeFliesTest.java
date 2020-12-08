package com.cohortFive.tdd;

public class TimeFliesTest {
    public static void main(String[] args) {
        TimeFlies time= new TimeFlies();
        displayTime(time);
        time.setTime(2,42,23);
        displayTime(time);
        try{time.setTime(14,25,25);
        } catch (IllegalArgumentException e) {
            System.out.printf("error:%s%n",e.getMessage());
        }
        time.setTime(12,22,22);
        displayTime(time);
    }
    public static void displayTime(TimeFlies time2 ){
        System.out.printf("The universal time is:%s%nAnd the local time is %s%nAnd the time in words is:%s%n",time2.getUniversalTime(), time2.getLocalTime(),time2.getTimeInWords());

    }
}
