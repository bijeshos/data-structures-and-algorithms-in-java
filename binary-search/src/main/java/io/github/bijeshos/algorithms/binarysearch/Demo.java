package io.github.bijeshos.algorithms.binarysearch;

public class Demo {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        performDemo(inputArray, 8);
        performDemo(inputArray, 3);
        performDemo(inputArray, 6);
        performDemo(inputArray, 12);

    }

    private static void performDemo(int[] inputArray, int valueToFind) {
        BinarySearch.search(inputArray, valueToFind, 0, inputArray.length - 1);

        System.out.println("---");
    }
}
