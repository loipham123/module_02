package ss3_static.local_date_util;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String dateString1 = "13/08/2025";
        String dateString2 = "2004/02/10";

        LocalDate date1 = LocalDataUtil.fromString_ddMMyyyy(dateString1);
        LocalDate date2 = LocalDataUtil.fromString_yyyyMMdd(dateString2);

        System.out.println("LocalDate từ chuỗi dd/MM/yyyy: " + date1);
        System.out.println("LocalDate từ chuỗi yyyy/MM/dd: " + date2);

        LocalDate currentDate = LocalDate.now();

        String formatterDate1 = LocalDataUtil.toString_ddMMyyyy(currentDate);
        String formatterDate2 = LocalDataUtil.toString_yyyyMMdd(currentDate);

        System.out.println("Chuỗi từ LocalDate (dd/MM/yyyy): " + formatterDate1);
        System.out.println("Chuỗi từ LocalDate (yyyy/MM/dd): " + formatterDate2);
    }
}
