package com.java.base.generic.simple;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PairTest2 {

    public static void main(String[] args){
        GregorianCalendar[] birthdays = {
          new GregorianCalendar(1908, Calendar.DECEMBER,9),
          new GregorianCalendar(1923, Calendar.DECEMBER,9),
          new GregorianCalendar(1938, Calendar.APRIL,9),
          new GregorianCalendar(1954, Calendar.JULY,9),
        };

        Pair<GregorianCalendar> mm = ArrayAg2.minmax(birthdays);
        System.out.println(mm.getFirst().getTime());
        System.out.println(mm.getSecond().getTime());
    }

}
class ArrayAg2{

    public static <T extends Comparable> Pair<T> minmax(T[] a){
        if (a == null || a.length == 0) return null ;
        T min = a[0];
        T max = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i].compareTo(min) > 0) min = a[i];
            if (a[i].compareTo(max) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }


}
