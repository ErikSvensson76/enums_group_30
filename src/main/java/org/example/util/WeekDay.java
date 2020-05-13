package org.example.util;

import java.time.LocalTime;

public enum WeekDay {
    MONDAY(LocalTime.parse("08:00"), LocalTime.parse("17:00")),
    TUESDAY(LocalTime.parse("08:00"), LocalTime.parse("17:00")),
    WEDNESDAY(LocalTime.parse("07:00"), LocalTime.parse("19:00")),
    THURSDAY(LocalTime.parse("08:00"), LocalTime.parse("17:00")),
    FRIDAY(LocalTime.parse("08:00"), LocalTime.parse("12:00")),
    SATURDAY(null, null){
        @Override
        public String getDayInfo() {
            return "We are closed";
        }
    },
    SUNDAY(null, null){
        @Override
        public String getDayInfo() {
            return "We are closed";
        }
    };

    LocalTime start;
    LocalTime end;

    WeekDay(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public String getDayInfo(){
        String message = this.name() + ": opens at " + start+ " and closes at " + end;
        return message;
    }
}
