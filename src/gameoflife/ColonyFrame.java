package gameoflife;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColonyFrame extends JFrame {

    Colony myColony;

    public ColonyFrame(Colony myColony) {
        super();

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                setVisible(false);
                dispose();
            }

        });

        setTitle("My Colony");
        setSize(400, 400);
        setVisible(true);

        this.myColony = myColony;

    }

    public void paint(Graphics gr) {
        int width = (int) this.getContentPane().getSize().getWidth();
        int height = (int) this.getContentPane().getSize().getHeight();
        Graphics2D g = (Graphics2D) gr;

        g.setColor(Color.BLACK);
        g.clearRect(0, 0, width + 10, height + 32);
        for (int r = 0; r < myColony.size; r++) {
            for (int c = 0; c < myColony.size; c++) {
                g.drawRect((width / myColony.size) * c + 10, (height / myColony.size) * r + 32, (width / myColony.size), (height / myColony.size));

            }

        }

        for (int r = 0; r < myColony.size; r++) {
            for (int c = 0; c < myColony.size; c++) {
                if (myColony.isCellAlive(r, c)) {
                    g.setColor(Color.BLUE);
                    g.fillRect((width / myColony.size) * c + 11, (height / myColony.size) * r + 33, (width / myColony.size) - 1, (height / myColony.size) - 1);
                }
            }

        }

    }
}
