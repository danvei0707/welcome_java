package com.campusdual.statics;

import java.util.Calendar;
import java.util.Date;

public class StaticMethod {

    // String, ya que pretendemos devolver un mensaje
    public static String countDownToYear(String name, int year){
        Date today = new Date();
        System.out.println(today);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JANUARY, 1, 0, 0, 0);
        Date targetDate = calendar.getTime();
        long miliseconds = targetDate.getTime() - today.getTime();
        long days = miliseconds / (1000 * 60 * 60 * 24);

        if (days > 0){
            return "hi " + name + "!, countdown to " + year + ": " + days + " days.";
        } else {
            return "hi " + name + "!, countdown to " + year + ": " + Math.abs(days) + " days.";
        }
    }
}
