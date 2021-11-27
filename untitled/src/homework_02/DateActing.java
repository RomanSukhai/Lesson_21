package homework_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateActing {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(conventDateToLocalDate(d));
        System.out.println(conventDateToLocalTime(d));
        System.out.println(conventDateToLocalTimeData(d));

    }
    public static LocalDate conventDateToLocalDate(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
    public static LocalTime conventDateToLocalTime(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }
    public static LocalDateTime conventDateToLocalTimeData(Date date){
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
