package com.java.base.generic.simple;

public class PairTest {

    public static void main(String[] args){
        String[] arr = new String[]{"mary","had","a","little"};
        Pair<String> minmax = ArrayAg.minmax(arr);
        System.out.println(minmax.getFirst());
        System.out.println(minmax.getSecond());

        System.out.println(ArrayAg.getMiddle("aa","bb","dd","ss","ff"));
    }

}

class ArrayAg{

    public static Pair<String> minmax(String[] a){
        if (a==null || a.length ==0) return null;
        String min = a[0];
        String max = a[0];

        for(int i=0;i<a.length;i++){
            if (a[i].compareTo(min) > 0) min = a[i];
            if (a[i].compareTo(max) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }

    public static <T> T getMiddle(T...a){
        return a[a.length/2];
    }

    public static <T extends Comparable> T min(T[] a){
        if (a == null || a.length == 0) return null;
        T small = a[0];
        for (int i=0;i<a.length;i++) {
            if (a[i].compareTo(small) > 0) small = a[i];
        }
        return small;
    }
}
