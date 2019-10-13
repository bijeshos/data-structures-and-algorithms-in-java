package io.github.bijeshos.algorithms.binarysearch;

public class Demo {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinarySearch.initSearch(inputArray, 8);
        System.out.println("---");
        BinarySearch.initSearch(inputArray, 3);
        System.out.println("---");
        BinarySearch.initSearch(inputArray, 6);
        System.out.println("---");
        BinarySearch.initSearch(inputArray, 12);
        System.out.println("---");

    }

}
