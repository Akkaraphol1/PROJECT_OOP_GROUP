import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.geom.Line2D;

public class menu2 extends JFrame implements ActionListener{
    private ImageIcon image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, 
    image13, image14, image15, image16, bg;

    static private JButton ex ;
    public menu2() {
        super("List Menu");
        setLayout(null);
        
        image1 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/1.jpg" );
        image2 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/2.jpg" );
        image3 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/3.jpg" );
        image4 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/4.jpg" );
        image5 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/5.jpg" );
        image6 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/6.jpg" );
        image7 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/7.jpg" );
        image8 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/8.jpg" );
        image9 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/9.jpg" );
        image10 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/10.jpg" );
        image11 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/11.png" );
        image12 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/12.png" );
        image13 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/13.png" );
        image14 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/14.png" );
        image15 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/15.png" );
        image16 = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/16.png" );
      
        bg = new ImageIcon( "c:/Users/User/Desktop/Oop_java_G/FoodStoreProject/img/bg.jpg" );
    
        ex = new JButton("Back");
        ex.setFont(new Font("Tohama", Font.BOLD, 20));
       ex.addActionListener(this);
       ex.setBounds(1100,600,150,50);
       add(ex);
    }

    public void paint(Graphics g) {
        bg.paintIcon( this, g, 5, 0 );
        g.setFont(new Font("Tahoma",Font.BOLD, 25));
        g.setColor(Color.BLACK);
        g.drawString("List Menu", 760, 60);
        g.setFont(new Font("Tahoma",Font.BOLD, 18));
        g.setColor(Color.BLACK);
        g.drawString("Menu", 180, 100);
        g.drawString("Price", 360, 100);

        g.drawString("Menu", 670, 100);
        g.drawString("Price", 850, 100);

        g.drawString("Menu", 1160, 100);
        g.drawString("Price", 1340, 100);

        g.setFont(new Font("Tahoma",Font.BOLD, 17));
        g.setColor(Color.BLUE);
        /*----------------------------- */
        image1.paintIcon( this, g, 15, 130 );
        g.drawString("Soft-boiled eggs              20.00 ฿", 150, 180);

        image2.paintIcon( this, g, 15, 240 );
        g.drawString("fried egg                         10.00 ฿", 150, 300);

        image3.paintIcon( this, g, 15, 350 );
        g.drawString("Omelette Rice                 35.00 ฿", 150, 400);

        image4.paintIcon( this, g, 15, 460 );
        g.drawString("Mined Pork                      50.00 ฿", 150, 500);
        g.drawString("and Minced Pork", 150, 520);

        image5.paintIcon( this, g, 15, 570 );
        g.drawString("Ricce with Basil              50.00 ฿", 150, 620);
        g.drawString("and Minced Pork", 150, 640);

        image6.paintIcon( this, g, 15, 680 );
        g.drawString("Rice with Basil               70.00 ฿", 150, 720);
        g.drawString("Seafood", 150, 740);

        /*----------------------------- */

        image7.paintIcon( this, g, 500, 130 );
        g.drawString("Pork Fried Rice                50.00 ฿", 635, 180);

        image8.paintIcon( this, g, 500, 240 );
        g.drawString("Seafood Fried Rice          70.00 ฿", 635, 300);

        image9.paintIcon( this, g, 500, 350 );
        g.drawString("Pork Porridge                   50.00 ฿", 635, 400);

        image10.paintIcon( this, g, 500, 460 );
        g.drawString("Seafood Porridge             70.00 ฿", 635, 510);
        g.setColor(Color.PINK);
        image11.paintIcon( this, g, 500, 570 );
        g.drawString("Pepsi                                   15.00 ฿", 635, 620);

        image12.paintIcon( this, g, 500, 680 );
        g.drawString("Sprite                                  15.00 ฿", 635, 720);

        /*----------------------------- */

        image13.paintIcon( this, g, 1000, 130 );
        g.drawString("Fanta Green                 15.00 ฿", 1150, 200);
        image14.paintIcon( this, g, 1000, 240 );
        g.drawString("Milinda                         15.00 ฿", 1150, 300);
        image15.paintIcon( this, g, 1000, 350 );
        g.drawString("Ice Tea                          15.00 ฿", 1150, 430);
        image16.paintIcon( this, g, 1000, 470 );
        g.drawString("Lemon Lime                   15.00 ฿", 1150, 530);
        //add(ex);
    }
    public static void main(String[] args) {
        menu2 window = new menu2();//
        window.setBounds(10,10,1530, 800);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
 
            // TODO Auto-generated method stub
            if(e.getSource() == ex){
                MainFood n = new MainFood();
                n.setVisible(true);
                n.setBounds(10, 10, 1530, 800);
                n.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                n.setResizable(false);
        
            }
        
    }
}
