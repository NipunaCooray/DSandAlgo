/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsbf.checkcommonchild;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nipunacooray
 */
class CheckCommonUsingMap {

    /**
     * @param args the command line arguments
     */
   
    static boolean isCommonElement(String [] array1, String [] array2){
        
        Map map = new HashMap();
        
        for(int i=0;i<array1.length;i++){
            if(! map.containsKey(array1[i])){
                map.put(array1[i], true);
            }
        }
        
//        System.out.println(map);
        
        for(int j=0;j<array2.length;j++){
            if(map.containsKey(array2[j])){
                return true;
            }
        }
        
        return false;
    }
    
     public static void main(String[] args) {
        String[] array1 = {"a","b","c","d","e"};
        String[] array2 = {"x","y","a"};
        
        System.out.println(isCommonElement(array1, array2));
        
    
    }
    
    
}



