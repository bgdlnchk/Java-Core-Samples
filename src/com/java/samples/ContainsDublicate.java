package com.java.samples;

import java.util.HashSet;
import java.util.Set;

public class ContainsDublicate {
    public static void main(String[] args) {
        int[] withDublicate = new int[] {1, 2, 3, 4, 2};
        int[] withoutDublicate = new int[] {1, 2, 3, 4, 5};

        System.out.println(containsDublicate(withDublicate));
        System.out.println(containsDublicate(withoutDublicate));
    }

    private static boolean containsDublicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

}
