package dev.grafity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long curTime = System.currentTimeMillis();
        System.out.println(curTime);

        Date md = new Date(1686576309552L);
        System.out.println(md);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd");
        String dateStr = format.format(md);
        System.out.println(dateStr);
        String dob = "10/OCT/2018";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        Date dobObj = sdf.parse(dob);
        System.out.println(dobObj);
    }
}
