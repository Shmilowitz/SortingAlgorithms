/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespearsex1;

import java.util.Arrays;

public class SortingAlgorithms {

    public static String[] insertionSort(String[] insertionArray) {
        String key;
        int counter;
        for (int i = 1; i < insertionArray.length; i++) {
            key = insertionArray[i];
            if (key.compareTo(insertionArray[i - 1]) > 0) {
            } else {
                counter = 0 + i;
                while (counter - 1 >= 0 && key.compareTo(insertionArray[counter - 1]) < 0) {
                    insertionArray[counter] = insertionArray[counter - 1];
                    counter--;
                }
                insertionArray[counter] = key;
            }
        }
        return insertionArray;
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j) {
                // "<" changed to use of compareTo()
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void mergeSort(String[] arr) {
        if (arr.length > 2) {
            String[] left = new String[arr.length / 2];
            String[] right = new String[arr.length - arr.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = arr[i + arr.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(arr, left, right);
        }
    }

    public static void merge(String[] arr, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                arr[i] = left[a];
                a++;
            } else {
                arr[i] = right[b];
                b++;
            }
        }
    }
}
