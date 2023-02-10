package com.sparta;

public class BubbleSort {
    public static int[] sort(int[] array) {
        int arrayLength = array.length;
        for (int x = 0; x < arrayLength; x++)
            for (int y = 1; y < arrayLength; y++)
                if (array[y] < array[y - 1]) {
//                    int temp = array[y];
//                    array[y] = array[x];
//                    array[y] = temp;
                    swap(array, y, y-1);

                }
        return array;




    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array [index1] = array[index2];
        array [index2] = temp;
    }
}