public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.println("Date1");
        System.out.println("Year: " + date1.getYear());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Day: " + date1.getDay());
        System.out.println("");

        MyDate date2 =  new MyDate(1234567898765L );
        System.out.println("Date2");
        System.out.println("Year: " + date2.getYear());
        System.out.println("Month: " + date2.getMonth());
        System.out.println("Day: " + date2.getDay());
        System.out.println("");

    }
}
