/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagement;


import hospitalmanagement.DeleteDoctor;
import hospitalmanagement.SearchDoctor;
import hospitalmanagement.UpdateDoctor;
import hospitalmanagement.ViewDoctor;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ajink
 */
public class DoctorDetails extends javax.swing.JFrame {

    

    /**
     * Creates new form DoctorLogin
     */
    public DoctorDetails() {
        initComponents();
        combo();
    }
    String s;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        doctor_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        aadhar_no = new javax.swing.JTextField();
        phonenum = new javax.swing.JTextField();
        leavingdate = new javax.swing.JTextField();
        joiningdate = new javax.swing.JTextField();
        timing = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        days = new javax.swing.JTextField();
        doctoruser = new javax.swing.JTextField();
        doctorpassword = new javax.swing.JPasswordField();
        doctorphoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bloodgroup = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        specialization = new javax.swing.JComboBox<>();
        maritialstatus = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD DOCTORS");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(170, 10, 1200, 89);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Doctor ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 110, 150, 55);
        getContentPane().add(doctor_id);
        doctor_id.setBounds(300, 120, 236, 36);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 220, 60, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Last Name ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 170, 110, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("First Name ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 170, 110, 24);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Blood Group");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 220, 101, 24);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 260, 60, 24);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 300, 70, 24);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Aadhar no.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 330, 90, 24);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("Department");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 260, 120, 24);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Maritial Status");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 370, 120, 24);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("City");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 370, 70, 24);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Joining Date");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(190, 410, 110, 24);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("Leaving Date");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(540, 410, 120, 24);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("Days ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(560, 450, 70, 24);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("Phone No.");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(560, 330, 85, 24);

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("Visit Timing ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(190, 450, 110, 24);

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 204));
        jLabel18.setText("Username");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(880, 480, 100, 24);

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 204));
        jLabel19.setText("Password");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(880, 520, 79, 24);

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        getContentPane().add(age);
        age.setBounds(300, 220, 236, 30);

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname);
        firstname.setBounds(300, 170, 236, 30);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(300, 290, 570, 30);

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(lastname);
        lastname.setBounds(660, 170, 212, 30);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/DOCTORDETAILS (2).png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(6, 27, 150, 150);
        getContentPane().add(aadhar_no);
        aadhar_no.setBounds(300, 330, 230, 30);
        getContentPane().add(phonenum);
        phonenum.setBounds(650, 330, 223, 30);

        leavingdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leavingdateActionPerformed(evt);
            }
        });
        getContentPane().add(leavingdate);
        leavingdate.setBounds(650, 410, 223, 30);
        getContentPane().add(joiningdate);
        joiningdate.setBounds(300, 410, 230, 30);

        timing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timingActionPerformed(evt);
            }
        });
        getContentPane().add(timing);
        timing.setBounds(300, 450, 230, 30);
        getContentPane().add(city);
        city.setBounds(650, 370, 223, 30);
        getContentPane().add(days);
        days.setBounds(650, 450, 223, 31);
        getContentPane().add(doctoruser);
        doctoruser.setBounds(980, 475, 207, 30);
        getContentPane().add(doctorpassword);
        doctorpassword.setBounds(980, 520, 207, 31);

        doctorphoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(doctorphoto);
        doctorphoto.setBounds(930, 160, 260, 260);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Add Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(890, 110, 180, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1080, 110, 110, 40);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(980, 430, 160, 40);

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "A-", "B+", "B-" }));
        getContentPane().add(bloodgroup);
        bloodgroup.setBounds(670, 212, 90, 30);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female", "Other" }));
        getContentPane().add(gender);
        gender.setBounds(300, 260, 110, 22);

        specialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Dentist", "Gynaecologist", "Surgeon", "Carrdiologist", "Physician", "Neurologist", "Orthopedics" }));
        getContentPane().add(specialization);
        specialization.setBounds(670, 260, 140, 22);

        maritialstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Maritial Status", "Single", "Married" }));
        getContentPane().add(maritialstatus);
        maritialstatus.setBounds(310, 370, 170, 22);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ADD (6)_1.png"))); // NOI18N
        jMenu1.setText("Add Doctors");
        jMenu1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenu1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jMenu1AncestorRemoved(evt);
            }
        });
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/removeuser.png"))); // NOI18N
        jMenu2.setText("Delete Doctors");
        jMenu2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenu2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchuser.png"))); // NOI18N
        jMenu3.setText("Search Doctor");
        jMenu3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenu3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updateuser (2).png"))); // NOI18N
        jMenu4.setText("Update Doctors");
        jMenu4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenu4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/viewuser.png"))); // NOI18N
        jMenu5.setText("View Doctors");
        jMenu5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenu5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1231, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void timingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
            PreparedStatement pst = conn.prepareStatement( "insert into doctor"+"(D_id,firstname,lastname,age,bloodgroup,gender,address,Aadhar_no,maritialstatus,city,specialization,phoneno,joiningdate,leavingdate,username,password,doctorphoto,timing,days)"+" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
         
            FileInputStream is = new FileInputStream(new File(s));
           
            
            pst.setString(1,doctor_id.getText());
            pst.setString(2,firstname.getText());
            pst.setString(3,lastname.getText());
            pst.setString(4,age.getText());
            pst.setString(5, (String) bloodgroup.getSelectedItem());
            pst.setString(6, (String) gender.getSelectedItem());
            pst.setString(7,address.getText());
            pst.setString(8,aadhar_no.getText());
            pst.setString(9, (String) maritialstatus.getSelectedItem());
              pst.setString(10,city.getText());
          pst.setString(11, (String) specialization.getSelectedItem());
       
            pst.setString(12,phonenum.getText());
            pst.setString(13,joiningdate.getText());
            pst.setString(14,leavingdate.getText());
            pst.setString(15,doctoruser.getText());
            pst.setString(16,doctorpassword.getText());
            pst.setBinaryStream(17,is,(int)s.length());
            pst.setString(18,timing.getText());
            pst.setString(19,days.getText());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Inserted Sucessfully");
             doctor_id.setText(null);
             doctor_id.setText(null);
            firstname.setText(null);
            lastname.setText(null);
            age.setText(null);
            address.setText(null);
            aadhar_no.setText(null);
           specialization.setSelectedIndex(0);
            phonenum.setText(null);
            joiningdate.setText(null);
            leavingdate.setText(null);
            gender.setSelectedIndex(0);
            bloodgroup.setSelectedIndex(0);
            maritialstatus.setSelectedIndex(0);
            doctorphoto.setIcon(null);
            doctoruser.setText(null);
            doctorpassword.setText(null);
            timing.setText(null);
            days.setText(null);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void leavingdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leavingdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leavingdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            doctorphoto.setIcon(ResizeImage(path ));
            s = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Data");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         doctor_id.setText(null);
             doctor_id.setText(null);
            firstname.setText(null);
            lastname.setText(null);
            age.setText(null);
            address.setText(null);
           aadhar_no.setText(null);
           specialization.setSelectedIndex(0);
            phonenum.setText(null);
            joiningdate.setText(null);
            leavingdate.setText(null);
            gender.setSelectedIndex(0);
            bloodgroup.setSelectedIndex(0);
            maritialstatus.setSelectedIndex(0);
            doctorphoto.setIcon(null);
            doctoruser.setText(null);
            doctorpassword.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
       
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
      
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
   
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenu1AncestorAdded
         
    }//GEN-LAST:event_jMenu1AncestorAdded

    private void jMenu2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenu2AncestorAdded
      
    }//GEN-LAST:event_jMenu2AncestorAdded

    private void jMenu3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenu3AncestorAdded
         
    }//GEN-LAST:event_jMenu3AncestorAdded

    private void jMenu4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenu4AncestorAdded
         
    }//GEN-LAST:event_jMenu4AncestorAdded

    private void jMenu5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenu5AncestorAdded
        
    }//GEN-LAST:event_jMenu5AncestorAdded

    private void jMenu1AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenu1AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1AncestorRemoved

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
       DoctorDetails Dr = new DoctorDetails();
        Dr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
         DeleteDoctor dd1=new DeleteDoctor();
        dd1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        SearchDoctor sd=new SearchDoctor();
        sd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
         UpdateDoctor ud=new UpdateDoctor();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        ViewDoctor vp=new ViewDoctor();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        adminPanel ap=new adminPanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
private void combo(){
    try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3308/hospitalmanagementsystem?useSSL=false","root","ROOT");
           
            PreparedStatement pst = conn.prepareStatement( "SELECT * FROM hospitalmanagementsystem.department");       
             ResultSet rs=pst.executeQuery();
             while(rs.next()){
                 
             
             specialization.addItem(rs.getString("departmentname"));}
              pst.execute();
             
    }                                           
catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());}  
}
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_no;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JTextField city;
    private javax.swing.JTextField days;
    private javax.swing.JTextField doctor_id;
    private javax.swing.JPasswordField doctorpassword;
    private javax.swing.JLabel doctorphoto;
    private javax.swing.JTextField doctoruser;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField joiningdate;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField leavingdate;
    private javax.swing.JComboBox<String> maritialstatus;
    private javax.swing.JTextField phonenum;
    private javax.swing.JComboBox<String> specialization;
    private javax.swing.JTextField timing;
    // End of variables declaration//GEN-END:variables

    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(doctorphoto.getWidth(), doctorphoto.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
}

