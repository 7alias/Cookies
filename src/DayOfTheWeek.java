import java.text.SimpleDateFormat;
import java.util.*;


public class DayOfTheWeek {
    public static void method(String date) {



        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));


    }
}
