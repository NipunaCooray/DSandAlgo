/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.HashMap;

/**
 *
 * @author nipunacooray
 * This is an attempt to create a Custom Array in Java. In JavaScript we can use the Object data type,
 * but in Java there is nothing similar (And I didn't want to use a Java Object Array) so used a HashMap
 */
public class CustomArray {
    Integer length;
    HashMap data;
    
    public CustomArray( Integer length){
        this.length = length;
        this.data = new HashMap<Integer,String>();
    }
    
    Object get(Integer index){
        return this.data.get(index);
    }
    
    void push(String item){
        this.data.put(length, item);
        this.length++;
    }
    
    void pop(){
        this.data.remove(this.length-1);
        this.length--;
    }
    
    void delete(Integer index){
        this.data.remove(index);
        this.shiftItems(index);
        this.data.remove(this.length-1);
        this.length--;
    }
    
    void shiftItems(Integer index){
        for(int i = index;i<this.length-1;i++){
            this.data.put(i, this.data.get(i+1));
        }
    }
    
    
}

class MainCustomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        HashMap<Integer, String> data = new HashMap<Integer, String>();
//
//        // Add keys and values (Country, City)
//        data.put(0, "London");

        CustomArray customArray = new CustomArray(0);
        customArray.push("Hello");
        
        System.out.println(customArray.data);
        System.out.println("Arraylength : "+customArray.length);
        
        customArray.push("World");
        
        System.out.println(customArray.data);
        System.out.println("Arraylength : "+customArray.length);
        
        customArray.pop();
        
        System.out.println(customArray.data);
        System.out.println("Arraylength : "+customArray.length);
        
        customArray.push("World");
        
        System.out.println(customArray.data);
        System.out.println("Arraylength : "+customArray.length);
        
        customArray.delete(1);
        System.out.println(customArray.data);
        System.out.println("Arraylength : "+customArray.length);
    
    }
    
}
