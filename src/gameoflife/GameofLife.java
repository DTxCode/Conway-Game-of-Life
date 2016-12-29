package gameoflife;


public class GameofLife {

    public void doTest() {
        
        int milliseconds = 50;
        int delay = milliseconds;
        int evolutions = 100;
        int size = 20;
        String name = "bob";
        
        Colony myColony = new Colony(size, name);
        myColony.setCellAlive(4, 3);
        myColony.setCellAlive(4, 4);
        myColony.setCellAlive(4, 5);
        myColony.setCellAlive(3, 5);
        myColony.setCellAlive(2, 4);
        
        ColonyFrame CF = new ColonyFrame(myColony);
        CF.setVisible(true);
        
        new myTimer(evolutions, milliseconds, delay, myColony, CF);
        

    }

    public static void main(String[] args) {
        GameofLife GL = new GameofLife();
        GL.doTest();

    }

}
