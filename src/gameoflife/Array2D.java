package gameoflife;

import java.lang.*;

public class Array2D {

    int maxR;
    int maxC;
    ArrayInterface myData;

    public Array2D(int numberRows, int numberCols, boolean isSparse) {
        if (isSparse) {
            myData = new SparseArray(numberRows * numberCols);
        } else {
            myData = new FlexiArray(numberRows * numberCols);
        }

        maxR = numberRows;
        maxC = numberCols;
    }

    private int index(int row, int col) {
     
            return ((row)*maxC + col);
        
    }

    public void set(int r, int c, int value) {
        if (r > maxR || c > maxC) {
            System.out.println("Array2D Index out of range. maxRows:" + maxR + " maxCols:" + maxC);
            System.exit(1);
        } else {
            myData.set(index(r, c), value);
        }
    }

    public int get(int r, int c) {
        if (r > maxR || c > maxC) {
            System.out.println("Array2D Index out of range. maxRows:" + maxR + "maxCols:" + maxC);
            System.exit(1);
        }
        return myData.get(index(r, c));

    }

    public int numberRows() {
        return maxR;
    }

    public int numberCols() {
        return maxC;
    }
}
