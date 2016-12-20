//package Assignments.Assignment2.RichRail.UI;
//
//import javax.swing.*;
//import javax.swing.border.BevelBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.HashMap;
//
///**
// * Created by jason on 12/20/2016.
// */
//public class UIClass extends javax.swing.JFrame {
//    private JButton btnDeleteWagon3;
//    private JButton btnDeleteWagon2;
//    private JButton btnDeleteWagon1;
//    private JButton jButton1;
//    private JButton btnAddWagon2;
//    private JButton btnAddWagon1;
//    private JTextField tfCurrentTrain;
//    private JButton btnDeleteTrain;
//    private JButton btnChooseTrain;
//    private JComboBox<String> cbAllTrains;
//    private JButton btnNewTrain;
//    private JTextField tfNewTrain;
//
//    private HashMap<java.io.Serializable, Integer> numberOfWagons;
//    private int currentNumberOfWagons;
//    private int currentTrain = -1;
//
//    private void initGUI() {
//        try {
//            this.setTitle("PoorRail");
//            GridBagLayout thisLayout = new GridBagLayout();
//            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//            thisLayout.rowWeights = new double[]{0.1, 0.1, 0.1, 0.1};
//            thisLayout.rowHeights = new int[]{7, 7, 7, 7};
//            thisLayout.columnWeights = new double[]{0.1, 0.1, 0.1, 0.1};
//            thisLayout.columnWidths = new int[]{7, 7, 7, 7};
//            getContentPane().setLayout(thisLayout);
//            {
//                JPanel jPanel1 = new JPanel();
//                jPanel1.setLayout(new BorderLayout());
//                getContentPane().add(jPanel1, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
//                {
//                    JPanel drawPanel = new JPanel();
//                    drawPanel.setBackground(Color.WHITE);
//                    jPanel1.add(drawPanel, BorderLayout.CENTER);
//                }
//            }
//            {
//                JPanel jPanel2 = new JPanel();
//                GridBagLayout jPanel2Layout = new GridBagLayout();
//                //jPanel2.setLayout(null);
//                jPanel2.setLayout(jPanel2Layout);
//                getContentPane().add(jPanel2, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
//                {
//                    JTextPane tpTextTrain = new JTextPane();
//                    jPanel2.add(tpTextTrain, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    jPanel2.setBounds(10, 10, 100, 15);
//                    jPanel2Layout.rowWeights = new double[]{0.1, 0.1, 0.1, 0.1};
//                    jPanel2Layout.rowHeights = new int[]{7, 7, 7, 7};
//                    jPanel2Layout.columnWeights = new double[]{0.1, 0.1, 0.1, 0.1};
//                    jPanel2Layout.columnWidths = new int[]{7, 7, 7, 7};
//                    tpTextTrain.setText("train name:");
//                }
//                {
//                    tfNewTrain = new JTextField(20);
//                    jPanel2.add(tfNewTrain, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                }
//                {
//                    btnNewTrain = new JButton();
//                    jPanel2.add(btnNewTrain, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnNewTrain.setText("make new train");
//                    btnNewTrain.addActionListener(this);
//                }
//                {
//                    ComboBoxModel<String> cbAllTrainsModel =
//                            new DefaultComboBoxModel<>(
//                                    new String[]{});
//                    cbAllTrains = new JComboBox<>();
//                /*	GridLayout cbAllTrainsLayout = new GridLayout(1, 1);
//					cbAllTrainsLayout.setColumns(1);
//					cbAllTrainsLayout.setHgap(5);
//					//cbAllTrainsLayout.setVgap(5);
//					cbAllTrains.setLayout(cbAllTrainsLayout);*/
//                    jPanel2.add(cbAllTrains, new GridBagConstraints(1, 1, 1, 2, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
//                    cbAllTrains.setModel(cbAllTrainsModel);
//                }
//                {
//                    btnChooseTrain = new JButton();
//                    jPanel2.add(btnChooseTrain, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnChooseTrain.setText("select train");
//                    btnChooseTrain.addActionListener(this);
//                }
//                {
//                    btnDeleteTrain = new JButton();
//                    jPanel2.add(btnDeleteTrain, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnDeleteTrain.setText("delete train");
//                    btnDeleteTrain.addActionListener(this);
//                }
//            }
//            {
//                JPanel pnlWagons = new JPanel();
//                GridBagLayout jPanel3Layout = new GridBagLayout();
//                getContentPane().add(pnlWagons, new GridBagConstraints(1, 2, 2, 3, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
//                jPanel3Layout.rowWeights = new double[]{0.1, 0.1, 0.1, 0.1};
//                jPanel3Layout.rowHeights = new int[]{7, 7, 7, 7};
//                jPanel3Layout.columnWeights = new double[]{0.1, 0.1, 0.1, 0.1};
//                jPanel3Layout.columnWidths = new int[]{7, 7, 7, 7};
//                pnlWagons.setLayout(jPanel3Layout);
//                pnlWagons.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
//                {
//                    tfCurrentTrain = new JTextField();
//                    pnlWagons.add(tfCurrentTrain, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
//                    tfCurrentTrain.setText("selected: ");
//                }
//                {
//                    btnAddWagon1 = new JButton();
//                    pnlWagons.add(btnAddWagon1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnAddWagon1.setText("add wagon 1");
//                    btnAddWagon1.addActionListener(this);
//                }
//                {
//                    btnAddWagon2 = new JButton();
//                    pnlWagons.add(btnAddWagon2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnAddWagon2.setText("add wagon 2");
//                    btnAddWagon2.addActionListener(this);
//                }
//                {
//                    jButton1 = new JButton();
//                    pnlWagons.add(jButton1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    jButton1.setText("add wagon 3");
//                    jButton1.addActionListener(this);
//                }
//                {
//                    btnDeleteWagon1 = new JButton();
//                    pnlWagons.add(btnDeleteWagon1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnDeleteWagon1.setText("delete wagon 1");
//                    btnDeleteWagon1.addActionListener(this);
//                }
//                {
//                    btnDeleteWagon2 = new JButton();
//                    pnlWagons.add(btnDeleteWagon2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnDeleteWagon2.setText("delete wagon 2");
//                    btnDeleteWagon2.addActionListener(this);
//                }
//                {
//                    btnDeleteWagon3 = new JButton();
//                    pnlWagons.add(btnDeleteWagon3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
//                    btnDeleteWagon3.setText("delete wagon 3");
//                    btnDeleteWagon3.addActionListener(this);
//                }
//            }
//            pack();
//            setSize(800, 600);
//            numberOfWagons = new HashMap<>();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
