package Date;

public class DateMain {
    public static void main(String[] args) {
        Date time = new Date(2010,1234,12356);
        System.out.println(time.day);
        System.out.println(time.month);
        System.out.println(time.year);
        System.out.println(time.isLeapYear());
    }
}
