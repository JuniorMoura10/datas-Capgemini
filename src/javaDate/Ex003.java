package javaDate;

import java.util.Date;

public class Ex003 {

    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        Date dataNoFuturo = new Date(1613124807691L);
        System.out.println(dataNoPassado);
        System.out.println(dataNoFuturo);

        //Comparando se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);

        //comparando se dataNoPassado e anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);
    }
}
