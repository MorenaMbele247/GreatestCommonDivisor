package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        int maxDivisor;
        if ((first < 10) || (second < 10)) {
            return -1;
        } else {
            maxDivisor = 0;
            if (first > second) {
                for (int i = first; i > 0; i--) {
                    if ((first % i == 0) && (second % i == 0)) {
                        maxDivisor = i;
                        break;//Stop the loop
                    }
                }
            } else if (second > first) {
                for (int i = second; i > 0; i--) {
                    if ((first % i == 0) && (second % i == 0)) {
                        maxDivisor = i;
                        break;//Stop the loop
                    }
                }
            }
        }
        return maxDivisor;
    }
}
