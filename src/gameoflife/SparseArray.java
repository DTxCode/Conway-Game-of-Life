
package gameoflife;
import java.util.*;


public class SparseArray implements ArrayInterface {
    int size;
    HashMap<Integer, Integer> myMap;
    
    public SparseArray(int size){
        this.size = size;
        myMap = new HashMap(size);
    }
            
    public void set(int index, int value){
        myMap.put(index, value);
    }
    
    public int get(int index){
        if(myMap.get(index) == null){
            return 0;
        }else{
            return myMap.get(index);
            
        }
    }
    
    public int length(){
        return size;
    }
    
    public int numberElements(){
        return myMap.size();
    }

}
