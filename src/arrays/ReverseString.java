/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;

/**
 *
 * @author nipunacooray
 */
public class ReverseString {
    
    static String reverseString(String value){
        
        char[] array = value.toCharArray();
        
        char[] reversed =  new char[array.length];
        
        
        System.out.println(array.length);
        
        for(int i=0;i<array.length;i++){
            
            reversed[array.length-1-i] = array[i];
            System.out.println(reversed);
        }
        
        return String.valueOf(reversed);
    }
    
    
    public static void main(String[] args) {
        
        String reversedString = reverseString("abcde");
 
        System.out.println(reversedString);
        
    
    }
}


