/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deeks
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.*;

public class dash extends JFrame implements ActionListener, MouseListener, Runnable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    String username;
    JLabel l4;
    Thread t1;

    dash(String username) {
        // Dashboard
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);// setSize 1540 , 810

        t1 = new Thread(this);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1600, 65);
        p1.setBackground(new Color(0,0,102));// rgb(255,219,223)
        p1.setBorder(BorderFactory.createLineBorder(Color.blue));
        add(p1);

        // Add Dashboard logo

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(5, 0, 70, 70);
        p1.add(l2);

        // Add Dashboard titel

        JLabel l3 = new JLabel("DASHBOARD");
        l3.setFont(new Font("Tahoma", Font.BOLD, 30));
        l3.setForeground(Color.WHITE);
        l3.setBounds(80, 10, 300, 40);
        p1.add(l3);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 65, 300, 900);
        p2.setBackground(new Color(0,0,102));
        add(p2);

        // copyright label

        JLabel copyright = new JLabel("@2022 tourism management");
        copyright.setBounds(10, 650, 160, 25);
        p2.add(copyright);

        // Add Dashboard Buttons

        b1 = new JButton("   Add Personal Details");
        b1.setBackground(new Color(0,0,102));
        b1.setHorizontalAlignment(SwingConstants.LEFT);
       // b1.setBorder(BorderFactory.createLineBorder(Color.blue));
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setBounds(0, 0, 300, 50);
        b1.setMargin(new Insets(0, 0, 0, 60));
        b1.addActionListener(this);
        b1.addMouseListener(this);
        p2.add(b1);

        b2 = new JButton("   Update Personal Details");
        b2.setBackground( new Color(0,0,102));
        b2.setHorizontalAlignment(SwingConstants.LEFT);
       // b2.setBorder(BorderFactory.createLineBorder(Color.red));
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(0, 50, 300, 50);
       b2.setMargin(new Insets(0, 0, 0, 30));
        b2.addActionListener(this);
        b2.addMouseListener(this);
        p2.add(b2);


        b5 = new JButton("   Check Package");
        b5.setBackground( new Color(0,0,102));
        b5.setHorizontalAlignment(SwingConstants.LEFT);
     //   b5.setBorder(BorderFactory.createLineBorder(Color.blue));
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0, 100, 300, 50);
        b5.setMargin(new Insets(0, 0, 0, 110));
        b5.addActionListener(this);
        b5.addMouseListener(this);
        p2.add(b5);

        b6 = new JButton("   Book Package");
        b6.setBackground(new Color(0,0,102));
        b6.setHorizontalAlignment(SwingConstants.LEFT);
    //    b6.setBorder(BorderFactory.createLineBorder(Color.RED));
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0, 150, 300, 50);
        b6.setMargin(new Insets(0, 0, 0, 120));
        b6.addActionListener(this);
        b6.addMouseListener(this);
        p2.add(b6);

        b7 = new JButton("   View package");
        b7.setBackground(new Color(0,0,102));
        b7.setHorizontalAlignment(SwingConstants.LEFT);
    //    b7.setBorder(BorderFactory.createLineBorder(Color.blue));
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0, 200, 300, 50);
        b7.setMargin(new Insets(0, 0, 0, 120));
        b7.addActionListener(this);
        b7.addMouseListener(this);
        p2.add(b7);

        b8 = new JButton("   Payment");
        b8.setHorizontalAlignment(SwingConstants.LEFT);
        b8.setBackground( new Color(0,0,102));
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setForeground(Color.WHITE);
       // b12.setBorder(BorderFactory.createLineBorder(Color.red));
        b8.setBounds(0, 250, 300, 50);
        b8.setMargin(new Insets(0, 0, 0, 155));
        b8.addActionListener(this);
        b8.addMouseListener(this);
        p2.add(b8);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 810, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1540, 810);
        add(l1);

        // Add label Title of Dashboard
        // l4 = new JLabel("Travel and Tourism Management System");
        l4 = new JLabel("  Tourism Management System  ");
        l4.setBounds(400, 100, 950, 70);
        l4.setForeground(Color.WHITE);
        l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l4.setFont(new Font("Tahoma", Font.BOLD, 55));
        l1.add(l4);

        // add multi threading
        t1.start();
    }

    // Add action Event

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Addcus(username).setVisible(true);

        }else if (ae.getSource() == b2) {
            new UpdateCustomer(username).setVisible(true);
        }


         else if (ae.getSource() == b5) {
            new Checkp().setVisible(true);

        } else if (ae.getSource() == b6) {
            new BookPackage(username).setVisible(true);

        } else if (ae.getSource() == b7) {
            new ViewPackage(username).setVisible(true);

        }

         else if (ae.getSource() == b8) {
            new Payment().setVisible(true);
            
        }/* else if (ae.getSource() == b13) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b14) {

            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b15) {
            new About().setVisible(true);

        } //else if (ae.getSource() == b16) {
            // System.exit(0);
            //new Feedback(username);

        */

    }

    // add Mouse Event

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == b1) {

            b1.setBackground(Color.black);
            b1.setForeground(Color.WHITE);
        } else if (e.getSource() == b2) {

            b2.setBackground(Color.black);
            b2.setForeground(Color.WHITE);
        }// else if (e.getSource() == b3) {

          //  b3.setBackground(Color.black);
          //  b3.setForeground(Color.WHITE);
         /*else if (e.getSource() == b4) {
            b4.setBackground(Color.black);
            b4.setForeground(Color.WHITE);

        }*/ else if (e.getSource() == b5) {
            b5.setBackground(Color.black);
            b5.setForeground(Color.WHITE);

        } else if (e.getSource() == b6) {
            b6.setBackground(Color.black);
            b6.setForeground(Color.WHITE);

        } else if (e.getSource() == b7) {
            b7.setBackground(Color.black);
            b7.setForeground(Color.WHITE);

        } else if (e.getSource() == b8) {
            b8.setBackground(Color.black);
            b8.setForeground(Color.WHITE);

        } /*else if (e.getSource() == b9) {

            b9.setBackground(Color.black);
            b9.setForeground(Color.WHITE);
        } else if (e.getSource() == b10) {

            b10.setBackground(Color.black);
            b10.setForeground(Color.WHITE);
        } /*else if (e.getSource() == b11) {

            b11.setBackground(Color.black);
            b11.setForeground(Color.WHITE);
        } else if (e.getSource() == b12) {
            b12.setBackground(Color.black);
            b12.setForeground(Color.WHITE);

        }/* else if (e.getSource() == b13) {
            b13.setBackground(Color.black);
            b13.setForeground(Color.WHITE);

        } else if (e.getSource() == b14) {
            b14.setBackground(Color.black);
            b14.setForeground(Color.WHITE);

        } else if (e.getSource() == b15) {
            b15.setBackground(Color.black);
            b15.setForeground(Color.WHITE);

        } else if (e.getSource() == b16) {
            b16.setBackground(Color.black);
            b16.setForeground(Color.WHITE);

        }*/

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component

        b1.setBackground(new Color(0,0,102));
        b1.setForeground(Color.WHITE);
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.WHITE);
        //b3.setBackground(new Color(0,0,102));
        //b3.setForeground(Color.WHITE);
     //   b4.setBackground(Color.WHITE);
       // b4.setForeground(Color.BLUE);
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.WHITE);
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.WHITE);
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.WHITE);
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.WHITE);
       /* b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.WHITE);
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.WHITE);
    //    b11.setBackground(Color.WHITE);
    //    b11.setForeground(Color.BLUE);
        b12.setBackground(new Color(0,0,102));
        b12.setForeground(Color.WHITE);
    /*    b13.setBackground(Color.WHITE);
        b13.setForeground(Color.BLUE);
        b14.setBackground(Color.WHITE);
        b14.setForeground(Color.BLUE);
        b15.setBackground(Color.WHITE);
        b15.setForeground(Color.BLUE);
        b16.setBackground(Color.WHITE);
        b16.setForeground(Color.BLUE);*/

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    // Multithreading
    @Override
    public void run() {

        int x = 400;
        int y = 100;
        boolean checked = true;
        while (true) {

            if (checked) {
                l4.setLocation(x, y);
                x += 5;

            } else {
                l4.setLocation(x, y);
                x -= 5;
            }
            if (x > 500) {
                checked = false;
                l4.setForeground(Color.white);
                l4.setBorder(BorderFactory.createLineBorder(Color.blue));
            } else if (x < 400) {
                checked = true;
                l4.setForeground(Color.black);
                l4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }

            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String args[])
    {
        new dash("").setVisible(true);
    }

}