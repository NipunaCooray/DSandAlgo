/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
/**
 *
 * @author nipunacooray
 */
public class MergeSortedArrays {
    
    public static int[] MargeTwoSortedArray(int[] array1, int[] array2) {
    
    final int[] mergedArray = new int[array1.length + array2.length];
    
    int j = 0, k = 0;
    
    for (int i = 0; i < mergedArray.length; i++) {
        
      //array1 still has elements && (array2 is fully checked OR array1.currentElement < array2.currentElement
      
      //add array 1 element
      //increment j
      
      //else add array 2 element
      //increment k
      
      if (j != array1.length && (k == array2.length || array1[j] < array2[k])) {
        mergedArray[i] = array1[j];
        j++;
      } else { //
        mergedArray[i] = array2[k];
        k++;
      }
    }
        
    return mergedArray;
  }

  public static void main(String[] args) {
    int[] arr = MargeTwoSortedArray(new int[]{1,1,8,9,10}, new int[]{1,2,8,9,11,15,16});
    System.out.println(Arrays.toString(arr));
  }
}
