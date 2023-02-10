package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class BubbleSortTest {

    public static class BubbleSorterTest {
        @Test
        @DisplayName("Given a set of jumbled numbers, list should return the array of numbers in order")
        public void GivenArrayOfNumbers_ListReturnsThemInOrder(){
            int[] Array = {4, 2, 1, 5, 6, 3};
            int[] expectedList = Array;
            Arrays.sort(Array);
            Assertions.assertEquals(Arrays.toString(Array), Arrays.toString(BubbleSort.sort(expectedList)));
        }



    } }