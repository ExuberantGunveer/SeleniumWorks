package OrangeHRM;


import java.util.GregorianCalendar;

public class RandomDn {

    public static void main(String[] args, GregorianCalendar GregorianCalendar) {
        for (int i = 0; i < 1; i++) {
            GregorianCalendar randomDate = createRandomDate(2000, 2100, GregorianCalendar);
            System.out.println(randomDate);
             }


    }
    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
    public static GregorianCalendar createRandomDate(int startYear, int endYear, GregorianCalendar GregorianCalendar ) {
        int day = createRandomIntBetween(1, 31);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return GregorianCalendar ;
    }

}
