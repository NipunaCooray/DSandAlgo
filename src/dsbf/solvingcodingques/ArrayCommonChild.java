/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsbf.solvingcodingques;

/**
 *
 * @author nipunacooray
 */

class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        HomeScreen home = new HomeScreen();
//        home.setVisible(true);
        int [] intArray = {1,2,3,4,5};
        int [] intArray2 = {2,3,5};

        ArrayCommonChild myobj = new ArrayCommonChild(intArray,intArray2);
        boolean result = myobj.containsCommonChild();
        System.out.println(result);
    
    }
    
}


public class ArrayCommonChild {

     private int[] array1;
     private int[] array2;

    public ArrayCommonChild(int [] arr1, int [] arr2){
        array1 = arr1;
        array2 = arr2;  
    }

    public boolean containsCommonChild(){

        for(int i=0;i<array1.length;i++){

            for(int j=0;j<array2.length;j++){

                System.out.println("Array 1 : "+array1[i]);

                System.out.println("Array 2 : "+array2[j]);

                if(array1[i] == array2[j]){
                    return true;
                }

            }
        }
    return false;
    }

}
