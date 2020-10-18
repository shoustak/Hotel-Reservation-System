/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.mysql.cj.protocol.a.MysqlTextValueDecoder;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;

public final class NewRes extends javax.swing.JFrame {

    public static int totalRoomsLeft = 100;
    public static int roomFor2 = 40;
    public static int roomFor2AndChildrens = 50;
    public static int suites = 10;
    public static int totalGuests = 0;
    int totalroomsadded = 0;
    int addAdults = 0;
    int addChildrens = 0;
    int roomnumber[] = new int[5];
    int price = 0;
    int addedAdlts = 0;
    int addedChl = 0;

    public NewRes() throws Exception {
        initComponents();
        addroomspanel.setVisible(false);
        nor.setText(Integer.toString(1));
        try {
            Connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static Connection con = null;
    static PreparedStatement stt = null;

    public void Connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/clients?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=GMT";

        try {
            con = DriverManager.getConnection(url, "root", "root");
            Statement st = con.createStatement();
            String q = "select * from clients";
            ResultSet rs = st.executeQuery(q);

            while (rs.next()) {
                String name = rs.getString("last_name");
                roomFor2 = Integer.parseInt(rs.getString("roomsfortwo"));
                roomFor2AndChildrens = Integer.parseInt(rs.getString("roomformorethantwo"));
                suites = Integer.parseInt(rs.getString("suits"));
                System.out.println(name);
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addroomspanel = new javax.swing.JPanel();
        addedhostype = new javax.swing.JComboBox<>();
        addedroomtype = new javax.swing.JComboBox<>();
        addednop = new javax.swing.JTextField();
        addedadults = new javax.swing.JTextField();
        addedchl = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        addroomsbtn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        idpass = new javax.swing.JTextField();
        nop = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        hosttype = new javax.swing.JComboBox<>();
        idorpasscombo = new javax.swing.JComboBox<>();
        edults = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        roomtype = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        totalDays = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        childrens = new javax.swing.JTextField();
        hotalstatspress = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addroombtn = new javax.swing.JButton();
        nor = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        until = new com.toedter.calendar.JDateChooser();
        from = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 620));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        addroomspanel.setBackground(new java.awt.Color(255, 255, 255));
        addroomspanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addroomspanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addroomspanel.setLayout(null);

        addedhostype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Half-board (Only Breakfast)", "Full board (Breakfast and Dinner) " }));
        addedhostype.setToolTipText("");
        addedhostype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addedhostypeActionPerformed(evt);
            }
        });
        addroomspanel.add(addedhostype);
        addedhostype.setBounds(140, 130, 320, 20);

        addedroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Adults (Also for 1 adult or more 1 children)", "2 Adult + 2/3 Childrens", "Suite (Up to 2/3 Childrens)" }));
        addedroomtype.setToolTipText("");
        addedroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addedroomtypeActionPerformed(evt);
            }
        });
        addroomspanel.add(addedroomtype);
        addedroomtype.setBounds(140, 170, 320, 20);
        addroomspanel.add(addednop);
        addednop.setBounds(140, 90, 60, 20);
        addroomspanel.add(addedadults);
        addedadults.setBounds(260, 90, 60, 20);
        addroomspanel.add(addedchl);
        addedchl.setBounds(400, 90, 60, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Adults:");
        addroomspanel.add(jLabel18);
        jLabel18.setBounds(210, 80, 130, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Number Of People:");
        addroomspanel.add(jLabel9);
        jLabel9.setBounds(20, 80, 130, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Host Type:");
        addroomspanel.add(jLabel19);
        jLabel19.setBounds(60, 130, 80, 17);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Room Type:");
        addroomspanel.add(jLabel20);
        jLabel20.setBounds(50, 170, 80, 17);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Childrens:");
        addroomspanel.add(jLabel21);
        jLabel21.setBounds(330, 80, 60, 40);

        addroomsbtn.setText("Add");
        addroomsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addroomsbtnActionPerformed(evt);
            }
        });
        addroomspanel.add(addroomsbtn);
        addroomsbtn.setBounds(150, 220, 200, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\ROEI\\Pictures\\iconfinder_x-circle_2561211.png")); // NOI18N
        jLabel22.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel22.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel22.setPreferredSize(new java.awt.Dimension(100, 100));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        addroomspanel.add(jLabel22);
        jLabel22.setBounds(20, 20, 40, 30);

        jPanel1.add(addroomspanel);
        addroomspanel.setBounds(270, 170, 500, 300);

        totalprice.setEditable(false);
        totalprice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        totalprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalpriceFocusLost(evt);
            }
        });
        jPanel1.add(totalprice);
        totalprice.setBounds(530, 470, 60, 30);
        jPanel1.add(fname);
        fname.setBounds(390, 140, 320, 30);
        jPanel1.add(lname);
        lname.setBounds(390, 180, 320, 30);
        jPanel1.add(idpass);
        idpass.setBounds(500, 220, 210, 30);
        jPanel1.add(nop);
        nop.setBounds(390, 260, 60, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("ILS");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(600, 465, 20, 40);

        hosttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Half-board (Only Breakfast)", "Full board (Breakfast and Dinner) " }));
        hosttype.setToolTipText("");
        hosttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hosttypeActionPerformed(evt);
            }
        });
        jPanel1.add(hosttype);
        hosttype.setBounds(390, 300, 320, 20);

        idorpasscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Passport" }));
        jPanel1.add(idorpasscombo);
        idorpasscombo.setBounds(390, 220, 100, 30);
        jPanel1.add(edults);
        edults.setBounds(510, 260, 60, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Room Type:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(300, 340, 80, 17);

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 Adults (Also for 1 adult or more 1 children)", "2 Adult + 2/3 Childrens", "Suite (Up to 2/3 Childrens)" }));
        roomtype.setToolTipText("");
        roomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeActionPerformed(evt);
            }
        });
        jPanel1.add(roomtype);
        roomtype.setBounds(390, 340, 320, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Total Days:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(330, 410, 120, 40);

        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(550, 520, 160, 50);

        totalDays.setEditable(false);
        jPanel1.add(totalDays);
        totalDays.setBounds(410, 420, 90, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("From:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(300, 370, 40, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Until:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(510, 370, 50, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Childrens:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 255, 60, 40);
        jPanel1.add(childrens);
        childrens.setBounds(650, 260, 60, 30);

        hotalstatspress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotalstatspressMouseClicked(evt);
            }
        });
        jPanel1.add(hotalstatspress);
        hotalstatspress.setBounds(0, 244, 180, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Adults:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(460, 255, 130, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID/Passport:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 215, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Number Of People:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 255, 130, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Host Type:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 300, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total Payment:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(430, 475, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Last Name:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 175, 70, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 135, 70, 40);

        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 520, 160, 50);

        addroombtn.setText("Add Room");
        addroombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addroombtnActionPerformed(evt);
            }
        });
        jPanel1.add(addroombtn);
        addroombtn.setBounds(720, 340, 110, 23);

        nor.setEditable(false);
        jPanel1.add(nor);
        nor.setBounds(600, 420, 100, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Total Rooms:");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(510, 410, 120, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("New Reservation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 70, 210, 50);
        jPanel1.add(until);
        until.setBounds(550, 380, 150, 20);
        jPanel1.add(from);
        from.setBounds(350, 380, 140, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/backgrounds/new.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 900, 668);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        int i = 1;

        if (checkIfNull() == 1) {
            return;
        }

        if (checkData() == 1) {
            return;
        }

        int host = hosttype.getSelectedIndex();
        int idOrPass = Integer.parseInt(idpass.getText());
        int numOfPoeple = Integer.parseInt(nop.getText().trim());
        int numOfRooms = Integer.parseInt(nor.getText().trim());
        int numOfAdlt = Integer.parseInt(edults.getText().trim());
        int numOfChl = Integer.parseInt(childrens.getText().trim());
        int roomType = roomtype.getSelectedIndex();

        try {

            price += checkPrice(numOfPoeple - (addedAdlts + addedChl), numOfAdlt - addedAdlts, numOfChl - addedChl, host, roomType);
            totalprice.setText(Integer.toString(price));

            totalRoomsLeft--;
            totalGuests += numOfPoeple;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Typing Error, Check rows");
            return;
        }
        
        
        
        String firstName = fname.getText().trim();
        String lastName = lname.getText().trim();

        //date area
        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        long diffInM = 0;
        long diff = 0;

        try {
            var fromDate = from.getDate();
            var untilDate = until.getDate();

            if (untilDate.getTime() - fromDate.getTime() < 0) {
                JOptionPane.showMessageDialog(null, "The check out Date cant be before the arrived date");
                return;
            } else {
                diffInM = Math.abs(untilDate.getTime() - fromDate.getTime());
                diff = TimeUnit.DAYS.convert(diffInM, TimeUnit.MILLISECONDS);
                totalDays.setText(String.valueOf(diff));
                totalprice.setText(Integer.toString(price * (int) diff));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Date Selected");
        }
    
        // Check the available rooms in hotel, by the room types in order, Aims for the rooms to be the closest.
        generator();

        
        //QUERY TO DATABASE
        String query = "insert into clients(first_name,last_name,ID,number_of_poeple,number_of_rooms,payment,start_date,end_date,total_days,adults,childrens,room_numbers,roomsfortwo,roomformorethantwo,suits)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            String startDate = ((JTextField) from.getDateEditor().getUiComponent()).getText();
            String endDate = ((JTextField) until.getDateEditor().getUiComponent()).getText();
            
            PreparedStatement stt = con.prepareStatement(query);
            stt.setString(1, fname.getText());
            stt.setString(2, lname.getText());
            stt.setString(3, idpass.getText());
            stt.setString(4, nop.getText());
            stt.setString(5, nor.getText());
            stt.setString(6, totalprice.getText());
            stt.setString(7, startDate);
            stt.setString(8, endDate);
            stt.setString(9, Integer.toString((int) diff));
            stt.setString(10, edults.getText());
            stt.setString(11, childrens.getText());
            stt.setString(12, Integer.toString(roomnumber[0]));
            stt.setString(13, Integer.toString(roomFor2));
            stt.setString(14, Integer.toString(roomFor2AndChildrens));
            stt.setString(15, Integer.toString(suites));

            if (totalroomsadded >= 1) {
                while (i <= totalroomsadded) {
                    try {
                        PreparedStatement stt2 = con.prepareStatement(query);
                        stt2.setString(1, fname.getText());
                        stt2.setString(2, lname.getText());
                        stt2.setString(3, idpass.getText());
                        stt2.setString(4, addednop.getText());
                        stt2.setString(5, nor.getText());
                        stt2.setString(6, totalprice.getText());
                        stt2.setString(7, startDate);
                        stt2.setString(8, endDate);
                        stt2.setString(9, Integer.toString((int) diff));
                        stt2.setString(10, addedadults.getText());
                        stt2.setString(11, addedchl.getText());
                        stt2.setString(12, Integer.toString(roomnumber[i]));
                        stt2.setString(13, Integer.toString(roomFor2));
                        stt2.setString(14, Integer.toString(roomFor2AndChildrens));
                        stt2.setString(15, Integer.toString(suites));
                        stt2.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Added!");
                    } catch (Exception ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }

            stt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Succsues!");
        } catch (SQLException ex) {
            Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
        }

        resetForm();
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hosttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hosttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hosttypeActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void roomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomtypeActionPerformed

    private void hotalstatspressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotalstatspressMouseClicked
        try {
            new HotelStats().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hotalstatspressMouseClicked

    private void addroombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addroombtnActionPerformed
        addroomspanel.setVisible(true);
    }//GEN-LAST:event_addroombtnActionPerformed

    private void addedhostypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addedhostypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addedhostypeActionPerformed

    private void addedroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addedroomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addedroomtypeActionPerformed

    private void addroomsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addroomsbtnActionPerformed

        if (checkIfNull() == 1) {
            JOptionPane.showMessageDialog(null, "Insert all reservation deatalis first");
            addroomspanel.setVisible(false);
            return;
        }

        if (checkAddedRoom() == 1) {
            return;
        }

        int toadd = 0;
        int nophas = Integer.parseInt(nop.getText());
        int chlhas = Integer.parseInt(childrens.getText());
        int adlthas = Integer.parseInt(edults.getText());
        int roomHostAdded = addedhostype.getSelectedIndex();
        int roomTypeAdded = addedroomtype.getSelectedIndex();
        addedAdlts += adlthas;
        addedChl += chlhas;

        addroomspanel.setVisible(false);

        if ((!addedadults.getText().isEmpty()) && (!addedchl.getText().isEmpty())) {
            addAdults += Integer.parseInt(addedadults.getText());
            addChildrens += Integer.parseInt(addedchl.getText());
            toadd += addAdults + addChildrens + nophas;
            nop.setText(Integer.toString(toadd));
            childrens.setText(Integer.toString(addChildrens + chlhas));
            edults.setText(Integer.toString(addAdults + adlthas));
            price += checkPrice(nophas, adlthas, chlhas, roomHostAdded, roomTypeAdded);
            totalprice.setText(Integer.toString(price));

            totalroomsadded++;
            nor.setText(Integer.toString(totalroomsadded + 1));
        }
    }//GEN-LAST:event_addroomsbtnActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        addroomspanel.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void totalpriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalpriceFocusLost
        int host = hosttype.getSelectedIndex();
        int numOfPoeple = Integer.parseInt(nop.getText().trim());
        int numOfAdlt = Integer.parseInt(edults.getText().trim());
        int numOfChl = Integer.parseInt(childrens.getText().trim());
        int roomType = roomtype.getSelectedIndex();

        if (checkIfNull() == 0) {

            price += checkPrice(numOfPoeple, numOfAdlt, numOfChl, host, roomType);

        }
        totalprice.setText(Integer.toString(price));
        totalprice.repaint();
    }//GEN-LAST:event_totalpriceFocusLost

    //Genarate Avilable suite number, and check if there is any free room. 
    private void generator() {
        int i = 0;
        while (i <= totalroomsadded) {

            if (i >= 1) {
                if (addedroomtype.getSelectedIndex() == 0) {
                    try {
                        roomnumber[i] = generateRoomNumber(i);
                        if (roomnumber[i] == 0) {
                            return;
                        }
                        roomFor2--;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (addedroomtype.getSelectedIndex() == 1) {
                    try {
                        roomnumber[i] = generateRoomNumber1(i);
                        if (roomnumber[i] == 0) {
                            return;
                        }
                        roomFor2AndChildrens--;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (addedroomtype.getSelectedIndex() == 2) {
                    try {
                        roomnumber[i] = generateRoomNumber2(i);
                        if (roomnumber[i] == 0) {
                            return;
                        }
                        suites--;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if (i == 0) {
                if (roomtype.getSelectedIndex() == 0) {
                    try {
                        roomnumber[i] = generateRoomNumber(i);
                        if (roomnumber[i] == 0) {
                            return;
                        }
                        roomFor2--;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (roomtype.getSelectedIndex() == 1) {
                    try {
                        roomnumber[i] = generateRoomNumber1(i);
                        if (roomnumber[i] == 0) {
                            return;
                        }
                        roomFor2AndChildrens--;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (roomtype.getSelectedIndex() == 2) {
                    try {
                        roomnumber[i] = generateRoomNumber2(i);
                        if (roomnumber[i] == 0) {
                            return;
                        }
                        suites--;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
            i++;
        }

    }

    //Genarate avilable room number for suit room types, if there is not avilavle room left, program will alert for expction.
    
    private int generateRoomNumber2(int ires) throws SQLException {
        int i = 500;
        int roomsArr[] = new int[100]; //100 rooms in hotel
        int n = roomsArr.length;
        int j = 0;
        int emptyArr = 0;

        PreparedStatement st = con.prepareStatement("select *from clients");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {

            if (Integer.parseInt(rs.getString("suits")) == 0) {
                JOptionPane.showMessageDialog(null, "No Rooms Left! ,offer customer another alternative!");
                return 0;
            }

            roomsArr[j] = Integer.parseInt(rs.getString("room_numbers"));
            j++;
        }
// sorting the array of room numbers has already taken, using Bubble Sort.
        int temp = 0;
        for (int x = 0; x < n; x++) {  //Sorting the array with Bubble Sort
            for (int y = 1; y < (n - x); y++) {
                if (roomsArr[y - 1] > roomsArr[y]) {
                    //Swap elements  
                    temp = roomsArr[y - 1];
                    roomsArr[y - 1] = roomsArr[y];
                    roomsArr[y] = temp;
                }

            }
        }

        j = 0;

        if (roomsArr[n - 1] == 0) {
            emptyArr = 1;
        }

        while (i <= 510 && ires == 0) {

            while (j < n) {

                if (i == 510 && roomsArr[j] == 510) {
                    JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                    return 0;
                }

                if (emptyArr == 1) {
                    return i;
                }

                if (j == n - 1 && roomsArr[j] < 500) {
                    i = 500;
                    return i;
                }

                if ((i != roomsArr[j]) && (roomsArr[j] != 0) && (roomsArr[j] >= 500 && roomsArr[j] <= 510)) {
                    System.out.println(i);
                    System.out.println(Arrays.toString(roomsArr));

                    return i;
                }
                if ((i == roomsArr[j]) && roomsArr[j] != 0) {
                    i++;
                }

                j++;
            }

            j = 0;

        }
        i = 500;
        j = 0;
        while (i <= 510 && ires > 0) {

            while (j < n) {

                if (i == 510 && roomsArr[j] == 510) {
                    JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                    return 0;
                }

                if (emptyArr == 1) {
                    return i;
                }

                if (j == n - 1 && roomnumber[ires - 1] == 500) {
                    i = 501;
                    return i;
                }

                if (i == roomnumber[ires - 1]) {
                    i++;
                }

                if ((i != roomsArr[j]) && (roomsArr[j] != 0) && (roomsArr[j] >= 500 && roomsArr[j] <= 510)) {
                    System.out.println(i);
                    System.out.println(Arrays.toString(roomsArr));

                    return i;
                }
                if ((i == roomsArr[j]) || (i == roomnumber[ires - 1]) && roomsArr[j] != 0) {
                    i++;
                }

                j++;
            }

            j = 0;

        }

        return i;
    }

//Genarate Avilable Room for two and more number, and check if there is any free room. 
    private int generateRoomNumber1(int ires) throws SQLException {
        int i = 300;
        int roomsArr[] = new int[100]; //100 rooms in hotel
        int n = roomsArr.length;
        int j = 0;
        int emptyArr = 0;

        PreparedStatement st = con.prepareStatement("select * from clients");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {

            if (Integer.parseInt(rs.getString("roomformorethantwo")) == 0) {
                JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                return 0;
            }

            roomsArr[j] = Integer.parseInt(rs.getString("room_numbers"));
            j++;
        }
// sorting the array of room numbers has already taken, using Bubble Sort.
        int temp = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 1; y < (n - x); y++) {
                if (roomsArr[y - 1] > roomsArr[y]) {
                    //swap elements  
                    temp = roomsArr[y - 1];
                    roomsArr[y - 1] = roomsArr[y];
                    roomsArr[y] = temp;
                }

            }
        }

        j = 0;

        if (roomsArr[n - 1] == 0) {
            emptyArr = 1;
        }

        while (i <= 350 && ires == 0) {

            while (j < n) {

                if (i == 350 && roomsArr[j] == 350) {
                    JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                    return 0;
                }

                if (emptyArr == 1) {
                    return i;
                }

                if (j == n - 1 && roomsArr[j] < 300) {
                    i = 300;
                    return i;
                }

                if ((i != roomsArr[j]) && (roomsArr[j] != 0) && (roomsArr[j] >= 300 && roomsArr[j] <= 350)) {
                    System.out.println(i);
                    System.out.println(Arrays.toString(roomsArr));

                    return i;
                }
                if ((i == roomsArr[j]) && roomsArr[j] != 0) {
                    i++;
                }

                j++;
            }

            j = 0;

        }
        i = 300;
        j = 0;
        while (i <= 350 && ires > 0) {

            while (j < n) {

                if (i == 350 && roomsArr[j] == 350) {
                    JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                    return 0;
                }

                if (emptyArr == 1) {
                    return i;
                }

                if (j == n - 1 && roomnumber[ires - 1] == 300) {
                    i = 301;
                    return i;
                }

                if (i == roomnumber[ires - 1]) {
                    i++;
                }

                if ((i != roomsArr[j]) && (roomsArr[j] != 0) && (roomsArr[j] >= 300 && roomsArr[j] <= 350)) {
                    System.out.println(i);
                    System.out.println(Arrays.toString(roomsArr));

                    return i;
                }
                if ((i == roomsArr[j]) || (i == roomnumber[ires - 1]) && roomsArr[j] != 0) {
                    i++;
                }

                j++;
            }

            j = 0;

        }

        return i;
    }

    //Genarate Avilable Room for maximum 3 people, and check if there is any free room. 
    private int generateRoomNumber(int ires) throws SQLException {
        int i = 200;
        int roomsArr[] = new int[100]; //100 rooms in hotel
        int n = roomsArr.length;
        int j = 0;

        PreparedStatement st = con.prepareStatement("select *from clients");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            if (Integer.parseInt(rs.getString("roomsfortwo")) == 0) {
                JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                return 0;
            }
            roomsArr[j] = Integer.parseInt(rs.getString("room_numbers"));
            j++;
        }

        // sorting the array of room numbers has already taken, using Bubble Sort.
        
        int temp = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 1; y < (n - x); y++) {
                if (roomsArr[y - 1] > roomsArr[y]) {
                    //swap elements  
                    temp = roomsArr[y - 1];
                    roomsArr[y - 1] = roomsArr[y];
                    roomsArr[y] = temp;
                }

            }
        }

        while (i <= 240 && ires == 0) {

            while (j < n) {

                if (i == 240 && roomsArr[j] == 240) {
                    JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                    return 0;
                }

                if (j == n - 1 && roomsArr[j] < 200) {
                    i = 200;
                    return i;
                }

                if ((i != roomsArr[j]) && roomsArr[j] != 0) {
                    System.out.println(i);
                    System.out.println(Arrays.toString(roomsArr));

                    return i;
                }
                if ((i == roomsArr[j]) && roomsArr[j] != 0) {
                    ++i;
                }

                j++;
            }

            j = 0;

        }
        System.out.println("in the 0" + roomnumber[0]);
        i = 200;
        j = 0;
        while (i <= 240 && ires > 0) {

            while (j < n) {

                if (i == 240 && roomsArr[j] == 240) {
                    JOptionPane.showMessageDialog(null, "No Rooms Left!,offer customer another alternative!");
                    return 0;
                }

                if (j == n - 1 && roomnumber[ires - 1] == 200) {
                    i = 201;
                    System.out.println(i);
                    System.out.println(Arrays.toString(roomsArr));
                    return i;
                }

                if (i == roomnumber[ires - 1]) {
                    i++;
                }

                if ((i != roomsArr[j]) && roomsArr[j] != 0) {
                    System.out.println("added:" + i);
                    System.out.println(Arrays.toString(roomsArr));

                    return i;
                }
                if ((i == roomsArr[j]) || (i == roomnumber[ires - 1]) && roomsArr[j] != 0) {
                    i++;
                }

                j++;

            }

            j = 0;

        }

        return i;
    }

    private int checkAddedRoom() {

        if (addedadults.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Number of adults filed");
            return 1;
        }
        if (addedchl.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Number of adults filed");
            return 1;
        }
        if (addednop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Number of adults filed");
            return 1;
        }

        if (addedroomtype.getSelectedIndex() == 0 && Integer.parseInt(addedchl.getText()) > 1) {
            JOptionPane.showMessageDialog(null, "Cant be more than one childers in this room type");
            return 1;
        }
        if (addedroomtype.getSelectedIndex() == 0 && Integer.parseInt(addedadults.getText()) > 3) {
            JOptionPane.showMessageDialog(null, "Cant be more than three adults in this room type");
            return 1;
        }
        if ((addedroomtype.getSelectedIndex() == 1 || addedroomtype.getSelectedIndex() == 2) && Integer.parseInt(addedchl.getText()) > 3) {
            JOptionPane.showMessageDialog(null, "Cant be more than three childers in this room type");
            return 1;
        }
        if (addedroomtype.getSelectedIndex() == 2 && ((Integer.parseInt(addedchl.getText()) + (Integer.parseInt(addedadults.getText())))) > 5) {
            JOptionPane.showMessageDialog(null, "Cant be more than five people in this room type");
            return 1;
        }
        if ((Integer.parseInt(addednop.getText())) != ((Integer.parseInt(addedchl.getText()) + (Integer.parseInt(addedadults.getText()))))) {
            JOptionPane.showMessageDialog(null, "People Arrngement incorrent");

            return 1;
        }
        return 0;
    }

    private int checkPrice(int numOfPoeple, int numOfAdlt, int numOfChl, int host, int typeofroom) {
        int price;

        if (host == 0 && typeofroom == 0) {
            int priceForAdult = 250;
            price = (numOfAdlt * priceForAdult);
        } else if (host == 0 && typeofroom == 1) {
            int priceForAdult = 350;
            int priceForChl = 200;
            price = ((numOfAdlt * priceForAdult) + (numOfChl * priceForChl));
        } else if (host == 0 && typeofroom == 2) {
            int priceForAdult = 500;
            int priceForChl = 300;
            price = ((numOfAdlt * priceForAdult) + (numOfChl * priceForChl));
        } else if (host == 1 && typeofroom == 0) {
            int priceForAdult = 500;
            roomFor2--;
            price = (numOfAdlt * priceForAdult);
        } else if (host == 1 && typeofroom == 1) {
            int priceForAdult = 500;
            int priceForChl = 300;
            price = ((numOfAdlt * priceForAdult) + (numOfChl * priceForChl));
        } else {
            int priceForAdult = 650;
            int priceForChl = 400;
            price = ((numOfAdlt * priceForAdult) + (numOfChl * priceForChl));
        }

        return price;
    }

    private int checkData() {

        String idorp = idpass.getText();
        if (idorp != null && !idorp.isEmpty()) {
            for (char c : idorp.toCharArray()) {
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(null, "ID or Passport can not contains characters.");
                    return 1;
                }
            }
        }
        if (childrens.getText().length() > 1) {
            JOptionPane.showMessageDialog(null, "Unvaible number of childrens filed");
            return 1;
        }
        char ch1 = childrens.getText().charAt(0);
        int ch1int = (int) ch1;
        if (ch1int < 48 || ch1int > 57) {
            JOptionPane.showMessageDialog(null, "must be a number in childern filed");
            return 1;
        }

        if (edults.getText().length() > 1) {
            JOptionPane.showMessageDialog(null, "Unvaible number of Adults filed");
            return 1;
        }
        char ch2 = edults.getText().charAt(0);
        int ch1int2 = (int) ch1;
        if (ch1int < 48 || ch1int > 57) {
            JOptionPane.showMessageDialog(null, "must be a number in Adults filed");
            return 1;
        }

        if ((Integer.parseInt(nop.getText())) != ((Integer.parseInt(childrens.getText()) + (Integer.parseInt(edults.getText()))))) {
            JOptionPane.showMessageDialog(null, "People Arrngement incorrent");
            return 1;
        }

        if (lname.getText().length() < 2) {
            JOptionPane.showMessageDialog(null, "Too short last name");
            return 1;
        }

        if (idpass.getText().length() != 7 && idorpasscombo.getSelectedIndex() == 1) {
            JOptionPane.showMessageDialog(null, "Invalid Passport number, Passport contains 7 digits.");
            return 1;
        }

        if (idpass.getText().length() != 9 && idorpasscombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Invalid ID, ID contains 9 digits.");
            return 1;
        }

        if (roomtype.getSelectedIndex() == 0 && Integer.parseInt(childrens.getText()) > 1) {
            JOptionPane.showMessageDialog(null, "Cant be more than one childers in this room type");
            return 1;
        }
        if (roomtype.getSelectedIndex() == 0 && Integer.parseInt(edults.getText()) > 3) {
            JOptionPane.showMessageDialog(null, "Cant be more than three adults in this room type");
            return 1;
        }
        if ((roomtype.getSelectedIndex() == 1 || roomtype.getSelectedIndex() == 2) && Integer.parseInt(childrens.getText()) > 3) {
            JOptionPane.showMessageDialog(null, "Cant be more than three childers in this room type");
            return 1;
        }
        if (roomtype.getSelectedIndex() == 2 && ((Integer.parseInt(childrens.getText()) + (Integer.parseInt(edults.getText()))) ) > 5) {
            JOptionPane.showMessageDialog(null, "Cant be more than five people in this room type");
            return 1;
        }

        if (roomtype.getSelectedIndex() == 1 && ((Integer.parseInt(childrens.getText()) + (Integer.parseInt(edults.getText())))) > 5) {
            JOptionPane.showMessageDialog(null, "Cant be more than five people in this room type");
            return 1;
        }

        if (roomtype.getSelectedIndex() == 0 && ((Integer.parseInt(childrens.getText()) + (Integer.parseInt(edults.getText())))) > 3) {
            JOptionPane.showMessageDialog(null, "Cant be more than 3 people in this room type");
            return 1;
        }

        return 0;
    }

    private int checkIfNull() {
        if (fname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty ID or Passport filed");
            return 1;
        }

        if (lname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty ID or Passport filed");
            return 1;
        }

        if (idpass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty ID or Passport filed");
            return 1;
        }

        if (nop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Number of poeple filed");
            return 1;
        }

        if (edults.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Number of adults filed");
            return 1;
        }

        if (childrens.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Number of children filed");
            return 1;
        }
        return 0;
    }

    
    private void resetForm() {
        idpass.setText(null);
        nop.setText(null);
        nor.setText(null);
        edults.setText(null);
        childrens.setText(null);
        fname.setText(null);
        lname.setText(null);
        hosttype.setSelectedIndex(0);
        from.setDate(null);
        until.setDate(null);
        totalDays.setText(null);
        totalprice.setText(null);
        roomtype.setSelectedIndex(0);
        addedadults.setText(null);
        addedchl.setText(null);
        addednop.setText(null);
        addedhostype.setSelectedIndex(0);
        addedroomtype.setSelectedIndex(0);
        
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewRes().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(NewRes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addedadults;
    private javax.swing.JTextField addedchl;
    private javax.swing.JComboBox<String> addedhostype;
    private javax.swing.JTextField addednop;
    private javax.swing.JComboBox<String> addedroomtype;
    private javax.swing.JButton addroombtn;
    private javax.swing.JButton addroomsbtn;
    private javax.swing.JPanel addroomspanel;
    private javax.swing.JTextField childrens;
    private javax.swing.JTextField edults;
    private javax.swing.JTextField fname;
    private com.toedter.calendar.JDateChooser from;
    private javax.swing.JComboBox<String> hosttype;
    private javax.swing.JLabel hotalstatspress;
    private javax.swing.JComboBox<String> idorpasscombo;
    private javax.swing.JTextField idpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nop;
    private javax.swing.JTextField nor;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JTextField totalDays;
    private javax.swing.JTextField totalprice;
    private com.toedter.calendar.JDateChooser until;
    // End of variables declaration//GEN-END:variables

}
