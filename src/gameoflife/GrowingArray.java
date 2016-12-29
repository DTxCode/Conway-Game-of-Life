
package gameoflife;
import java.util.Arrays;

public class GrowingArray extends FlexiArray {
    
    public GrowingArray(int size){
        super(size);
        
    }
    
    private int[] Resize(int[] oldArr, int index){
        int[] newArr;
        
        newArr = Arrays.copyOf(oldArr, (int)Math.ceil(index * 1.2));
        
        return newArr;
    }
    
    public void set(int index, int value){
        if(index > size - 1){
            myArr = Resize(myArr, index);
            myArr[index] = value;
        }else{
            myArr[index] = value;
        }
    }
    
    public int get(int index){
    return myArr[index];
    }
    
    public int length(){
        return myArr.length;
    }
}
