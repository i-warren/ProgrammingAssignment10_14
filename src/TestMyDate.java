/**
 * TestMyDate is a Java Class to test the MyDate class.
 * It creates two MyDate objects using Mydate() and MyDate(long elapsedTime)
 * The object information is printed for both objects using getter methods
 * date1 is modified using setYear(), setMonth(), and setDay()
 * the object info is printed again to test method
 * date2 is modified using setDate(long elapsedTime)
 * the object info is printed again to test method
 * </p>
 * @author Isaac Warren
 */
public class TestMyDate {
    public static void main(String[] args) {
        // Creates date1 using default constructor
        MyDate date1 = new MyDate();

        // Prints date1 info
        System.out.println("Date1");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println("");

        // Changes date1 using setter methods on year, month day
        date1.setYear(1980);
        date1.setMonth(5);
        date1.setDay(18);

        //Prints date1 info
        System.out.println("Date1: Change date using setYear(), setMonth() and setDay()");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println("");

        // Creates date2 with long integer
        MyDate date2 =  new MyDate(1234567898765L );

        // Prints date2 info
        System.out.println("Date2");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
        System.out.println("");

        // Changes date of date2 using setDate(long elapsedTime)
        date2.setDate(1434567898765L);

        // Prints date2 info
        System.out.println("Date2: Change date using setDate(long elapsedTime)");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
    }
}
