import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * MyDate is a Java Class to store date information.
 * It utilizes java.util.GregorianCalendar for ease
 * Class has three constructors:
 * myDate(), myDate(int year, int month, int day), myDate(long elapsedTime)
 * </p>
 * @author Isaac Warren
 */

public class MyDate {
    // private fields used by MyDate
    private int year;
    private int month;
    private int day;

    /**
     * Contructs a MyDate object using the current date from GregorianCalendar
     */
    MyDate(){
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);

    }

    /**
     * Contructs a MyDate object using the parameter elapsedTime
     * @param elapsedTime A long number representing elapsed time in ms since Jan 1, 1970
     */
    MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Constructs a myDate Object using the parameters year, month, day
     * @param year An integer representing the year
     * @param month An integer representing the month (Uses Jan = 0)
     * @param day   An integer representing the day of the month
     */
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Returns year
     * @return Integer representing the year
     */
    public int getYear(){
        return year;
    }

    /**
     * Returns month
     * @return Integer representing the month (Jan = 0)
     */
    public int getMonth() {
        return month;
    }

    /**
     * Returns day
     * @return Integer representing day of month
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets year
     * @param year Integer representing year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets month
     * @param month Integer representing the month (Jan = 0)
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Sets day
     * @param day Integer representing day of month
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * sets year, month, day by using elapsedTime
     * @param elapsedTime A long number representing elapsed time in ms since Jan 1, 1970
     */
    public void setDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
}
