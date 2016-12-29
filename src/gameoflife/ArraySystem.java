package gameoflife;

public class ArraySystem {

    public void doTest() {
//        FlexiArray fa = new FlexiArray(2);
//        fa.set(0, 34);
//        fa.set(1, 44);
//        System.out.println(fa.get(0));
//        System.out.println(fa.length());
//        
//        GrowingArray ga = new GrowingArray(2);
//        ga.set(0, 50);
//        ga.set(1, 55);
//        ga.set(10, 60);
//        System.out.println(ga.get(10));
//        System.out.println(ga.length());
//        
//        SparseArray sa = new SparseArray(20);
//        sa.set(0, 10);
//        sa.set(1, 13);
//        System.out.println(sa.get(1));
//        System.out.println(sa.get(4));
//        System.out.println(sa.length());
//        System.out.println(sa.numberElements());

        int count=0;
        Array2D a2d = new Array2D(3, 4, false);
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 4; c++){
                a2d.set(r,c,count);
                count += 1;
            }
        }
        
        for(int r=0; r< 3; r++){
            for(int c=0; c<4; c++){
                System.out.print(a2d.get(r,c)+" ");
               
            }
            System.out.println();
        }
        
        System.out.println("Number Rows: " + a2d.numberRows());
        System.out.println("Number Cols: " + a2d.numberCols());
        System.out.println("Test crash:");
        a2d.set(2,5,12);

        
    }

    public static void main(String[] args) {
        ArraySystem AS = new ArraySystem();
        AS.doTest();
    }

}
