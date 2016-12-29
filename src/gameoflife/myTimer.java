package gameoflife;

import java.util.*;

public class myTimer {

    int seconds;
    int delay;
    int evolutions;
    Colony myColony;
    ColonyFrame myCF;
    Timer timer;

    public myTimer(int evolutions, int seconds, int delay, Colony myColony, ColonyFrame myCF) {
        this.evolutions = evolutions;
        this.seconds = seconds;
        this.delay = delay;
        this.myColony = myColony;
        this.myCF = myCF;
        timer = new Timer();
        timer.schedule(new myTask(), delay, seconds);
    }

    public class myTask extends TimerTask {

        public void run() {

            if (myColony.genNumber <= evolutions) {
                myColony.evolve();
                myCF.repaint();

            } else {
                timer.cancel();
            }

        }
    }

}
