package Assignments.Assignment2;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;


/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class PoorRail {
    private static final int WINDOW_WIDTH = 1280;
    private static final int WINDOWS_HEIGHT = 720;
    private static final double UNKNOWN_DOUBLE = 0.1;
    private static final int UNKNOWN_INT = 7;
    private final JFrame frame = new JFrame();
    private JButton btnDeleteWagon3 = new JButton();
    private JButton btnDeleteWagon2 = new JButton();
    private JButton btnDeleteWagon1 = new JButton();
    private JButton btnAddWagon3 = new JButton();
    private JButton btnAddWagon2 = new JButton();
    private JButton btnAddWagon1 = new JButton();
    private JTextField tfCurrentTrain = new JTextField();
    private JComboBox<String> cbAllTrains = new JComboBox<>();
    private JTextField tfNewTrain = new JTextField();
    private JPanel drawPanel = new JPanel();
    private final Insets defaultInsets = new Insets(0, 0, 0, 0);
    private InputHandler inputHandler = new InputHandler();
    private Drawwer drawwer;

    private HashMap<Serializable, Integer> numberOfWagons = new HashMap<>();
    private int currentNumberOfWagons;
    private int currentTrain = -1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PoorRail::new);
    }

    private PoorRail() {
        drawwer = new Drawwer(drawPanel, currentTrain, currentNumberOfWagons);
        frame.setTitle("PoorRail");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        GridBagLayout mainLayout = new GridBagLayout();
        setRowHeights(mainLayout);
        setColumnWidths(mainLayout);
        frame.getContentPane().setLayout(mainLayout);
        createTopPanel();
        createLowerLeftPanel();
        createLowerRightPanel();
        frame.pack();
        frame.setSize(WINDOW_WIDTH, WINDOWS_HEIGHT);
        numberOfWagons = new HashMap<>();
        frame.setLocationRelativeTo(null); // place window in center of screen
        frame.setVisible(true); // show window
    }

    private void setColumnWidths(GridBagLayout layout) {
        layout.columnWeights = new double[]{UNKNOWN_DOUBLE, UNKNOWN_DOUBLE, UNKNOWN_DOUBLE, UNKNOWN_DOUBLE};
        layout.columnWidths = new int[]{UNKNOWN_INT, UNKNOWN_INT, UNKNOWN_INT, UNKNOWN_INT};
    }

    private void setRowHeights(GridBagLayout layout) {
        layout.rowWeights = new double[]{UNKNOWN_DOUBLE, UNKNOWN_DOUBLE, UNKNOWN_DOUBLE, UNKNOWN_DOUBLE};
        layout.rowHeights = new int[]{UNKNOWN_INT, UNKNOWN_INT, UNKNOWN_INT, UNKNOWN_INT};
    }

    private void createLowerRightPanel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        frame.getContentPane().add(panel, createGridBagConstraints(1, 2, 1, 3, GridBagConstraints.BOTH, defaultInsets));
        setRowHeights(layout);
        setColumnWidths(layout);
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
        addCurrentTrainTF(panel);

        addAddButtonToPanel(panel, btnAddWagon1, "add wagon 1", createGridBagConstraints(1, 0, 1, 1, GridBagConstraints.NONE, defaultInsets), e -> {
            drawWagon("Wagon1");
        });

        addAddButtonToPanel(panel, btnAddWagon2, "add wagon 2", createGridBagConstraints(1, 1, 1, 1, GridBagConstraints.NONE, defaultInsets), e -> {
            drawWagon("Wagon2");
        });

        addAddButtonToPanel(panel, btnAddWagon3, "add wagon 3", createGridBagConstraints(1, 2, 1, 1, GridBagConstraints.NONE, defaultInsets), e -> {
            drawWagon("Wagon3");
        });

        addDeleteButtonToPanel(panel, btnDeleteWagon1, createGridBagConstraints(2, 0, 1, 1, GridBagConstraints.NONE, defaultInsets), "delete wagon 1", inputHandler);
        addDeleteButtonToPanel(panel, btnDeleteWagon2, createGridBagConstraints(2, 1, 1, 1, GridBagConstraints.NONE, defaultInsets), "delete wagon 2", inputHandler);
        addDeleteButtonToPanel(panel, btnDeleteWagon3, createGridBagConstraints(2, 2, 1, 1, GridBagConstraints.NONE, defaultInsets), "delete wagon 3", inputHandler);

    }

    private GridBagConstraints createGridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, int both, Insets defaultInsets) {
        return new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 0.0, 0.0, GridBagConstraints.CENTER, both, defaultInsets, 0, 0);
    }

    private void addDeleteButtonToPanel(JPanel panel, JButton btnDeleteWagon1, GridBagConstraints gridBagConstraints, String text, InputHandler inputHandler) {
        panel.add(btnDeleteWagon1, gridBagConstraints);
        btnDeleteWagon1.setText(text);
        btnDeleteWagon1.addActionListener(inputHandler);
    }

    private void drawWagon(String wagon1) {
        currentNumberOfWagons++;
        drawwer.drawWagon(wagon1);
    }

    private void addAddButtonToPanel(JPanel panel, JButton button, String text, GridBagConstraints constraints, ActionListener alWagon) {
        button.setText(text);
        panel.add(button, constraints);
        button.addActionListener(alWagon);
    }

    private void addCurrentTrainTF(JPanel panel) {
        tfCurrentTrain = new JTextField();
        panel.add(tfCurrentTrain, createGridBagConstraints(0, 0, 1, 1, GridBagConstraints.HORIZONTAL, defaultInsets));
        tfCurrentTrain.setText("selected: ");
    }

    private void createLowerLeftPanel() {
        // lower left panel
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        frame.getContentPane().add(panel, createGridBagConstraints(0, 2, 1, 1, GridBagConstraints.BOTH, defaultInsets));

        panel.add(new JLabel("train name:"), createGridBagConstraints(0, 0, 1, 1, GridBagConstraints.NONE, defaultInsets));
        panel.setBounds(10, 10, 100, 15);
        setRowHeights(layout);
        setColumnWidths(layout);

        tfNewTrain = new JTextField(20);
        panel.add(tfNewTrain, createGridBagConstraints(1, 0, 1, 1, GridBagConstraints.NONE, defaultInsets));

        JButton btnNewTrain = new JButton("make new train");
        panel.add(btnNewTrain, createGridBagConstraints(2, 0, 1, 1, GridBagConstraints.NONE, defaultInsets));
        btnNewTrain.addActionListener(e -> {
            String train = tfNewTrain.getText();
            if (train != null && train.trim().length() > 0) {
                train = addTrain(train);
                currentTrain = cbAllTrains.getSelectedIndex();
                drawwer.drawTrain(train);
            }
        });

        panel.add(cbAllTrains, createGridBagConstraints(1, 1, 1, 2, GridBagConstraints.HORIZONTAL, defaultInsets));
        cbAllTrains.setModel(new DefaultComboBoxModel<>(
                new String[]{}));

        JButton btnChooseTrain = new JButton("select train");
        panel.add(btnChooseTrain, createGridBagConstraints(2, 1, 1, 1, GridBagConstraints.NONE, defaultInsets));
        btnChooseTrain.addActionListener(e -> {
            if (cbAllTrains.getItemCount() > 0) {
                String selection = (String) cbAllTrains.getSelectedItem();
                tfCurrentTrain.setText("selected: " + selection);
                int ti = cbAllTrains.getSelectedIndex();
                if (ti != currentTrain) {
                    numberOfWagons.put(currentTrain, currentNumberOfWagons);
                }
                currentTrain = ti;
                try {
                    currentNumberOfWagons = numberOfWagons.get(currentTrain);
                } catch (Exception ex) {
                    currentNumberOfWagons = 0;
                }
            }
        });

        {
            JButton btnDeleteTrain = new JButton("delete train");
            panel.add(btnDeleteTrain, createGridBagConstraints(2, 2, 1, 1, GridBagConstraints.NONE, defaultInsets));
            btnDeleteTrain.addActionListener(e -> {
                if (cbAllTrains.getItemCount() > 0) {
                    String t = (String) cbAllTrains.getSelectedItem();
                    cbAllTrains.removeItemAt(cbAllTrains.getSelectedIndex());
                    numberOfWagons.remove(t);
                    frame.repaint();
                    if (cbAllTrains.getSelectedItem() != null) {
                        currentTrain = cbAllTrains.getSelectedIndex();
                        tfCurrentTrain.setText("selected: " + cbAllTrains.getSelectedItem());
                    } else {
                        currentTrain = 0;
                        tfCurrentTrain.setText("selected: ");
                    }
                }
            });
        }
    }

    private void createTopPanel() {
        // drawpanel!1
        JPanel panel = new JPanel(new BorderLayout());
        frame.getContentPane().add(panel, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0, GridBagConstraints.EAST, GridBagConstraints.BOTH, defaultInsets, 0, 0));
        drawPanel.setBackground(Color.WHITE);
        panel.add(drawPanel, BorderLayout.CENTER);
    }


    private String addTrain(String train) {
        String t = train.trim();

        // prevent from adding double entries
        for (int i = 0; i < cbAllTrains.getItemCount(); i++) {
            String cbTrain = cbAllTrains.getItemAt(i);
            if (cbTrain.equalsIgnoreCase(t)) {
                t = "";
                break;
            }
        }

        if (!Objects.equals(t, "")) {
            if (currentTrain >= 0) {
                numberOfWagons.put(currentTrain, currentNumberOfWagons);
            }
            cbAllTrains.addItem(t);
            cbAllTrains.setSelectedItem(t);
            numberOfWagons.put(t, 0);
        }

        return t;

    }

    class InputHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btnDeleteWagon1 || event.getSource() == btnDeleteWagon2 || event.getSource() == btnDeleteWagon3) {
                frame.repaint(30 + Drawwer.WIDTH_BETWEEN_TRAINS, 80 + currentTrain * Drawwer.HEIGHT_BETWEEN_TRAINS, 1, 1);
            }
        }
    }
}
