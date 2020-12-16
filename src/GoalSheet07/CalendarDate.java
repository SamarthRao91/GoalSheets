package GoalSheet07;




public class CalendarDate implements Comparable < CalendarDate > {
    private int month;
    private int day;
    private int year;

    public CalendarDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int compareTo(CalendarDate other) {
        if (year != other.year)
        {
            return year - other.year;
        }
        else if (month != other.month)
        {
            return month - other.month;
        }
        else
            {
            return day - other.day;
            }
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}