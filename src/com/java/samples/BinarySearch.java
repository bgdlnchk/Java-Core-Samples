package com.java.samples;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numbersList.add(i);
        }
        System.out.println(binarySearch(numbersList, 3));
    }

    private static Integer binarySearch(ArrayList<Integer> numbersList, int item) {
        int low = 0;
        int high = numbersList.toArray().length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = numbersList.get(mid);

            if (guess == item) {
                return mid;
            } else if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
