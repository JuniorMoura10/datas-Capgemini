package javaDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex006 {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");

        String dataFormatada = formatter.format(agora);
        System.out.println(dataFormatada);
    }
}
