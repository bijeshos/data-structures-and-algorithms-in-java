package io.github.bijeshos.algorithms.binarysearch;

public class BinarySearch {

    public static void initSearch(int[] inputArray, int valueToFind) {
        BinarySearch.search(inputArray, valueToFind, 0, inputArray.length - 1);
    }

    private static int search(int[] array, int valueToFind, int leftPosition, int rightPosition) {
        System.out.println("Searching with value-to-find: " + valueToFind + ", left-position: " + leftPosition + ", right-position: " + rightPosition);
        if (rightPosition < leftPosition) {
            System.out.println("No match found for value-to-find [" + valueToFind + "]");
            return -1; //means no match found
        }

        // find median
        int median = (leftPosition + rightPosition) / 2;
        System.out.println("Value at median position [" + median + "] is: " + array[median]);


        if (valueToFind < array[median]) {
            // repeat binary search in the left half
            System.out.println("Repeating binary search in the left half");
            return search(array, valueToFind, leftPosition, median - 1);
        } else if (valueToFind > array[median]) {
            // repeat binary search in the right half
            System.out.println("Repeating binary search in the right half");
            return search(array, valueToFind, median + 1, rightPosition);
        } else if (array[median] == valueToFind) {
            System.out.println("Found match for value-to-find [" + valueToFind + "] at position [" + median + "]");
            return median;
        }
        return -1; //means no match found
    }
}
