package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evens = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 == 0) evens += i;
        }
        return evens;
    }


    public static String getOddNumbers(int start, int stop) {
        String odds = "";
        for(int i = start; i < stop; i++) {
            if (i % 2 == 1) odds += i;
        }
        return odds;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        String range = "";
        for(int i = 0; i < start; i++) {
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for(int i = start; i < stop; i++) {
            range += i;
        }
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
