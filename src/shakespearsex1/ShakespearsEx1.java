/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespearsex1;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author cph-ds117
 */
public class ShakespearsEx1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        //limit 10.000 = 2sec calc time
        //limit 50.000 = 20 sec calc time
        int limit = 10_000;
        String[] words
                = FileUtility.toStringArray("C:\\Users\\cph-ds117\\Documents\\NetBeansProjects\\ShakespearsEx1\\src\\shakespearsex1\\ShakespearCompleteWork.txt",
                        "[^A-Za-z]");
        
       String[] limitArray = Arrays.copyOfRange(words, 0, limit);
       
        System.out.println("Limit set to: " + limit);
        //InsertionSort
       long startInsert = System.nanoTime();
       SortingAlgorithms.insertionSort(limitArray);
       long endInsert = System.nanoTime();
       System.out.println("InsertionSort: " + (endInsert - startInsert)/100_000 + " MS");
       
       //SelectionSort
       long startSelect = System.nanoTime();
       SortingAlgorithms.selectionSort(limitArray);
       long endSelect = System.nanoTime();
       System.out.println("SelectionSort: " + (endSelect - startSelect)/100_000 + " MS");
       
       //MergeSort
       long startMerge = System.nanoTime();
       SortingAlgorithms.mergeSort(limitArray);
       long endMerge = System.nanoTime();
       System.out.println("MergeSort: " + (endMerge - startMerge)/100_000 + " MS");
       
//        !!!!!Uncomment to test if sort works correctly
//        for (String string :limitArray) {
//            System.out.println(string);   
//        }
    }
}
