package OrangeHRM;

import java.time.LocalDate;
import java.util.Date;

public class RandomD {

    public static Date randomDate() {
        LocalDate randomDate = null;
        for (int i = 0; i < 1; i++) {
            randomDate    = createRandomDate(2020, 2070);
        }
            System.out.println(randomDate);
        
        return randomDate();
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 32);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);

        return LocalDate.of(year, month, day);
    }
}
