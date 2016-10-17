package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        super("Task 15");
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setStroke(new BasicStroke(2.0f));
        gr2d.setPaint(Color.BLACK);

        int x0, y0, x, y, r, i;
        i = 0;
        r = 100;
        x0 = 250;
        y0 = 250;
        y = 0;
        x = 0;
       /* // Algorythm with floating point
        for ( x = 150; x <= 350; x++) {
            y = (int) Math.sqrt(r*r - (x-x0)*(x-x0)) + y0;
            System.out.println(x+"  "+y);
            gr2d.drawLine(x, y, x, y);
            gr2d.drawLine(x, 500-y, x, 500-y);
        }*/

        // Algorythm without floating point, complexity - O(n**2)
        for ( x = (x0-r); x <= (x0+r); x++) {
            for (y = (y0-r); y <= (y0+r); y++) {
                // Find points owned by circle on surface
                if ((((y - y0)*(y - y0) + (x - x0)*(x - x0)) > r*r -r) && (((y - y0)*(y - y0) + (x - x0)*(x - x0)) < r*r+r)) {
                    System.out.println(((y - y0) * (y - y0) + (x - x0) * (x - x0)) + "  "+ x+ "  "+y);
                    gr2d.drawLine(x, y, x, y);
                }
             }
        }
    }

    public static void main(String args[]) {
        Main app = new Main();
    }
}