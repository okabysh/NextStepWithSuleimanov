package Golovach.Lecture02;

import java.util.Arrays;

/**
 * Created by Oleg Kabysh on 07.04.2017.
 */
public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        System.out.println(Arrays.binarySearch(array, 5));
        System.out.println(Arrays.binarySearch(array, 10));
        System.out.println(Arrays.binarySearch(array, 15));
        System.out.println(Arrays.binarySearch(array, 20));
        System.out.println(Arrays.binarySearch(array, 25));
        System.out.println(Arrays.binarySearch(array, 30));
        System.out.println(Arrays.binarySearch(array, 35));
        System.out.println(Arrays.binarySearch(array, 40));
        System.out.println(Arrays.binarySearch(array, 45));
        System.out.println(Arrays.binarySearch(array, 50 ));
    }
}
