/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Keerthana S
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Checkp extends JFrame{
    public static void main(String[] args) {
      new Checkp().setVisible(true);
    }

    Checkp() {    
      setBounds(390, 120, 950, 600);  
      setVisible(true);
      String[] package1 = new String[]{"package1.jpg","DIVINE KARNATAKA TEMPLE TOUR (GOLD PACKAGE)","4 days and 5 Nights" ,"Dharmasthala-Manglore-Udupi-Murudeshwara-Gokarna-Horanadu", "Airport Assistance at Aiport", "Welcome drinks on Arrival", "Unlimited Daily Buffet", "Trekking Activities Included", "Multilingual Speaking Guide", "BOOK NOW", "Summer Special", "Rs 32000 only"};
      
      String[] package2 = new String[]{"package3.jpg","CLASSICAL TOUR OF KARNATAKA (SILVER PACKAGE) ","3 days and 4 Nights", "Bangalore-Mysore-Hassan-Hospet-Bangalore", "Adventural", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
      String[] package3 = new String[]{"package2.jpg","BENGALURU-MYSORE-OOTY (BRONZE PACKAGE)","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Daily Buffet", "Night Safari", "Cruise with Dinner","", "BOOK NOW", "Winter Special", "Rs 20000 only"};
      
      JTabbedPane tabbedPane = new JTabbedPane();
      JPanel p1 = createPackage(package1);
      tabbedPane.addTab("Package 1", null, p1);
      
      JPanel p2 = createPackage(package2);
      tabbedPane.addTab("Package 2", null, p2);
      
      JPanel p3 = createPackage(package3);
      tabbedPane.addTab("Package 3", null, p3);
      
      add(tabbedPane, BorderLayout.CENTER);    
   }
    
    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
      
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/gk.jpg"));
        Image i3 = i1.getImage().getScaledInstance(550, 300,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(500,0,350,420);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblName.setForeground(Color.GRAY);
        lblName.setBounds(50, 5, 550, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        l3.setForeground(Color.RED);
        l3.setBounds(35, 70, 400, 17);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        lblId.setForeground(Color.BLUE);
        lblId.setBounds(35, 110, 470, 17);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        l2.setForeground(Color.RED);
        l2.setBounds(35, 150, 300, 17);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setBounds(35, 190, 300, 17);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        lblGender.setForeground(Color.RED);
        lblGender.setBounds(35, 230, 300, 17);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setBounds(35, 270, 300, 17);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setBounds(35, 310, 300, 17);
        p1.add(lblReserveRoomNumber);

        JLabel lblCheckInStatus = new JLabel(pack[9]);
        lblCheckInStatus.setForeground(Color.BLUE);
        lblCheckInStatus.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        lblCheckInStatus.setBounds(35, 400, 200, 30);
        p1.add(lblCheckInStatus);

        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);
        
        JLabel la1 = new JLabel(pack[11]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(600, 460, 400, 40);
        p1.add(la1);
        
        return p1;
    }
}

