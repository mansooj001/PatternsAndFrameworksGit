package Assignments.Assignment2;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

class Drawwer {
    JPanel drawPanel;
    private int currentTrain = -1;
    private int currentNumberOfWagons;
    static final int HEIGHT_BETWEEN_TRAINS = 100;
    static final int WIDTH_BETWEEN_TRAINS = 100;

    public Drawwer(JPanel drawPanel, int currentTrain, int currentNumberOfWagons) {
        this.drawPanel = drawPanel;
        this.currentTrain = currentTrain;
        this.currentNumberOfWagons = currentNumberOfWagons;
    }

    void drawTrain(String train) {
        if (!Objects.equals(train, "")) {
            Graphics g = drawPanel.getGraphics();
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(30, 80 + currentTrain * HEIGHT_BETWEEN_TRAINS, 80, 40);
            g.fillRect(80, 60 + currentTrain * HEIGHT_BETWEEN_TRAINS, 30, 30);
            g.drawRoundRect(85, 40 + currentTrain * HEIGHT_BETWEEN_TRAINS, 20, 20, 20, 20);
            g.drawRoundRect(85, currentTrain * HEIGHT_BETWEEN_TRAINS, 40, 40, 40, 40);
            g.setColor(Color.BLACK);
            g.fillRoundRect(35, 120 + currentTrain * HEIGHT_BETWEEN_TRAINS, 20, 20, 20, 20);
            g.fillRoundRect(80, 120 + currentTrain * HEIGHT_BETWEEN_TRAINS, 20, 20, 20, 20);
            g.drawString(train, 40, 105 + currentTrain * HEIGHT_BETWEEN_TRAINS);
        }
    }

    void drawWagon(String wagon) {
        Graphics g = drawPanel.getGraphics();
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(30 + currentNumberOfWagons * WIDTH_BETWEEN_TRAINS, 80 + currentTrain * HEIGHT_BETWEEN_TRAINS, 80, 40);
        g.setColor(Color.BLACK);
        g.fillRoundRect(35 + currentNumberOfWagons * WIDTH_BETWEEN_TRAINS, 120 + currentTrain * HEIGHT_BETWEEN_TRAINS, 20, 20, 20, 20);
        g.fillRoundRect(80 + currentNumberOfWagons * WIDTH_BETWEEN_TRAINS, 120 + currentTrain * HEIGHT_BETWEEN_TRAINS, 20, 20, 20, 20);
        g.drawString(wagon, 40 + currentNumberOfWagons * WIDTH_BETWEEN_TRAINS, 105 + currentTrain * HEIGHT_BETWEEN_TRAINS);
    }
}