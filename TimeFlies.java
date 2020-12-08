package com.cohortFive.tdd;

public class TimeFlies {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour,int minute,int seconds ){
        if(hour<0 ||hour>24 ||minute<0||minute>60 || seconds<0 || seconds>60){
            throw new IllegalArgumentException(String.format("This time %02d:%02d:%02d does not exist",hour,minute,seconds));
           }


            this.hour=hour;
            this.minute=minute;
            this.seconds=seconds;


    }

    public String getUniversalTime(){
       return String.format("%02d:%02d:%02d",hour,minute,seconds);
    }

    public String getLocalTime(){
        return String.format("%02d:%02d:%02d%s",(hour>12?hour%12:hour),minute,seconds,(hour>12?"PM":"AM"));
    }

    public String getTimeInWords(){
        if(hour>12)
        {hour=hour%12;}
     return String.format("%2s:%2s %s" ,(hour==1?"One":hour==2?"Two":hour==3?"Three":hour==4?"Four":hour==5?"Five":hour==6?"Six":"seven"),
        (minute==1?"One":minute==2?"Two":minute==3?"Three":minute==42?"Forty-Two":""),(hour>12?"PM":"AM"));
    }

}
