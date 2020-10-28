package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String star = "*";
        String starsString = "";

        for(int i = 1; i <= numberOfRows; i++) {
            starsString += (star.repeat(i) + "\n");
        }
        return starsString;
    }

    public static String getRow(int numberOfStars) {
        String stars = "";
        for(int i = 1; i <= numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {
        String star = "*";
        String starsString = "";

        for(int i = 1; i <= 4; i++) {
            starsString += (star.repeat(i) + "\n");
        }
        return starsString;
    }

    public static String getLargeTriangle() {
        String star = "*";
        String starsString = "";

        for(int i = 1; i <= 10; i++) {
            starsString += (star.repeat(i) + "\n");
        }
        return starsString;
    }
}
