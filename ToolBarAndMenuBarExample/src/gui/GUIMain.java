/*
 * TCSS 305
 */

package gui;

import java.awt.EventQueue;

/**
 * Starts The Tool and Menu Bar Example.
 * 
 * @author Alan Fowler
 * @version Winter 2014
 */
public final class GUIMain {

    /**
     * Private constructor to inhibit instantiation.
     */
    private GUIMain() {
        throw new IllegalStateException();
    }

    /**
     * Start point for the program.
     * 
     * @param theArgs command line arguments - ignored
     */
    public static void main(final String... theArgs) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI(); // create the graphical user interface
            }
        });
    }

}
