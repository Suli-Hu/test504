package edu.bu.ec504.spr19.Brain;

import edu.bu.ec504.spr19.sameGameTris.GUI;

import javax.swing.*;

/**
 * A smarter brain, for you to produce.
 */
public class smarterBrain extends Brain {
    public smarterBrain(GUI myGUI) {
        super(myGUI);
    }

    @Override
    public void allDone() {
    }

    @Override
    public String myName() {
        return null;
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Please insert brain here!");
    }
}
