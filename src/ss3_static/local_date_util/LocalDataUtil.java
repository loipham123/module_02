package ss3_static.local_date_util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDataUtil {
    //dd/MM/yyyy
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //yyyy/MM/dd
    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    //dd/MM/yyyy -> LocalDate
    public static LocalDate fromString_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    //yyyy/MM/dd -> LocalDate
    public static LocalDate fromString_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    //LocalDate -> dd/MM/yyyy
    public static String toString_ddMMyyyy(LocalDate date) {
        return date.format(formatter_ddMMyyyy);
    }

    //LocalDate -> yyyy/MM/dd
    public static String toString_yyyyMMdd(LocalDate date) {
        return date.format(formatter_yyyyMMdd);
    }
}
