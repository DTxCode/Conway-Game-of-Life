
package gameoflife;


public class FlexiArray implements ArrayInterface {
    int size;
    protected int[] myArr;
    
    public FlexiArray(int size){
        this.size = size;
        myArr = new int[size];
    }
    
    
    
    public void set(int index, int value){
        myArr[index] = value;
    }
    
    public int get(int index){
        return myArr[index];
    }
    
    public int length(){
        return myArr.length;
    }
    
}
