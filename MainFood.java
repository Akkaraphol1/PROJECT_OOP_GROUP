import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.print.*;
import java.beans.ExceptionListener;
import javax.swing.*;
import javax.swing.plaf.FileChooserUI;

public class MainFood extends JFrame implements ActionListener, KeyListener {

    private JCheckBox C[] = new JCheckBox[20];
    private JComboBox CB[] = new JComboBox[2];
    private JRadioButton RB[] = new JRadioButton[20];
    private JTextField T[] = new JTextField[30];
    private JTextArea TA = new JTextArea();
    private JLabel LB[] = new JLabel[20];
    static private JButton B[] = new JButton[20];
    private double D[] = new double[20];
    private int num[] = new int[20];
    ButtonGroup BB = new ButtonGroup();
    String s2 = "";
    String s = "";

    String text = "", text2 = "", text3 = "", text4 = "", text5 = "", text6 = "", text7 = "", text8 = "", text9 = "",
            text10 = "", text11 = "", text12 = "", text13 = "", text14 = "", text15 = "", text16 = "", text17 = "",
            text18 = "", text19 = "";

    String cs = "";

    int v = 0;

    int tab = 0, chair = 0;
    private int N[] = new int[30];

    double Total, Change, ic, Total2;
    double Pay, PayB;
    String Tot, Pay2, Change2, Pay3, Pay4 = "", CTS = "", CTS2 = "", Status, Discount, TS = "";

    GregorianCalendar gcalendar = new GregorianCalendar();
    Calendar c = Calendar.getInstance();
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    String currentDate = df.format(c.getTime());

    SimpleDateFormat df2 = new SimpleDateFormat("hh:mm:ss a");
    String currentTime = df2.format(c.getTime());

    private JTextField TC[] = new JTextField[3];

    private String tables[] = { "Table", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

    public MainFood() {

        setLayout(null);

        LB[0] = new JLabel("Welcome to GOD FOOD");
        LB[0].setBounds(600, 20, 600, 40);
        LB[0].setFont(new Font("Tohama", Font.BOLD, 30));
        add(LB[0]);

        LB[1] = new JLabel("Menu");
        LB[1].setBounds(100, 100, 100, 30);
        LB[1].setFont(new Font("Tohama", Font.BOLD, 25));
        add(LB[1]);

        LB[2] = new JLabel("Number");
        LB[2].setBounds(400, 100, 100, 30);
        LB[2].setFont(new Font("Tohama", Font.BOLD, 25));
        add(LB[2]);

        LB[3] = new JLabel("Drink");
        LB[3].setBounds(600, 100, 100, 30);
        LB[3].setFont(new Font("Tohama", Font.BOLD, 25));
        add(LB[3]);

        LB[4] = new JLabel("Number");
        LB[4].setBounds(930, 100, 100, 30);
        LB[4].setFont(new Font("Tohama", Font.BOLD, 25));
        add(LB[4]);

        LB[5] = new JLabel("Receipt");
        LB[5].setBounds(1230, 100, 150, 30);
        LB[5].setFont(new Font("Tohama", Font.BOLD, 25));
        add(LB[5]);

        C[0] = new JCheckBox("Soft-boiled eggs  = 20 Baht");
        C[0].setBounds(50, 150, 300, 30);
        C[0].setEnabled(false);
        C[0].addActionListener(this);
        C[0].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[0]);

        T[0] = new JTextField("    0   ");//
        T[0].setBounds(400, 150, 100, 30);
        T[0].setEditable(false);
        T[0].addKeyListener(this);
        T[0].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[0]);

        C[1] = new JCheckBox("fried egg  = 10 Baht");
        C[1].setBounds(50, 200, 300, 30);
        C[1].addActionListener(this);
        C[1].setEnabled(false);
        C[1].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[1]);

        T[1] = new JTextField("    0   ");
        T[1].setBounds(400, 200, 100, 30);
        T[1].setEditable(false);
        T[1].addKeyListener(this);
        T[1].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[1]);

        C[2] = new JCheckBox("Omelette Rice  = 35 Baht");
        C[2].setBounds(50, 250, 300, 30);
        C[2].setEnabled(false);
        C[2].addActionListener(this);
        C[2].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[2]);

        T[2] = new JTextField("    0   ");
        T[2].setBounds(400, 250, 100, 30);
        T[2].setEditable(false);
        T[2].addKeyListener(this);
        T[2].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[2]);

        C[3] = new JCheckBox("Minced Pork  = 50 Baht");
        C[3].setBounds(50, 300, 300, 20);
        C[3].addActionListener(this);
        C[3].setEnabled(false);
        C[3].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[3]);

        T[3] = new JTextField("    0   ");
        T[3].setBounds(400, 300, 100, 30);
        T[3].setEditable(false);
        T[3].addKeyListener(this);
        T[3].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[3]);

        LB[0] = new JLabel("Omelette Rice ");
        LB[0].setBounds(70, 325, 200, 20);
        LB[0].setFont(new Font("Tohama", Font.BOLD, 20));
        add(LB[0]);

        C[4] = new JCheckBox("Rice with Basil  = 50 Baht");
        C[4].setBounds(50, 375, 300, 20);
        C[4].addActionListener(this);
        C[4].setEnabled(false);
        C[4].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[4]);

        LB[1] = new JLabel("and Minced Pork");
        LB[1].setBounds(70, 400, 250, 25);
        LB[1].setFont(new Font("Tohama", Font.BOLD, 20));
        add(LB[1]);

        T[4] = new JTextField("    0   ");
        T[4].setEditable(false);
        T[4].addKeyListener(this);
        T[4].setBounds(400, 375, 100, 30);
        T[4].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[4]);

        C[5] = new JCheckBox("Rice with Basil  = 70 Baht");
        C[5].setBounds(50, 450, 300, 25);
        C[5].addActionListener(this);
        C[5].setEnabled(false);
        C[5].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[5]);

        LB[2] = new JLabel("Seafood");
        LB[2].setBounds(70, 475, 250, 25);
        LB[2].setFont(new Font("Tohama", Font.BOLD, 20));
        add(LB[2]);

        T[5] = new JTextField("    0   ");
        T[5].setBounds(400, 450, 100, 30);
        T[5].setEditable(false);
        T[5].addKeyListener(this);
        T[5].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[5]);

        C[6] = new JCheckBox("Pork Fried Rice  = 50 Baht");
        C[6].setBounds(50, 525, 300, 25);
        C[6].addActionListener(this);
        C[6].setEnabled(false);
        C[6].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[6]);

        T[6] = new JTextField("    0   ");
        T[6].setBounds(400, 525, 100, 30);
        T[6].setEditable(false);
        T[6].addKeyListener(this);
        T[6].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[6]);

        C[7] = new JCheckBox("Seafood Fried Rice  = 70 Baht");
        C[7].setBounds(50, 575, 340, 20);
        C[7].addActionListener(this);
        C[7].setEnabled(false);
        C[7].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[7]);

        T[7] = new JTextField("    0   ");
        T[7].setBounds(400, 575, 100, 30);
        T[7].setEditable(false);
        T[7].addKeyListener(this);
        T[7].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[7]);

        C[8] = new JCheckBox("Pork Porridge  = 50 Baht");
        C[8].setBounds(50, 625, 300, 20);
        C[8].addActionListener(this);
        C[8].setEnabled(false);
        C[8].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[8]);

        T[8] = new JTextField("    0   ");
        T[8].setBounds(400, 625, 100, 30);
        T[8].setEditable(false);
        T[8].addKeyListener(this);
        T[8].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[8]);

        C[9] = new JCheckBox("Seafood porridge  = 70 Baht");
        C[9].setBounds(50, 675, 300, 20);
        C[9].setEnabled(false);
        C[9].addActionListener(this);
        C[9].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[9]);

        T[9] = new JTextField("    0   ");
        T[9].setBounds(400, 675, 100, 30);
        T[9].setEditable(false);
        T[9].addKeyListener(this);
        T[9].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[9]);

        C[10] = new JCheckBox("Pepsi  = 15 Baht");
        C[10].setBounds(580, 150, 300, 30);
        C[10].setEnabled(false);
        C[10].addActionListener(this);
        C[10].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[10]);

        T[10] = new JTextField("    0   ");
        T[10].setBounds(930, 150, 100, 30);
        T[10].setEditable(false);
        T[10].addKeyListener(this);
        T[10].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[10]);

        C[11] = new JCheckBox("Sprite  = 15 Baht");
        C[11].setBounds(580, 200, 300, 30);
        C[11].addActionListener(this);
        C[11].setEnabled(false);
        C[11].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[11]);

        T[11] = new JTextField("    0   ");
        T[11].setBounds(930, 200, 100, 30);
        T[11].setEditable(false);
        T[11].addKeyListener(this);
        T[11].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[11]);

        C[12] = new JCheckBox("Fanta Green  = 15 Baht");
        C[12].setBounds(580, 250, 300, 30);
        C[12].addActionListener(this);
        C[12].setEnabled(false);
        C[12].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[12]);

        T[12] = new JTextField("    0   ");
        T[12].setBounds(930, 250, 100, 30);
        T[12].setEditable(false);
        T[12].addKeyListener(this);
        T[12].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[12]);

        C[13] = new JCheckBox("Milinda  = 15 Baht");
        C[13].setBounds(580, 300, 300, 20);
        C[13].addActionListener(this);
        C[13].setEnabled(false);
        C[13].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[13]);

        T[13] = new JTextField("    0   ");
        T[13].setBounds(930, 300, 100, 30);
        T[13].setEditable(false);
        T[13].addKeyListener(this);
        T[13].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[13]);

        C[14] = new JCheckBox("Ice Tea  = 15 Baht");
        C[14].setBounds(580, 360, 340, 20);
        C[14].addActionListener(this);
        C[14].setEnabled(false);
        C[14].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[14]);

        T[14] = new JTextField("    0   ");
        T[14].setEditable(false);
        T[14].addKeyListener(this);
        T[14].setBounds(930, 360, 100, 30);
        T[14].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[14]);

        C[15] = new JCheckBox("Lemon Lime  = 15 Baht");
        C[15].setBounds(580, 410, 340, 20);
        C[15].addActionListener(this);
        C[15].setEnabled(false);
        C[15].setFont(new Font("Tohama", Font.BOLD, 20));
        add(C[15]);

        T[15] = new JTextField("    0   ");
        T[15].setBounds(930, 410, 100, 30);
        T[15].setEditable(false);
        T[15].addKeyListener(this);
        T[15].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[15]);

        TA = new JTextArea();
        TA.setEditable(false);
        TA.setFont(new Font("Tohama", Font.BOLD, 20));
        JScrollPane p = new JScrollPane(TA);
        p.setBounds(1100, 165, 350, 450);
        add(p);

        LB[8] = new JLabel("Member :");
        LB[8].setBounds(570, 500, 120, 30);
        LB[8].setFont(new Font("Tohama", Font.BOLD, 15));
        add(LB[8]);

        T[16] = new JTextField("");
        T[16].addKeyListener(this);
        T[16].setBounds(680, 500, 100, 30);
        T[16].addActionListener(this);
        T[16].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[16]);

        LB[12] = new JLabel("Subpay :");
        LB[12].setBounds(790, 500, 120, 30);
        LB[12].setFont(new Font("Tohama", Font.BOLD, 15));
        add(LB[12]);

        T[20] = new JTextField("");
        T[20].setBounds(900, 500, 100, 30);
        T[20].addActionListener(this);
        T[20].setEditable(false);
        T[20].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[20]);

        LB[10] = new JLabel("Reserve  ");
        LB[10].setBounds(560, 550, 120, 30);
        LB[10].setFont(new Font("Tohama", Font.BOLD, 15));
        LB[10].setForeground(Color.RED);
        add(LB[10]);

        CB[0] = new JComboBox(tables);
        CB[0].setBounds(650, 550, 100, 30);
        CB[0].setFont(new Font("Tohama", Font.BOLD, 15));
        add(CB[0]);

        LB[12] = new JLabel("Chair : ");
        LB[12].setBounds(780, 550, 120, 30);
        LB[12].setFont(new Font("Tohama", Font.BOLD, 15));
        add(LB[12]);

        TC[1] = new JTextField("");
        TC[1].addKeyListener(this);
        TC[1].setBounds(850, 550, 60, 30);
        TC[1].addActionListener(this);
        TC[1].setFont(new Font("Tohama", Font.BOLD, 20));
        add(TC[1]);

        RB[1] = new JRadioButton("Children -8");
        RB[1].setBounds(550, 600, 150, 30);
        RB[1].setFont(new Font("Tohama", Font.BOLD, 15));
        RB[1].addActionListener(this);
        add(RB[1]);

        RB[2] = new JRadioButton("Adult -5");
        RB[2].setBounds(720, 600, 100, 30);
        RB[2].setFont(new Font("Tohama", Font.BOLD, 15));
        RB[2].addActionListener(this);
        add(RB[2]);

        RB[3] = new JRadioButton("Older -3");
        RB[3].setBounds(890, 600, 100, 30);
        RB[3].setFont(new Font("Tohama", Font.BOLD, 15));
        RB[3].addActionListener(this);
        add(RB[3]);

        RB[1].setEnabled(false);
        RB[2].setEnabled(false);
        RB[3].setEnabled(false);

        BB.add(RB[1]);
        BB.add(RB[2]);
        BB.add(RB[3]);

        LB[9] = new JLabel("Total :");
        LB[9].setBounds(550, 650, 100, 30);
        LB[9].setFont(new Font("Tohama", Font.BOLD, 15));
        add(LB[9]);

        T[17] = new JTextField("");
        T[17].setBounds(600, 650, 80, 30);
        T[17].setEditable(false);
        T[17].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[17]);

        LB[10] = new JLabel("Pay :");
        LB[10].setBounds(700, 650, 100, 30);
        LB[10].setFont(new Font("Tohama", Font.BOLD, 15));
        add(LB[10]);

        T[18] = new JTextField("");
        T[18].setBounds(750, 650, 80, 30);
        T[18].setEnabled(false);
        T[18].addKeyListener(this);
        T[18].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[18]);

        LB[11] = new JLabel("Change :");
        LB[11].setBounds(850, 650, 100, 30);
        LB[11].setFont(new Font("Tohama", Font.BOLD, 15));
        add(LB[11]);

        T[19] = new JTextField("");
        T[19].setBounds(950, 650, 80, 30);
        T[19].setEditable(false);
        T[19].setFont(new Font("Tohama", Font.BOLD, 20));
        add(T[19]);

        B[1] = new JButton("Total");
        B[1].setBounds(540, 700, 100, 30); // 580
        B[1].setFont(new Font("Tohama", Font.BOLD, 15));
        B[1].addActionListener(this);
        add(B[1]);

        B[2] = new JButton("Pay");
        B[2].setBounds(680, 700, 100, 30);// 140
        B[2].setFont(new Font("Tohama", Font.BOLD, 15));
        B[2].setEnabled(false);
        B[2].addActionListener(this);
        add(B[2]);

        B[3] = new JButton("Reset");
        B[3].setBounds(1100, 650, 90, 30);
        B[3].setFont(new Font("Tohama", Font.BOLD, 15));
        B[3].addActionListener(this);
        add(B[3]);

        B[5] = new JButton("Cancel");
        B[5].setEnabled(false);
        B[5].setBounds(820, 700, 90, 30);
        B[5].setFont(new Font("Tohama", Font.BOLD, 15));
        B[5].addActionListener(this);
        add(B[5]);

        B[10] = new JButton("Report");
        B[10].setBounds(940, 700, 100, 30);
        B[10].setFont(new Font("Tohama", Font.BOLD, 15));
        B[10].setEnabled(false);
        B[10].addActionListener(this);
        add(B[10]);

        B[4] = new JButton("Print");
        B[4].setEnabled(false);
        B[4].setBounds(1230, 650, 90, 30);
        B[4].addActionListener(this); // 2 4 6 5 10
        B[4].setFont(new Font("Tohama", Font.BOLD, 15));
        add(B[4]);

        B[6] = new JButton("Save");
        B[6].setEnabled(false);
        B[6].setBounds(1100, 700, 90, 30);
        B[6].setFont(new Font("Tohama", Font.BOLD, 15));
        B[6].addActionListener(this);
        add(B[6]);

        B[7] = new JButton("Check");
        B[7].setBounds(1230, 700, 90, 30);
        B[7].setFont(new Font("Tohama", Font.BOLD, 15));
        B[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                menu2 window = new menu2();
                window.setBounds(10, 10, 1530, 800);
                window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                window.setVisible(true);

            }
        });
        add(B[7]);

        B[8] = new JButton("Load");
        B[8].setBounds(1360, 700, 90, 30);
        B[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                JFileChooser load = new JFileChooser();
                load.showOpenDialog(null);
                File l = load.getSelectedFile();
                String filename = l.getAbsolutePath();

                try {
                    FileReader reader = new FileReader(filename);
                    BufferedReader br = new BufferedReader(reader);
                    TA.setEditable(false);
                    TA.read(br, null);
                    br.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            }
        });

        B[8].setFont(new Font("Tohama", Font.BOLD, 15));
        add(B[8]);

        B[9] = new JButton("Clear");
        B[9].setBounds(1360, 650, 90, 30);
        B[9].setEnabled(false);
        B[9].setFont(new Font("Tohama", Font.BOLD, 15));
        B[9].addActionListener(this);
        add(B[9]);

    }

    public void paint(Graphics g) {

        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(20, 100, 10, 670);
        g.fillRect(20, 100, 1480, 10);
        g.fillRect(1060, 100, 10, 670);
        g.fillRect(20, 770, 1480, 10);

        g.fillRect(20, 160, 1480, 10);

        g.fillRect(1490, 100, 10, 670);

        g.fillRect(530, 100, 10, 670);

        g.fillRect(530, 500, 530, 10);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (T[16].getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please to check number member.");
            T[16].requestFocusInWindow();
            return;

        }
        // 1 - 10
        if (CB[0].getSelectedItem().equals("Table")) {
            JOptionPane.showMessageDialog(null, "Please to reserve Table .");
            CB[0].requestFocusInWindow();
            return;
        }

        if (CB[0].getSelectedItem().equals("1")) {
            CTS = "1";

        } else if (CB[0].getSelectedItem().equals("2")) {
            CTS = "2";

        } else if (CB[0].getSelectedItem().equals("3")) {
            CTS = "3";

        } else if (CB[0].getSelectedItem().equals("4")) {
            CTS = "4";

        } else if (CB[0].getSelectedItem().equals("5")) {
            CTS = "5";

        } else if (CB[0].getSelectedItem().equals("6")) {
            CTS = "6";

        } else if (CB[0].getSelectedItem().equals("7")) {
            CTS = "7";

        } else if (CB[0].getSelectedItem().equals("8")) {
            CTS = "8";

        } else if (CB[0].getSelectedItem().equals("9")) {
            CTS = "9";

        } else if (CB[0].getSelectedItem().equals("10")) {
            CTS = "10";

        }

        if (TC[1].getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please to input data.");
            v = 0;
            return;
        }

        // chair < member
        else if (Integer.parseInt(TC[1].getText()) < Integer.parseInt(T[16].getText())) {

            JOptionPane.showMessageDialog(null, "Please to input number chair more than or equal member.");
            TC[1].requestFocusInWindow();
            return;
        }

        else if (!TC[1].getText().equals("")
                && (Integer.parseInt(TC[1].getText()) >= Integer.parseInt(T[16].getText()))) {
            RB[1].setEnabled(true);
            RB[2].setEnabled(true);
            RB[3].setEnabled(true);
        }

        if (BB.isSelected(null)) {
            JOptionPane.showMessageDialog(null, "Please to select only one from three.");
            return;
        } else if (!BB.isSelected(null)) {

            C[0].setEnabled(true);
            C[1].setEnabled(true);
            C[2].setEnabled(true);
            C[3].setEnabled(true);
            C[4].setEnabled(true);
            C[5].setEnabled(true);
            C[6].setEnabled(true);
            C[7].setEnabled(true);
            C[8].setEnabled(true);
            C[9].setEnabled(true);
            C[10].setEnabled(true);
            C[11].setEnabled(true);
            C[12].setEnabled(true);
            C[13].setEnabled(true);
            C[14].setEnabled(true);
            C[15].setEnabled(true);

        }

        // clear
        if (e.getSource() == B[9]) {

            int result = JOptionPane.showConfirmDialog(B[9], "Are you sure ?",
                    "if you press yes, It auto delete a data. ", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                s = "";
                s2 = "";
                TA.setText(null);


            } else if (result == JOptionPane.NO_OPTION) {
                TA.setEditable(true);
            }
        }

        if (e.getSource() == B[9] && B[9].equals(null)) {
            JOptionPane.showMessageDialog(null, "Please to Enter Add .");
            return;
        }


        if (C[0].isSelected() ) {
            T[0].setEditable(true);
       
            }
        
        else {
            T[0].setEditable(false);
            T[0].setText("    0   ");
        }

        if (C[1].isSelected()) {
            T[1].setEditable(true);
 
        } else {
            T[1].setEditable(false);
            T[1].setText("    0   ");
        }

        if (C[2].isSelected()) {
            T[2].setEditable(true);
        } else {
            T[2].setEditable(false);
            T[2].setText("    0   ");
        }

        if (C[3].isSelected()) {
            T[3].setEditable(true);
        } else {
            T[3].setEditable(false);
            T[3].setText("    0   ");
        }

        if (C[4].isSelected()) {
            T[4].setEditable(true);
        } else {
            T[4].setEditable(false);
            T[4].setText("    0   ");
        }

        if (C[5].isSelected()) {
            T[5].setEditable(true);
        } else {
            T[5].setEditable(false);
            T[5].setText("    0   ");
        }

        if (C[6].isSelected()) {
            T[6].setEditable(true);
        } else {
            T[6].setEditable(false);
            T[6].setText("    0   ");
        }

        if (C[7].isSelected()) {
            T[7].setEditable(true);
        } else {
            T[7].setEditable(false);
            T[7].setText("    0   ");
        }

        if (C[8].isSelected()) {
            T[8].setEditable(true);
        } else {
            T[8].setEditable(false);
            T[8].setText("    0   ");
        }

        if (C[9].isSelected()) {
            T[9].setEditable(true);
        } else {
            T[9].setEditable(false);
            T[9].setText("    0   ");
        }

        if (C[10].isSelected()) {
            T[10].setEditable(true);
        } else {
            T[10].setEditable(false);
            T[10].setText("    0   ");
        }

        if (C[11].isSelected()) {
            T[11].setEditable(true);
        } else {
            T[11].setEditable(false);
            T[11].setText("    0   ");
        }

        if (C[12].isSelected()) {
            T[12].setEditable(true);
        } else {
            T[12].setEditable(false);
            T[12].setText("    0   ");
        }

        if (C[13].isSelected()) {
            T[13].setEditable(true);
        } else {
            T[13].setEditable(false);
            T[13].setText("    0   ");
        }

        if (C[14].isSelected()) {
            T[14].setEditable(true);
        } else {
            T[14].setEditable(false);
            T[14].setText("    0   ");
        }

        if (C[15].isSelected()) {
            T[15].setEditable(true);
        } else {
            T[15].setEditable(false);
            T[15].setText("    0   ");
        }

        if (e.getSource() == B[10]) {
            B[5].setEnabled(true);
            B[8].setEnabled(true);
            B[9].setEnabled(true);

            cs = "successfully";

            if (C[0].isSelected()) {

                s += "Soft-Boiled eggs\t    " + D[0] + "\t" + D[0] * 20 + "\n";
            }
            if (C[1].isSelected()) {

                s += "fried egg \t       " + D[1] + "\t" + D[1] * 10 + "\n";
            }
            if (C[2].isSelected()) {

                s += "Omelette Rice \t       " + D[2] + "\t" + D[2] * 35 + "\n";
            }
            if (C[3].isSelected()) {

                s += "Minced Pork Omelette Rice  \t       " + D[3] + "\t" + D[3] * 50 + "\n";
            }
            if (C[4].isSelected()) {

                s += "Rice with Basil and Minced Pork  \t       " + D[4] + "\t" + D[4] * 50 + "\n";
            }
            if (C[5].isSelected()) {

                s += "Rice with Basil Seafood  \t       " + D[5] + "\t" + D[5] * 70 + "\n";
            }
            if (C[6].isSelected()) {
                s += "Pork Fried Rice    \t       " + D[6] + "\t" + D[6] * 50 + "\n";
            }
            if (C[7].isSelected()) {
                s += "Seafood Fried Rice    \t       " + D[7] + "\t" + D[7] * 70 + "\n";
            }
            if (C[8].isSelected()) {
                s += "Pork Porridge    \t       " + D[8] + "\t" + D[8] * 50 + "\n";
            }
            if (C[9].isSelected()) {
                s += "Seafood porridge    \t       " + D[9] + "\t" + D[9] * 70 + "\n";
            }
            if (C[10].isSelected()) {
                s2 += "Pepsi     \t       " + D[10] + "\t" + D[10] * 15 + "\n";
            }
            if (C[11].isSelected()) {
                s2 += "Sprite     \t       " + D[11] + "\t" + D[11] * 15 + "\n";
            }

            if (C[12].isSelected()) {
                s2 += "Fanta Green     \t       " + D[12] + "\t" + D[12] * 15 + "\n";
            }
            if (C[13].isSelected()) {
                s2 += "Milinda     \t       " + D[13] + "\t" + D[13] * 15 + "\n";
            }
            if (C[14].isSelected()) {
                s2 += "Ice Tea     \t       " + D[14] + "\t" + D[14] * 15 + "\n";
            }
            if (C[15].isSelected()) {
                s2 += "Lemom Lime     \t       " + D[15] + "\t" + D[15] * 15 + "\n";
            }

        }

        if (e.getSource() == B[2]) {
            int result = JOptionPane.showConfirmDialog(B[2],
                    "Are you sure ?\nif You pressed yes You must pay include Table \n or if You pressed no pay only one \n,You don't have Edit.",
                    "", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                if (T[18].getText().equals("")) {
                    D[18] = 0;
                }

                else {

                    D[18] = (int) Double.parseDouble((T[18].getText()));
                }

                Pay = -Total2 + D[18];
                Pay2 = String.format("%.2f", Pay);

                if (D[16] > D[18]) {
                    JOptionPane.showMessageDialog(null, "Sorry,You don't have enough money. ");
                    T[19].setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");
                    T[19].setText(Pay2);
                    B[10].setEnabled(true);
                }
            }

            else if (result == JOptionPane.NO_OPTION) {

                if (T[18].getText().equals("")) {
                    D[18] = 0;
                }

                else {

                    D[18] = (int) Double.parseDouble((T[18].getText()));
                }

                // Total > Pay
                if (D[16] > D[18]) {
                    JOptionPane.showMessageDialog(null, "Sorry,You don't have enough money. ");
                    T[19].setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "You pay successfully!!!.\nThank you for using the service.");

                    // Table
                    N[0] = Integer.parseInt(T[16].getText());
                    N[1] = (int) (Total2 / N[0]);// 500 / 3 = 166.66 // ผลรวมทั้งหมด / จำนวนคน

                    Pay = (((-Total2 + D[18]) / N[0]));
                    Pay2 = String.format("%.2f", Pay);

                    PayB = N[1];
                    Pay4 = String.format("%.2f", PayB);
                    T[20].setText(Pay4);

                    T[19].setText(Pay2);
                    B[10].setEnabled(true);
                }

            }

        }

        else if (e.getSource() == B[1]) {

            D[0] = (int) Double.parseDouble(T[0].getText());
            D[1] = (int) Double.parseDouble((T[1].getText()));
            D[2] = (int) Double.parseDouble((T[2].getText()));
            D[3] = (int) Double.parseDouble((T[3].getText()));
            D[4] = (int) Double.parseDouble((T[4].getText()));
            D[5] = (int) Double.parseDouble((T[5].getText()));
            D[6] = (int) Double.parseDouble(T[6].getText());
            D[7] = (int) Double.parseDouble((T[7].getText()));
            D[8] = (int) Double.parseDouble((T[8].getText()));
            D[9] = (int) Double.parseDouble((T[9].getText()));
            D[10] = (int) Double.parseDouble((T[10].getText()));
            D[11] = (int) Double.parseDouble((T[11].getText()));
            D[12] = (int) Double.parseDouble((T[12].getText()));
            D[13] = (int) Double.parseDouble((T[13].getText()));
            D[14] = (int) Double.parseDouble((T[14].getText()));
            D[15] = (int) Double.parseDouble((T[15].getText()));

            if (RB[1].isSelected()) {

                Total = ((D[0] * 20.00) + (D[1] * 10.00) + (D[2] * 35.00) + (D[3] * 50.00) + (D[4] * 50.00)
                        + (D[5] * 70.00) + (D[6] * 50.00) + (D[7] * 70.00) + (D[8] * 50.00) + (D[9] * 70.00)
                        + (D[10] * 15.00) + (D[11] * 15.00) + (D[12] * 15.00) + (D[13] * 15.00) + (D[14] * 15.00)
                        + (D[15] * 15.00));

                Total2 = Total - 8;
                Status = "Children";
                Discount = " 8 Baht ";
            } else if (RB[2].isSelected()) {

                Total = ((D[0] * 20.00) + (D[1] * 10.00) + (D[2] * 35.00) + (D[3] * 50.00) + (D[4] * 50.00)
                        + (D[5] * 70.00) + (D[6] * 50.00) + (D[7] * 70.00) + (D[8] * 50.00) + (D[9] * 70.00)
                        + (D[10] * 15.00) + (D[11] * 15.00) + (D[12] * 15.00) + (D[13] * 15.00) + (D[14] * 15.00)
                        + (D[15] * 15.00));

                Total2 = Total - 5;
                Status = "Adult";
                Discount = " 5 Baht ";
            } else if (RB[3].isSelected()) {

                Total = ((D[0] * 20.00) + (D[1] * 10.00) + (D[2] * 35.00) + (D[3] * 50.00) + (D[4] * 50.00)
                        + (D[5] * 70.00) + (D[6] * 50.00) + (D[7] * 70.00) + (D[8] * 50.00) + (D[9] * 70.00)
                        + (D[10] * 15.00) + (D[11] * 15.00) + (D[12] * 15.00) + (D[13] * 15.00) + (D[14] * 15.00)
                        + (D[15] * 15.00));

                Total2 = Total - 3;
                Status = "Older";
                Discount = " 3 Baht ";
            }

            Tot = String.format("%.2f", Total2);
            T[17].setText(Tot);
            D[16] = (int) Double.parseDouble((T[17].getText()));
            if (D[16] <= 0.00) {
                JOptionPane.showMessageDialog(null, "Please to select buy a goods at least one pieces ");

            } else {
                B[2].setEnabled(true);
                T[18].setEnabled(true);
            }
        }

        else if (e.getSource() == B[3]) {

            s = "";
            s2 = "";
            T[0].setText("    0   ");
            T[1].setText("    0   ");
            T[2].setText("    0   ");
            T[3].setText("    0   ");
            T[4].setText("    0   ");
            T[5].setText("    0   ");
            T[6].setText("    0   ");
            T[7].setText("    0   ");
            T[8].setText("    0   ");
            T[9].setText("    0   ");
            T[10].setText("    0   ");
            T[11].setText("    0   ");
            T[12].setText("    0   ");
            T[13].setText("    0   ");
            T[14].setText("    0   ");
            T[15].setText("    0   ");
            T[16].setText("");
            T[17].setText("    0   ");
            T[18].setText("    0   ");
            T[19].setText("    0   ");

            C[0].setEnabled(false);
            C[1].setEnabled(false);
            C[2].setEnabled(false);
            C[3].setEnabled(false);
            C[4].setEnabled(false);
            C[5].setEnabled(false);
            C[6].setEnabled(false);
            C[7].setEnabled(false);
            C[8].setEnabled(false);
            C[9].setEnabled(false);
            C[10].setEnabled(false);
            C[11].setEnabled(false);
            C[12].setEnabled(false);
            C[13].setEnabled(false);
            C[14].setEnabled(false);
            C[15].setEnabled(false);
            B[2].setEnabled(false);
            B[10].setEnabled(false);
            B[4].setEnabled(false);
            B[6].setEnabled(false);
            B[5].setEnabled(false);
            B[9].setEnabled(false);
            B[1].setEnabled(true);

            C[0].setSelected(false);
            C[1].setSelected(false);
            C[2].setSelected(false);
            C[3].setSelected(false);
            C[4].setSelected(false);
            C[5].setSelected(false);
            C[6].setSelected(false);
            C[7].setSelected(false);
            C[8].setSelected(false);
            C[9].setSelected(false);
            C[10].setSelected(false);
            C[11].setSelected(false);
            C[12].setSelected(false);
            C[13].setSelected(false);
            C[14].setSelected(false);
            C[15].setSelected(false);

            CB[0].setSelectedIndex(0);
            TC[1].setText("");
            RB[1].setEnabled(false);
            RB[2].setEnabled(false);
            RB[3].setEnabled(false);
            RB[1].setSelected(false);
            RB[2].setSelected(false);
            RB[3].setSelected(false);

            T[20].setText(null);

            BB.setSelected(null, false);

            TA.setText(null);
            TA.setEditable(false);

        }

        else if (e.getSource() == B[4]) {

            try {
                boolean cc = TA.print();
                if (cc) {
                    JOptionPane.showMessageDialog(null, "Print successful");

                } else {
                    JOptionPane.showMessageDialog(null, " Printing! ");
                }
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }

        }

        else if (e.getSource() == B[5]) {
            int result = JOptionPane.showConfirmDialog(B[5], "Are you Sure  ?",
                    "If You pressed Yes, Status Reserve = Cancel.\nBut if You pressed No , Status Reserve = Successful . ",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                s = "";
                s2 = "";
                cs = "Cancel";
                TA.setEditable(true);
                TA.append("\nStatus Reserve : " + cs);
            } else if (result == JOptionPane.NO_OPTION) {
                cs = "Successful";
                TA.append("\nStatus Reserve : " + cs);
                TA.setEditable(false);
            }

        }

        else if (e.getSource() == B[10]) {

            int result = JOptionPane.showConfirmDialog(B[10], "Are you Sure  ?",
                    "If You pressed Yes , You can't edit data . ", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                C[0].setEnabled(false);
                C[1].setEnabled(false);
                C[2].setEnabled(false);
                C[3].setEnabled(false);
                C[4].setEnabled(false);
                C[5].setEnabled(true);
                C[6].setEnabled(false);
                C[7].setEnabled(false);
                C[8].setEnabled(false);
                C[9].setEnabled(false);
                C[10].setEnabled(false);
                C[11].setEnabled(false);
                C[12].setEnabled(false);
                C[13].setEnabled(false);
                C[14].setEnabled(false);
                C[15].setEnabled(false);
                B[1].setEnabled(false);
                // Member
                N[0] = Integer.parseInt(T[16].getText());

                chair = Integer.parseInt(TC[1].getText());

                if (T[20].equals(null)) {
                    TA.append(
                            "\tGodFood Store\n==========================================================================\n       Menu       \t\t\t"
                                    + "    Number   \t" + "    Price   " + "\n" + s);
                    TA.append("\n==========================================================================");

                    if (!s2.equals("")) {
                        TA.append("\n       Drink      \t\t\t" + "    Number   \t" + "    Price   " + "\n" + s2);
                    }
                    TA.append("\n==========================================================================\n"
                            + "Table : " + CTS + "\n" + "Chair : " + chair + "\nStatus : " + Status + "\nDiscount : "
                            + Discount + "\nDate-Month-Year : " + currentDate + "\n Time : " + currentTime
                            + "\n Member : " + N[0] + "  people " + "\n Total : " + Total2 + "\n Pay : " + D[18]
                            + "\n Change : " + Pay2 + "\n Status Reserve : " + cs
                            + "\n===========================================================================");

                } // subpay
                else if (!T[20].equals(null)) {
                    TA.append(
                            "\tGodFood Store\n==========================================================================\n       Menu       \t\t\t"
                                    + "    Number   \t" + "    Price   " + "\n" + s);
                    TA.append("\n==========================================================================");

                    if (!s2.equals("")) {
                        TA.append("\n       Drink      \t\t\t" + "    Number   \t" + "    Price   " + "\n" + s2);
                    }
                    TA.append("\n==========================================================================\n"
                            + "Table : " + CTS + "\n" + "Chair : " + chair + "\nStatus : " + Status + "\nDiscount : "
                            + Discount + "\nDate-Month-Year : " + currentDate + "\n Time : " + currentTime
                            + "\n Member : " + N[0] + "  people " + "\n Expenditure of each person : " + PayB
                            + "\n Total : " + Total2 + "\n Pay : " + D[18] + "\n Change : " + Pay2
                            + "\n Status Reserve : " + cs
                            + "\n=========================================================================");

                }

                B[10].setEnabled(false);
                B[4].setEnabled(true);
                B[6].setEnabled(true);
                B[2].setEnabled(false);
                B[5].setEnabled(true);

            } else if (result == JOptionPane.NO_OPTION) {

           s = "";
           s2 = "";
           TA.append("" + s + s2);
            }
        }

        // button save
        else if (e.getSource() == B[6]) {
            JFileChooser save = new JFileChooser();
            int res = save.showSaveDialog(this);
            System.out.println(res);
            if (res == 0) {
                try {
                    BufferedWriter wr = new BufferedWriter(
                            new OutputStreamWriter(new FileOutputStream(save.getSelectedFile())));
                    wr.write(TA.getText());
                    wr.newLine();
                    wr.close();
                } catch (Exception ex) {
                    Logger.getLogger(MainFood.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void main(String[] args) {
        MainFood n = new MainFood();
        n.setVisible(true);

        n.setBounds(10, 10, 1530, 800);
        n.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        n.setResizable(false);
    }

    @Override
    public void keyTyped(KeyEvent e) {

        char ch = e.getKeyChar();
        if ((ch < '0' || ch > '9') && ch != '\b') {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
