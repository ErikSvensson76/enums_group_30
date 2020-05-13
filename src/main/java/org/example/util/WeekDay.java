package org.example.util;

public enum WeekDay {
    MONDAY("08:00 - 17:00"),
    TUESDAY("07:00 - 18:30"),
    WEDNESDAY("08:00 - 16:00"),
    THURSDAY("07:00 - 19:00"),
    FRIDAY("08:00 - 12:00"),
    SATURDAY("Closed"),
    SUNDAY("Closed");

    private String message;

    WeekDay(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
