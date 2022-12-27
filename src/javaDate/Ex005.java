package javaDate;

import java.text.DateFormat;
import java.util.Date;

public class Ex005 {

    public static void main(String[] args) {

        Date agora = new Date();
        System.out.println(agora);

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
    }
}
