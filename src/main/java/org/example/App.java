package org.example;

import org.example.util.WeekDay;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeekDay[] weekDays = WeekDay.values();
        for(WeekDay day : weekDays){
            System.out.println(day.getOpeningDuration().toHours());
        }






        System.out.println(convertFromString("monday"));
    }

    public static WeekDay convertFromString(String weekDay){
        return WeekDay.valueOf(weekDay.toUpperCase());
    }
}
