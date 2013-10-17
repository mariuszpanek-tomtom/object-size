package com.tomtom.mariusz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    private static final int BIG_NUMBER = 10000000;

    /**
     * @param args
     */
    public static void main(String[] args) {
        //cw.1
//        int[] tab = new int[BIG_NUMBER];
//        for (int i = 0; i < BIG_NUMBER; i++) {
//            tab[i] = i;
//        }
         
        //cw.2
//        Integer[] tab = new Integer[BIG_NUMBER];
//        for (int i = 0; i < BIG_NUMBER; i++) {
//            tab[i] = new Integer(i);
//        }

        //cw.3
        ArrayList<Integer> myCollection = new ArrayList<Integer>(BIG_NUMBER);
        //myCollection.ensureCapacity(BIG_NUMBER); //or List<Integer>
        myCollection = new ArrayList<Integer>(BIG_NUMBER);
        for (int i = 0; i < BIG_NUMBER; i++) {
            myCollection.add(new Integer(i));
        }

        //cw.4
        //        Set<Integer> myCollection = new HashSet<Integer>(BIG_NUMBER);
        //        for (int i = 0; i < BIG_NUMBER; i++) {
        //            myCollection.add(new Integer(i));
        //        }

        //cw.5
        //        Map<Integer, Integer> myCollection = new HashMap<Integer, Integer>();
        //        for (int i = 0; i < BIG_NUMBER; i++) {
        //            myCollection.put(new Integer(i), null);
        //        }

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("maxMemory  =" + maxMemory / 1024);
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("totalMemory=" + totalMemory / 1024);
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("freeMemory =" + freeMemory / 1024);
        long usedMemory = totalMemory - freeMemory;
        System.out.println("usedMemory =" + usedMemory / 1024);

        //System.out.println(tab.length);
        System.out.println(myCollection.size());
        new java.util.Scanner(System.in).nextLine();

    }

}
