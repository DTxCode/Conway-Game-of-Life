package gameoflife;

public class Colony {

    Array2D myArray;
    Array2D originalArray;
    String name;
    int size;
    int genNumber = 1;

    public Colony(int size, String name) {
        myArray = new Array2D((size + 2), (size + 2), true);
        this.name = name;
        this.size = size;
    }

    public int getColonySize() {
        return size;
    }

    public int getGenerationNumber() {
        return genNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberLivingCells() {
        int alive = 0;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if ((myArray.get((r + 1), (c + 1))) != 0) {
                    alive++;
                }
            }
        }
        return alive;
    }

    public void resetColony() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                myArray.set(r, c, 0);
            }
        }
    }

    public void setCellAlive(int row, int col) {
        myArray.set((row + 1), (col + 1), 1);
    }

    public void setCellDead(int row, int col) {
        myArray.set((row + 1), (col + 1), 0);
    }

    public final boolean isCellAlive(int row, int col) {
        if (myArray.get((row + 1), (col + 1)) == 0) {
            return false;
        } else {
            return true;
        }

    }

    private boolean isOriginalCellAlive(int row, int col) {
        if (originalArray.get((row + 1), (col + 1)) == 0) {
            return false;
        } else {
            return true;
        }

    }

    private int aliveNear(int row, int col) {
        int alive = 0;
        for (int r = -1; r < 2; r++) {
            for (int c = -1; c < 2; c++) {
                if (isOriginalCellAlive((row + r), (col + c))) {
                    alive++;
                }
            }
        }
        return alive;
    }

    private void copier(Array2D orig, Array2D dynam) {
        int val;
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                val = dynam.get(r + 1, c + 1);
                orig.set(r + 1, c + 1, val);
            }
        }
    }

    public void evolve() {
        originalArray = new Array2D((size + 2), (size + 2), true);
        copier(originalArray, myArray);
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                if (isCellAlive(r, c) == true) {
                    if (((aliveNear(r, c)) - 1) < 2 || (aliveNear(r, c) - 1) > 3) {
                        setCellDead(r, c);
                    }
                } else if (isCellAlive(r, c) == false) {
                    if (aliveNear(r, c) == 3) {
                        setCellAlive(r, c);
                    }
                }
            }
        }
        genNumber++;
    }

    public String toString() {
        String output = "";
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                output += myArray.get((r + 1), (c + 1)) + " ";

            }
            output += "\n";

        }
        return output;

    }

}
