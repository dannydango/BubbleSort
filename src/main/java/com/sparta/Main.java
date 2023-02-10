package com.sparta;

import java.util.Arrays;

public class Main {
    public static void main(String[] names) {
        int[] numbers = { 8, 2, 4, 5, 18, 5, 3, 1, 0 };
        BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}