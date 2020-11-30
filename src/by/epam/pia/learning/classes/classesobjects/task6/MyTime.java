package by.epam.pia.learning.classes.classesobjects.task6;

public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour) {
        this(hour, 0);
    }

    public MyTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    public MyTime(int hour, int minute, int second) {

        if (hour < 0 || hour > 23) hour = 0;
        this.hour = hour;

        if (minute < 0 || minute > 59) minute = 0;
        this.minute = minute;

        if (second < 0 || second > 59) second = 0;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) hour = 0;
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) minute = 0;
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) second = 0;
        this.second = second;
    }

    public void increaseHours(int hours) {
        hour = (hour + hours) % 24;
    }

    public void decreaseHours(int hours) {
        hour = hour - hours;
        if (hour < 0) hour = 0;
    }

    public void increaseMinutes(int minutes) {
        int tmp = minute + minutes;
        if (tmp > 59) {
            minute = (tmp) % 60;
            increaseHours(tmp / 60);
        } else {
            minute += minutes;
        }
    }

    public void decreaseMinutes(int minutes) {
        int tmp = minute - minutes;
        if (tmp < 0) {
            tmp %= 60;
            if (tmp == 0) {
                minute = 0;
            } else {
                minute = 60 + (tmp % 60);
            }
            decreaseHours(minutes / 60);
        } else {
            minute -= minutes;
        }
    }

    public void increaseSeconds(int seconds) {
        int tmp = second + seconds;
        if (tmp > 59) {
            second = (tmp) % 60;
            increaseMinutes(tmp / 60);
        } else {
            second += seconds;
        }
    }

    public void decreaseSeconds(int seconds) {
        int tmp = second - seconds;
        if (tmp < 0) {
            tmp %= 60;
            if (tmp == 0) {
                second = 0;
            } else {
                second = 60 + (tmp % 60);
            }
            decreaseMinutes(seconds / 60);
        } else {
            second -= seconds;
        }
    }

    @Override
    public String toString() {
        return "Time is " + hour + ":" + minute + ":" + (second < 10 ? "0" + second : second);
    }
}
