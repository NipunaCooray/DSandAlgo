/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtables;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nipunacooray
 */
class MyNode {
    private String key;
    private int value;


  public MyNode(String key, int value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}

class MyNodes extends ArrayList<MyNode> {
}


public class CustomHashTable {
    
    private MyNodes[] data;
    private int length;
    
    public CustomHashTable(int size){
        length = size;
        this.data = new MyNodes[size];
    }
    
    public int hashFunction(String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }
    
    public void set(String key, int value) {
        if (data[hashFunction(key)] == null) {
          data[hashFunction(key)] = new MyNodes();
        }
        data[hashFunction(key)].add(new MyNode(key, value));
    }
    
    public int get(String key) {
        if (data[hashFunction(key)] == null) {
          return 0;
        }
        for (MyNode node : data[hashFunction(key)]) {
          if (node.getKey().equals(key)) {
            return node.getValue();
          }
        }
        return 0;
    }
    
    public List<String> keys() {
    List<String> keys = new ArrayList<>();
    for (int i = 0; i < length; i++) {
      if (data[i] != null) {
        for (int j = 0; j < data[i].size(); j++) {
          keys.add(data[i].get(j).getKey());
        }
      }
    }
    return keys;
  }
    
    
}

class MainCustomHashTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CustomHashTable table = new CustomHashTable(50);
        table.set("ta", 1000);
        table.set("tu", 589);
        table.set("e", 10);
        System.out.println(table.keys().size());
        System.out.println(table.get("ta"));
        System.out.println(table.get("tu"));
        System.out.println(table.get("e"));
        
    
    }
    
}
