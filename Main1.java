import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main1 extends JFrame implements ActionListener {

    private JButton o;
    private ImageIcon image1;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main1 frame = new Main1();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(500, 100, 500, 500);
                frame.setResizable(false);
            }
        });
    }

    public Main1() {
        setTitle("Main Food");
        
        getContentPane().setLayout(null);

        image1 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/GodFood2.png");
        o = new JButton("Order");
        o.setBounds(150,400,200,30);
        o.setFont(new Font("Tohama", Font.BOLD, 15));
        o.addActionListener(this);
        getContentPane().add(o);

    }
    public void paint(Graphics g) {

        g.setColor(Color.RED);
        image1.paintIcon( this, g, 100, 70 );
        g.fillRect(80, 50, 340, 10);// บน
        g.fillRect(80, 50, 10, 330);// ซ้าย
        g.fillRect(80, 380, 340, 10);// ล่าง
        g.fillRect(410, 50, 10, 330);// ขวา

        g.setColor(Color.GREEN);
        g.fillRect(30, 410, 450, 10);// บน
        g.fillRect(30, 410, 10, 70);// ซ้าย
        g.fillRect(30, 480, 450, 10);// ล่าง
        g.fillRect(470, 410, 10, 70);// ขวา
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == o){
            MainFood n = new MainFood();
            n.setVisible(true);
            n.setBounds(10, 10, 1530, 800);
            n.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            n.setResizable(false);
    
        }
        
    }
}