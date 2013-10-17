package com.tomtom.mariusz;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.set.hash.TIntHashSet;


public class Trove {

    private static final int BIG_NUMBER = 10000000;

    /**
     * @param args
     */
    public static void main(String[] args) {

        //cw.6
        /*TIntArrayList myCollection = new TIntArrayList(BIG_NUMBER);
        for (int i = 0; i < BIG_NUMBER; i++) {
            myCollection.add(new Integer(i));
        }*/
        //cw.7
        TIntHashSet myCollection = new TIntHashSet(BIG_NUMBER);
        for (int i = 0; i < BIG_NUMBER; i++) {
            myCollection.add(new Integer(i));
        }

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
