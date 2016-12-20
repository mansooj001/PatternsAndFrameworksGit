//package Assignments.Assignment2.RichRail.Logic;
//
//import Assignments.Assignment2.RichRail.UI.UIClass;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
///**
// * Created by jason on 12/20/2016.
// */
//public class MOCKClass implements ActionListener {
//    UIClass uiVar = new UIClass();
//    /**
//     * Invoked when an action occurs.
//     *
//     * @param event
//     */
//    @Override
//    public void actionPerformed(ActionEvent event) {
//        int OFFSET = 100;
//        int TRAINLENGTH = 100;
//        if (event.getSource() == uiVar.getbtnNewTrain) {
//            String train = tfNewTrain.getText();
//            if (train != null && train.trim().length() > 0) {
//                train = addTrain(train);
//                currentTrain = cbAllTrains.getSelectedIndex();
//                drawTrain(train);
//            }
//        } else if (event.getSource() == btnChooseTrain) {
//            if (cbAllTrains.getItemCount() > 0) {
//                String selection = (String) cbAllTrains.getSelectedItem();
//                tfCurrentTrain.setText("selected: " + selection);
//                int ti = cbAllTrains.getSelectedIndex();
//                if (ti != currentTrain) {
//                    numberOfWagons.put(currentTrain, currentNumberOfWagons);
//                }
//                currentTrain = ti;
//                try {
//                    currentNumberOfWagons = numberOfWagons.get(currentTrain);
//                } catch (Exception e) {
//                    currentNumberOfWagons = 0;
//                }
//            }
//        } else if (event.getSource() == btnDeleteTrain) {
//            if (cbAllTrains.getItemCount() > 0) {
//                String t = (String) cbAllTrains.getSelectedItem();
//                cbAllTrains.removeItemAt(cbAllTrains.getSelectedIndex());
//                numberOfWagons.remove(t);
//                repaint();
//                if (cbAllTrains.getSelectedItem() != null) {
//                    currentTrain = cbAllTrains.getSelectedIndex();
//                    tfCurrentTrain.setText("selected: " + cbAllTrains.getSelectedItem());
//                } else {
//                    currentTrain = 0;
//                    tfCurrentTrain.setText("selected: ");
//                }
//            }
//        } else if (event.getSource() == btnAddWagon1) {
//            currentNumberOfWagons++;
//            drawWagon("WAGON");
//        } else if (event.getSource() == btnAddWagon2) {
//            currentNumberOfWagons++;
//            drawWagon("Wagon2");
//        } else if (event.getSource() == jButton1) {
//            currentNumberOfWagons++;
//            drawWagon("Wagon3");
//        } else if (event.getSource() == btnDeleteWagon1) {
//            repaint(30 + TRAINLENGTH, 80 + currentTrain * OFFSET, 1, 1);
//        } else if (event.getSource() == btnDeleteWagon2) {
//            repaint(30 + TRAINLENGTH, 80 + currentTrain * OFFSET, 1, 1);
//        } else if (event.getSource() == btnDeleteWagon3) {
//            repaint(30 + TRAINLENGTH, 80 + currentTrain * OFFSET, 1, 1);
//        }
//    }
//}
